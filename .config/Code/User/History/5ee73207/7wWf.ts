import * as vscode from 'vscode';
import * as fs from 'fs';
import * as path from 'path';
import * as mkdirp from 'mkdirp';

export function activate(context: vscode.ExtensionContext) {
    let disposable = vscode.commands.registerCommand('cpp-template.createProject', async () => {
        // Ask the user to select the folder where they want the project installed
        const folderUri = await vscode.window.showOpenDialog({
            canSelectFolders: true,
            canSelectFiles: false,
            openLabel: 'Select Folder'
        });

        if (folderUri && folderUri[0]) {
            // Ask the user for the project folder name
            const folderName = await vscode.window.showInputBox({ prompt: 'Enter the project folder name' });

            if (folderName) {
                const projectFolder = path.join(folderUri[0].fsPath, folderName);

                try {
                    // Create the new project folder
                    await mkdirp(projectFolder);

                    // Get the template folder path
                    const templatePath = path.join(context.extensionPath, 'template');

                    // Copy the template files into the new folder
                    await copyTemplate(templatePath, projectFolder);

                    // Open the created folder in VS Code
                    await vscode.commands.executeCommand('vscode.openFolder', vscode.Uri.file(projectFolder));

                    vscode.window.showInformationMessage('C++ Project created and folder opened successfully!');
                } catch (error) {
                    vscode.window.showErrorMessage('Failed to create project: ' + error);
                }
            }
        }
    });

    context.subscriptions.push(disposable);
}

async function copyTemplate(templatePath: string, destinationPath: string) {
    const files = fs.readdirSync(templatePath);

    for (const file of files) {
        const fullTemplatePath = path.join(templatePath, file);
        const fullDestPath = path.join(destinationPath, file);

        if (fs.statSync(fullTemplatePath).isDirectory()) {
            await mkdirp(fullDestPath);
            await copyTemplate(fullTemplatePath, fullDestPath);
        } else {
            fs.copyFileSync(fullTemplatePath, fullDestPath);
        }
    }
}

export function deactivate() {}
