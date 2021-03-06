
import java.awt.Color;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        originalCol1 = Panel1.getBackground();
        originalCol2 = Panel2.getBackground();
        originalCol3 = Panel3.getBackground();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Author = new javax.swing.JLabel();
        Layers = new javax.swing.JLayeredPane();
        Panel1 = new javax.swing.JPanel();
        Panel2 = new javax.swing.JPanel();
        Panel3 = new javax.swing.JPanel();
        InfoLayer = new javax.swing.JLabel();
        ActiveLayer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manejo de capas");

        Author.setText("Hecho por Zabai Armas Herrera");

        Layers.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "LayeredPane", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP));
        Layers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Panel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 148, Short.MAX_VALUE)
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 153, Short.MAX_VALUE)
        );

        Layers.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 150, -1));

        Panel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Panel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 155, Short.MAX_VALUE)
        );

        Layers.add(Panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 150, -1));

        Panel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        Panel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Panel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                Panel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                Panel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout Panel3Layout = new javax.swing.GroupLayout(Panel3);
        Panel3.setLayout(Panel3Layout);
        Panel3Layout.setHorizontalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 146, Short.MAX_VALUE)
        );
        Panel3Layout.setVerticalGroup(
            Panel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 151, Short.MAX_VALUE)
        );

        Layers.add(Panel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 150, -1));

        InfoLayer.setText("Capa Activa");

        ActiveLayer.setEditable(false);
        ActiveLayer.setText("---");
        ActiveLayer.setFocusable(false);
        ActiveLayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ActiveLayerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Author)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Layers, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(InfoLayer)
                                .addGap(0, 51, Short.MAX_VALUE))
                            .addComponent(ActiveLayer))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Layers, javax.swing.GroupLayout.DEFAULT_SIZE, 355, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(InfoLayer)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ActiveLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(Author)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ActiveLayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ActiveLayerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ActiveLayerActionPerformed

    private void Panel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseClicked
        // TODO add your handling code here:
        Layers.moveToFront(Panel1);
        updateText(Panel1);
    }//GEN-LAST:event_Panel1MouseClicked

    private void Panel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseEntered
        // TODO add your handling code here:
        Panel1.setBackground(Color.RED);
        Layers.setPosition(Panel1, updateText(Panel1));
    }//GEN-LAST:event_Panel1MouseEntered

    private void Panel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel1MouseExited
        // TODO add your handling code here:
        Panel1.setBackground(originalCol1);
        Layers.setPosition(Panel1, updateText(Panel1));
    }//GEN-LAST:event_Panel1MouseExited

    private void Panel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseClicked
        // TODO add your handling code here:
        Layers.moveToFront(Panel2);
        updateText(Panel2);
    }//GEN-LAST:event_Panel2MouseClicked

    private void Panel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseEntered
        // TODO add your handling code here:
        Panel2.setBackground(Color.GREEN);
        Layers.setPosition(Panel2, updateText(Panel2));
    }//GEN-LAST:event_Panel2MouseEntered

    private void Panel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel2MouseExited
        // TODO add your handling code here:
        Panel2.setBackground(originalCol2);
        Layers.setPosition(Panel2, updateText(Panel2));
    }//GEN-LAST:event_Panel2MouseExited

    private void Panel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel3MouseClicked
        // TODO add your handling code here:
        Layers.moveToFront(Panel3);
        updateText(Panel3);
    }//GEN-LAST:event_Panel3MouseClicked

    private void Panel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel3MouseEntered
        // TODO add your handling code here:
        Panel3.setBackground(Color.BLUE);
        Layers.setPosition(Panel3, updateText(Panel3));
    }//GEN-LAST:event_Panel3MouseEntered

    private void Panel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Panel3MouseExited
        // TODO add your handling code here:
        Panel3.setBackground(originalCol3);
        Layers.setPosition(Panel3, updateText(Panel3));
    }//GEN-LAST:event_Panel3MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActiveLayer;
    private javax.swing.JLabel Author;
    private javax.swing.JLabel InfoLayer;
    private javax.swing.JLayeredPane Layers;
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JPanel Panel3;
    // End of variables declaration//GEN-END:variables
    final Color originalCol1, originalCol2, originalCol3;

    private int updateText(JPanel panel){
        int layer = Layers.getPosition(panel);
        ActiveLayer.setText(String.valueOf(layer));
        return layer;
    }
}
