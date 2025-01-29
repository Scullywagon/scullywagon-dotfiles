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

        // Open folder selection dialog
        const folderUri = await vscode.window.showOpenDialog({
            canSelectFolders: true,
            canSelectFiles: false,
            openLabel: "Select Folder"
        });

        if (!folderUri || folderUri.length === 0) {
            vscode.window.showErrorMessage("Folder location is required.");
            return;
        }

        const projectPath = path.join(folderUri[0].fsPath, projectName);

        // Template structure directory path (relative to the extension's root folder)
        const templateDir = path.join(context.extensionPath, 'template'); // Adjusted path

        // Create project directory
        try {
            fs.mkdirSync(projectPath);

            // Copy template files
            copyTemplateFiles(templateDir, projectPath, projectName);

            vscode.window.showInformationMessage(`Project '${projectName}' created successfully at ${projectPath}`);

            // Open the newly created project folder in the same window
            const newProjectUri = vscode.Uri.file(projectPath);
            await vscode.commands.executeCommand('vscode.openFolder', newProjectUri);

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
                // Customize the CMakeLists.txt with the project name
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



// import * as vscode from 'vscode';
// import * as fs from 'fs';
// import * as path from 'path';

// export function activate(context: vscode.ExtensionContext) {

//     let disposable = vscode.commands.registerCommand('cpp-project-generator.createProject', async () => {

//         // Ask user for project name
//         const projectName = await vscode.window.showInputBox({
//             placeHolder: "Enter project name"
//         });

//         if (!projectName) {
//             vscode.window.showErrorMessage("Project name is required.");
//             return;
//         }

//         // Open folder selection dialog
//         const folderUri = await vscode.window.showOpenDialog({
//             canSelectFolders: true,
//             canSelectFiles: false,
//             openLabel: "Select Folder"
//         });

//         if (!folderUri || folderUri.length === 0) {
//             vscode.window.showErrorMessage("Folder location is required.");
//             return;
//         }

//         const projectPath = path.join(folderUri[0].fsPath, projectName);

//         // Template structure directory path
//         const templateDir = path.join(__dirname, 'template'); // Create a template folder

//         // Create project directory
//         try {
//             fs.mkdirSync(projectPath);

//             // Copy template files
//             copyTemplateFiles(templateDir, projectPath, projectName);

//             vscode.window.showInformationMessage(`Project '${projectName}' created successfully at ${projectPath}`);
//         } catch (err) {
//             vscode.window.showErrorMessage(`Error creating project: ${err}`);
//         }
//     });

//     context.subscriptions.push(disposable);
// }

// function copyTemplateFiles(templateDir: string, projectPath: string, projectName: string) {
//     // Traverse template directory
//     const items = fs.readdirSync(templateDir);

//     for (let item of items) {
//         const srcPath = path.join(templateDir, item);
//         const destPath = path.join(projectPath, item);

//         const stats = fs.statSync(srcPath);

//         if (stats.isDirectory()) {
//             fs.mkdirSync(destPath);
//             copyTemplateFiles(srcPath, destPath, projectName); // Recurse into subdirectories
//         } else if (stats.isFile()) {
//             if (item === 'CMakeLists.txt') {
//                 // Customize the CMakeLists.txt with the project name
//                 let cmakeContent = fs.readFileSync(srcPath, 'utf8');
//                 cmakeContent = cmakeContent.replace(/{{PROJECT_NAME}}/g, projectName); // Replace placeholder
//                 fs.writeFileSync(destPath, cmakeContent);
//             } else {
//                 fs.copyFileSync(srcPath, destPath);
//             }
//         }
//     }
// }

// export function deactivate() {}

