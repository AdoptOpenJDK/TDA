package com.pironet.tda.netbeans;

import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class TDAAction extends CallableSystemAction {

    public void performAction() {
        TDATopComponent tc = new TDATopComponent();
        tc.open();
        tc.requestActive();
    }

    public String getName() {
        return NbBundle.getMessage(TDAAction.class, "CTL_TDAAction");
    }

    protected @Override
    String iconResource() {
        return "com/pironet/tda/netbeans/plugin.gif";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    protected @Override
    boolean asynchronous() {
        return false;
    }
}
