import * as vscode from 'vscode';
import * as fs from 'fs';
import * as path from 'path';
import { mkdirp } from 'mkdirp';

export function activate(context: vscode.ExtensionContext) {
    let disposable = vscode.commands.registerCommand('cpp-template.createProject', async () => {
        const folderName = await vscode.window.showInputBox({ prompt: 'Enter the project folder name' });

        if (folderName) {
            // Get the workspace folder path (ensure it's there)
            const workspaceFolder = vscode.workspace.workspaceFolders ? vscode.workspace.workspaceFolders[0].uri.fsPath : '';
            const projectFolder = path.join(workspaceFolder, folderName);

            try {
                // Create the new project folder
                await mkdirp(projectFolder);  // mkdirp v3.x.x returns a Promise

                // Get the template folder path
                const templatePath = path.join(context.extensionPath, 'template');

                // Check if the template folder exists
                if (!fs.existsSync(templatePath)) {
                    vscode.window.showErrorMessage('Template folder not found!');
                    return;
                }

                // Copy the template files into the new folder
                await copyTemplate(templatePath, projectFolder);

                vscode.window.showInformationMessage('C++ Project created successfully!');
            } catch (error) {
                vscode.window.showErrorMessage('Failed to create project: ' + error.message);
            }
        }
    });

    context.subscriptions.push(disposable);
}

async function copyTemplate(templatePath: string, destinationPath: string) {
    const files = await fs.promises.readdir(templatePath);

    for (const file of files) {
        const fullTemplatePath = path.join(templatePath, file);
        const fullDestPath = path.join(destinationPath, file);

        const stat = await fs.promises.stat(fullTemplatePath);

        if (stat.isDirectory()) {
            // Create the directory if it doesn't exist
            await mkdirp(fullDestPath);  // mkdirp v3.x.x works directly with await
            await copyTemplate(fullTemplatePath, fullDestPath);  // Recursively copy files
        } else {
            // Copy the file
            await fs.promises.copyFile(fullTemplatePath, fullDestPath);
        }
    }
}

export function deactivate() {}
