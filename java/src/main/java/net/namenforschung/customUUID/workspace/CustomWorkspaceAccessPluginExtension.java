package net.namenforschung.customUUID.workspace;

import ro.sync.exml.plugin.workspace.WorkspaceAccessPluginExtension;
import ro.sync.exml.workspace.api.standalone.StandalonePluginWorkspace;

/**
 * Plugin extension - workspace access extension.
 */
public class CustomWorkspaceAccessPluginExtension implements WorkspaceAccessPluginExtension {
    /** UUID resolver */
    private CustomUUIDResolver editorVariablesResolver = new CustomUUIDResolver();

    @Override
    public void applicationStarted(final StandalonePluginWorkspace pluginWorkspaceAccess) {
        //start UUID resolver
        pluginWorkspaceAccess.getUtilAccess().addCustomEditorVariablesResolver(editorVariablesResolver);
    }

    @Override
    public boolean applicationClosing() {
        return true;
    }
}