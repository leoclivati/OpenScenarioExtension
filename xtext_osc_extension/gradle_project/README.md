![Build Status](https://github.com/xtext/xtext-languageserver-example/actions/workflows/build.yml/badge.svg)

## Quickstart

Requires Visual Studio Code (VS Code) with version 1.92.0 or greater to be on the path as `code` and Java 21+ available as `java`.

- Run `./gradlew startCode`

This will start VS Code and after a few seconds load the `demo` folder of this repository.

## Project Structure

- `vscode-osc-extension` (node based VS Code extension to run with a separate server using socket)
- `vscode-osc-extension-self-contained` (node based VS Code extension to run with a embedded server using process io)
- `de.bmwgroup.openscenario.asam` (contains the dsl)
- `de.bmwgroup.openscenario.asam.ide` (contains the dsl specific customizations of the Xtext language server)
- `org.xtext.example.mydsl.tests`

## Building in Details

1. Make sure that `java -version` is executable and pointing to a Java 8+ JDK.
2. Type `code`. If the command is not known, open VS Code and select *View / Command Palette*. Enter `code` and select to install `code` on the path.
1. Run `./gradlew startCode` to build the DSL and the VS Code extensions.

### Scenario 1 (embedded server)

1. Install the self-contained extension into VS Code using
    `code --install-extension vscode-extension-self-contained/build/vscode/vscode-osc-extension-self-contained-0.0.1.vsix`
2. Run a second instance of vscode on the demo folder `code demo`

### Scenario 2 (client-only with separate server process)

1. Run `./gradlew run` or launch RunServer from Eclipse.
2. Open `vscode-extension` in VS Code and `F5` to launch new editor (you may need a Debug -> Start Debugging initally).
1. Open folder `demo` in the new editor.


### Build VS Code Extension Package manually (manually Gradle)

```
npm install -g vsce
cd vscode-extension
vsce package
cd ../vscode-extension-self-contained
vsce package
```
