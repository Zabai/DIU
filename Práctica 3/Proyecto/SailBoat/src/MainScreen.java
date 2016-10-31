
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Entrar
 */
public class MainScreen extends javax.swing.JFrame {

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        this.setLocationRelativeTo(null);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Controls = new javax.swing.JPanel();
        Sail = new javax.swing.JSlider();
        Wheel = new javax.swing.JSlider();
        Viewer = new javax.swing.JPanel();
        Canvas = new GraphicPanel();
        Author = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Controlador de velero");
        setIconImage(new javax.swing.ImageIcon("C:\\Users\\zbrma\\Documents\\Java (Proyectos)\\SailBoat\\images\\row_boat_icon.jpg").getImage());

        Controls.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Controles", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        Sail.setMaximum(90);
        Sail.setMinimum(-90);
        Sail.setToolTipText("Orientación de la vela respecto al eje del barco.");
        Sail.setValue(0);
        Sail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orientación Vela", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Sail.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                SailStateChanged(evt);
            }
        });
        Sail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SailMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SailMouseExited(evt);
            }
        });

        Wheel.setMaximum(90);
        Wheel.setMinimum(-90);
        Wheel.setValue(0);
        Wheel.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Orientación Timón", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));
        Wheel.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                WheelStateChanged(evt);
            }
        });
        Wheel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                WheelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                WheelMouseExited(evt);
            }
        });

        javax.swing.GroupLayout ControlsLayout = new javax.swing.GroupLayout(Controls);
        Controls.setLayout(ControlsLayout);
        ControlsLayout.setHorizontalGroup(
            ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Wheel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Sail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18))
        );
        ControlsLayout.setVerticalGroup(
            ControlsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlsLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(Wheel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Sail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );

        Viewer.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Barco desde vista cenital", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        javax.swing.GroupLayout CanvasLayout = new javax.swing.GroupLayout(Canvas);
        Canvas.setLayout(CanvasLayout);
        CanvasLayout.setHorizontalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        CanvasLayout.setVerticalGroup(
            CanvasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout ViewerLayout = new javax.swing.GroupLayout(Viewer);
        Viewer.setLayout(ViewerLayout);
        ViewerLayout.setHorizontalGroup(
            ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Canvas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        ViewerLayout.setVerticalGroup(
            ViewerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ViewerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Canvas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Author.setText("Hecho por Zabai Armas Herrera");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Controls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Viewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Author))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(Controls, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Viewer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(Author))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SailStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_SailStateChanged
        // TODO add your handling code here:
        Canvas.sailAngle = Sail.getValue() * Math.PI/180;
        Canvas.repaint();
    }//GEN-LAST:event_SailStateChanged

    private void SailMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SailMouseEntered
        // TODO add your handling code here:
        Canvas.sailFocus = true;
        Canvas.repaint();
    }//GEN-LAST:event_SailMouseEntered

    private void SailMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SailMouseExited
        // TODO add your handling code here:
        Canvas.sailFocus = false;
        Canvas.repaint();
    }//GEN-LAST:event_SailMouseExited

    private void WheelStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_WheelStateChanged
        // TODO add your handling code here:
        Canvas.wheelAngle = Wheel.getValue() * Math.PI/180.0;
        Canvas.repaint();
    }//GEN-LAST:event_WheelStateChanged

    private void WheelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WheelMouseEntered
        // TODO add your handling code here:
        Canvas.wheelFocus = true;
        Canvas.repaint();
    }//GEN-LAST:event_WheelMouseEntered

    private void WheelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_WheelMouseExited
       // TODO add your handling code here:
       Canvas.wheelFocus = false;
       Canvas.repaint();
    }//GEN-LAST:event_WheelMouseExited

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
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Author;
    private GraphicPanel Canvas;
    private javax.swing.JPanel Controls;
    private javax.swing.JSlider Sail;
    private javax.swing.JPanel Viewer;
    private javax.swing.JSlider Wheel;
    // End of variables declaration//GEN-END:variables
}
