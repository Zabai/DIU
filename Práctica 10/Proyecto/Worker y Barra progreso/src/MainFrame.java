
import java.util.List;
import javax.swing.SwingWorker;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zabai Armas
 */
public class MainFrame extends javax.swing.JFrame {

    private Task work;
    
    public MainFrame() {
        initComponents();
        setLocationRelativeTo(null);
    }
    
    private class Task extends SwingWorker<Void, Integer>{

        @Override
        protected Void doInBackground(){
            boolean looping = true;
            Integer count = 0;
            
            while(looping && !isCancelled()){
                try{
                    Thread.sleep(100);
                }catch(InterruptedException e){}
                count++;
                publish(count);
                if(count >= 100) looping = false;
            }
            
            return null;
        }

        @Override
        protected void process(List<Integer> list) {
            ProgressBar.setValue(list.get(list.size()-1).intValue());
        }
        
        

        @Override
        protected void done() {
            ButtonCancel.setEnabled(false);
            ButtonOK.setEnabled(true);
            LabelInformation.setText("Tarea finalizada");
            Dialog.setCursor(null);
        }
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dialog = new javax.swing.JDialog();
        ProgressBar = new javax.swing.JProgressBar();
        LabelInformation = new javax.swing.JLabel();
        ButtonOK = new javax.swing.JButton();
        ButtonCancel = new javax.swing.JButton();
        LabelAuthor = new javax.swing.JLabel();
        ButtonRunInBG = new javax.swing.JButton();

        Dialog.setTitle("Worker");
        Dialog.setMinimumSize(new java.awt.Dimension(400, 220));
        Dialog.setResizable(false);

        LabelInformation.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelInformation.setText("Información");

        ButtonOK.setText("Aceptar");
        ButtonOK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonOKActionPerformed(evt);
            }
        });

        ButtonCancel.setText("Cancelar");
        ButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DialogLayout = new javax.swing.GroupLayout(Dialog.getContentPane());
        Dialog.getContentPane().setLayout(DialogLayout);
        DialogLayout.setHorizontalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(ButtonOK)
                .addGap(73, 73, 73)
                .addComponent(ButtonCancel)
                .addContainerGap(101, Short.MAX_VALUE))
            .addGroup(DialogLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        DialogLayout.setVerticalGroup(
            DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DialogLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(LabelInformation)
                .addGap(36, 36, 36)
                .addComponent(ProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(DialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonOK)
                    .addComponent(ButtonCancel))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SwingWorker Demo");
        setResizable(false);

        LabelAuthor.setText("Hecho por Zabai Armas Herrera");

        ButtonRunInBG.setText("Ejecutar en segundo plano");
        ButtonRunInBG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonRunInBGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(LabelAuthor)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(ButtonRunInBG, javax.swing.GroupLayout.DEFAULT_SIZE, 236, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addComponent(ButtonRunInBG)
                .addGap(29, 29, 29)
                .addComponent(LabelAuthor)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonRunInBGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonRunInBGActionPerformed
        // TODO add your handling code here:
        Dialog.setLocationRelativeTo(this);
        Dialog.setVisible(true);
        Dialog.setCursor(new java.awt.Cursor(java.awt.Cursor.WAIT_CURSOR));
        
        ButtonOK.setEnabled(false);
        ButtonCancel.setEnabled(true);
        
        LabelInformation.setText("Realizando tarea");
        
        ProgressBar.setValue(0);
        
        work = new Task();
        work.execute();
        
        ButtonRunInBG.setEnabled(false);
    }//GEN-LAST:event_ButtonRunInBGActionPerformed

    private void ButtonOKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonOKActionPerformed
        // TODO add your handling code here:
        Dialog.setVisible(false);
        ButtonRunInBG.setEnabled(true);
    }//GEN-LAST:event_ButtonOKActionPerformed

    private void ButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelActionPerformed
        // TODO add your handling code here:
        work.cancel(true);
        LabelInformation.setText("Tarea cancelada por el usuario");
    }//GEN-LAST:event_ButtonCancelActionPerformed

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
    private javax.swing.JButton ButtonCancel;
    private javax.swing.JButton ButtonOK;
    private javax.swing.JButton ButtonRunInBG;
    private javax.swing.JDialog Dialog;
    private javax.swing.JLabel LabelAuthor;
    private javax.swing.JLabel LabelInformation;
    private javax.swing.JProgressBar ProgressBar;
    // End of variables declaration//GEN-END:variables
}
