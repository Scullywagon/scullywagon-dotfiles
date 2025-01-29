import * as vscode from 'vscode';
import * as fs from 'fs';
import * as path from 'path';
import * as mkdirp from 'mkdirp';

export function activate(context: vscode.ExtensionContext) {
    let disposable = vscode.commands.registerCommand('cpp-template.createProject', async () => {
        const folderName = await vscode.window.showInputBox({ prompt: 'Enter the project folder name' });

        if (folderName) {
            const projectFolder = path.join(vscode.workspace.rootPath || '', folderName);
            
            try {
                // Create the new project folder
                await mkdirp(projectFolder);
                
                // Get the template folder path
                const templatePath = path.join(context.extensionPath, 'templates');
                
                // Copy the template files into the new folder
                await copyTemplate(templatePath, projectFolder);
                
                vscode.window.showInformationMessage('C++ Project created successfully!');
            } catch (error) {
                vscode.window.showErrorMessage('Failed to create project: ' + error);
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
