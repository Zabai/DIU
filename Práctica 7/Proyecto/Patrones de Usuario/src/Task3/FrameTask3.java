/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Task3;

import Task1.ImageFilter;
import Task1.ImageViewer;
import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.JInternalFrame;

/**
 *
 * @author Zabai Armas
 */
public class FrameTask3 extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public FrameTask3() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        MenuFile = new javax.swing.JMenu();
        ItemOpen = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        ItemExit = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("JDesktopPane Demo");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 338, Short.MAX_VALUE)
        );

        jLabel1.setText("Hecho por Zabai Armas Herrera");

        MenuFile.setText("File");

        ItemOpen.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        ItemOpen.setText("Open");
        ItemOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemOpenActionPerformed(evt);
            }
        });
        MenuFile.add(ItemOpen);
        MenuFile.add(jSeparator1);

        ItemExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Q, java.awt.event.InputEvent.CTRL_MASK));
        ItemExit.setText("Exit");
        ItemExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ItemExitActionPerformed(evt);
            }
        });
        MenuFile.add(ItemExit);

        MenuBar.add(MenuFile);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 365, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Desktop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ItemOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemOpenActionPerformed
        // TODO add your handling code here:
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(null);
        ImageFilter filter = new ImageFilter();
        fileChooser.addChoosableFileFilter(filter);
        fileChooser.setFileFilter(filter);
        
        int returned = fileChooser.showOpenDialog(this);
        if(returned == JFileChooser.APPROVE_OPTION){
            File file = fileChooser.getSelectedFile();
            if(file != null){
                ImageViewer viewer = new ImageViewer();
                viewer.setImage(file);
                
                JInternalFrame window = new JInternalFrame();
                window.setTitle(file.getName());
                window.setSize(400, 200);
                window.setClosable(true);
                window.setIconifiable(true);
                window.setResizable(true);
                window.setMaximizable(true);
                window.add(viewer);
                window.setVisible(true);
                
                Desktop.add(window);
            }
        }
    }//GEN-LAST:event_ItemOpenActionPerformed

    private void ItemExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ItemExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ItemExitActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenuItem ItemExit;
    private javax.swing.JMenuItem ItemOpen;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenu MenuFile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
