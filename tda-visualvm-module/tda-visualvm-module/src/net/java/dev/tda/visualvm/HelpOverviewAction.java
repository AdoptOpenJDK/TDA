/*
 * This file is part of TDA - Thread Dump Analysis Tool.
 *
 * TDA is free software; you can redistribute it and/or modify
 * it under the terms of the Lesser GNU General Public License as published by
 * the Free Software Foundation; either version 2.1 of the License, or
 * (at your option) any later version.
 *
 * TDA is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Lesser GNU General Public License for more details.
 *
 * You should have received a copy of the Lesser GNU General Public License
 * along with TDA; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 * $Id: HelpOverviewAction.java,v 1.3 2008-11-21 09:34:11 irockel Exp $
 */
package net.java.dev.tda.visualvm;

import com.pironet.tda.HelpViewer;
import org.openide.util.HelpCtx;
import org.openide.util.NbBundle;
import org.openide.util.actions.CallableSystemAction;

public final class HelpOverviewAction extends CallableSystemAction {

    public void performAction() {
        HelpViewer.show(null);
    }
    
    public String getName() {
        return NbBundle.getMessage(HelpOverviewAction.class, "CTL_HelpOverviewAction");
    }

    @Override
    protected String iconResource() {
        return "net/java/dev/tda/visualvm/resources/help.gif";
    }

    public HelpCtx getHelpCtx() {
        return HelpCtx.DEFAULT_HELP;
    }

    @Override
    protected boolean asynchronous() {
        return false;
    }
}
