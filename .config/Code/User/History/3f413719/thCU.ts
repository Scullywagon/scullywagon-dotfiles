import * as vscode from 'vscode';
import * as fs from 'fs';
import * as path from 'path';

export function activate(context: vscode.ExtensionContext) {

    let disposable = vscode.commands.registerCommand('cpp-project-generator.createProject', async () => {

        // Ask user for project name
        const projectName = await vscode.window.showInputBox({
            placeHolder: "Enter project name"
        });

        if (!projectName) {
            vscode.window.showErrorMessage("Project name is required.");
            return;
        }

        // Ask for project location
        const projectLocation = await vscode.window.showInputBox({
            placeHolder: "Enter project location (e.g., /path/to/project)"
        });

        if (!projectLocation) {
            vscode.window.showErrorMessage("Project location is required.");
            return;
        }

        const projectPath = path.join(projectLocation, projectName);

        // Template structure directory path
        const templateDir = path.join(__dirname, 'template'); // Create a template folder

        // Create project directory
        try {
            fs.mkdirSync(projectPath);

            // Copy template files
            copyTemplateFiles(templateDir, projectPath, projectName);

            vscode.window.showInformationMessage(`Project '${projectName}' created successfully at ${projectPath}`);
        } catch (err) {
            vscode.window.showErrorMessage(`Error creating project: ${err}`);
        }
    });

    context.subscriptions.push(disposable);
}

function copyTemplateFiles(templateDir: string, projectPath: string, projectName: string) {
    // Traverse template directory
    const items = fs.readdirSync(templateDir);

    for (let item of items) {
        const srcPath = path.join(templateDir, item);
        const destPath = path.join(projectPath, item);

        const stats = fs.statSync(srcPath);

        if (stats.isDirectory()) {
            fs.mkdirSync(destPath);
            copyTemplateFiles(srcPath, destPath, projectName); // Recurse into subdirectories
        } else if (stats.isFile()) {
            if (item === 'CMakeLists.txt') {
                // Customize the CMakeLists.txt with project name
                let cmakeContent = fs.readFileSync(srcPath, 'utf8');
                cmakeContent = cmakeContent.replace(/{{PROJECT_NAME}}/g, projectName); // Replace placeholder
                fs.writeFileSync(destPath, cmakeContent);
            } else {
                fs.copyFileSync(srcPath, destPath);
            }
        }
    }
}

export function deactivate() {}
