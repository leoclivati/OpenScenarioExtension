'use strict';
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
Object.defineProperty(exports, "__esModule", { value: true });
exports.activate = activate;
exports.deactivate = deactivate;
const path = require("path");
const os = require("os");
const vscode_jsonrpc_1 = require("vscode-jsonrpc");
const vscode_1 = require("vscode");
const node_1 = require("vscode-languageclient/node");
let lc;
function activate(context) {
    // The server is a locally installed in src/osc
    let launcher = os.platform() === 'win32' ? 'osc-standalone.bat' : 'osc-standalone';
    let script = context.asAbsolutePath(path.join('src', 'osc', 'bin', launcher));
    let serverOptions = {
        run: { command: script },
        debug: { command: script, args: [], options: { env: createDebugEnv() } }
    };
    let clientOptions = {
        documentSelector: ['osc'],
        synchronize: {
            fileEvents: vscode_1.workspace.createFileSystemWatcher('**/*.*')
        }
    };
    // Create the language client and start the client.
    lc = new node_1.LanguageClient('Xtext Server', serverOptions, clientOptions);
    var disposable2 = vscode_1.commands.registerCommand("osc.a.proxy", () => __awaiter(this, void 0, void 0, function* () {
        let activeEditor = vscode_1.window.activeTextEditor;
        if (!activeEditor || !activeEditor.document || activeEditor.document.languageId !== 'osc') {
            return;
        }
        if (activeEditor.document.uri instanceof vscode_1.Uri) {
            vscode_1.commands.executeCommand("osc.a", activeEditor.document.uri.toString());
        }
    }));
    context.subscriptions.push(disposable2);
    // enable tracing (.Off, .Messages, Verbose)
    lc.setTrace(vscode_jsonrpc_1.Trace.Verbose);
    lc.start();
}
function deactivate() {
    return lc.stop();
}
function createDebugEnv() {
    return Object.assign({
        JAVA_OPTS: "-Xdebug -Xrunjdwp:server=y,transport=dt_socket,address=8000,suspend=n,quiet=y"
    }, process.env);
}
