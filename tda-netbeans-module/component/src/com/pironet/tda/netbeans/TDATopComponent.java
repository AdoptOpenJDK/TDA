/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.pironet.tda.netbeans;

import com.pironet.tda.TDA;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.openide.util.NbBundle;
import org.openide.windows.TopComponent;

/**
 *
 * @author irockel
 */
public class TDATopComponent  extends TopComponent implements ActionListener, ChangeListener {
    TDA tdaPanel;
    private static int ct = 0; //A counter you use to provide names for new dump views.

    public TDATopComponent() {

        initComponents();

        String displayName = NbBundle.getMessage(
                TDATopComponent.class,
                "UnsavedFileNameFormat",
                new Object[] { new Integer(ct++) }
        );

        setDisplayName(displayName);

    }

    public void actionPerformed(ActionEvent e) {
    }

    public void stateChanged(ChangeEvent e) {
    }

    @Override
    public int getPersistenceType() {
        return PERSISTENCE_NEVER;
    }

    @Override
    public String preferredID() {
        return "TDA";
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        tdaPanel = new TDA(false);
        tdaPanel.init(false, true);
        
        add(tdaPanel, BorderLayout.CENTER);
    }
}
