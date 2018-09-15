/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import javax.swing.JOptionPane;

public class ViewMessage extends javax.swing.JFrame {

    
    public ViewMessage() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jL_escribir_estatura = new javax.swing.JLabel();
        jL_escribir_peso = new javax.swing.JLabel();
        jTF_estatura = new javax.swing.JTextField();
        jTF_peso = new javax.swing.JTextField();
        jB_calcular = new javax.swing.JButton();
        jL_imc_es = new javax.swing.JLabel();
        jL_imc_tiene = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 255, 51));

        jL_escribir_estatura.setText("Escriba su estatura:");

        jL_escribir_peso.setText("Escriba su peso:");

        jTF_estatura.setText("0.0");
        jTF_estatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_estaturaActionPerformed(evt);
            }
        });
        jTF_estatura.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_estaturaKeyTyped(evt);
            }
        });

        jTF_peso.setText("0.0");
        jTF_peso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTF_pesoActionPerformed(evt);
            }
        });
        jTF_peso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTF_pesoKeyTyped(evt);
            }
        });

        jB_calcular.setBackground(new java.awt.Color(0, 204, 0));
        jB_calcular.setForeground(new java.awt.Color(255, 255, 255));
        jB_calcular.setText("Calcular mi IMC");
        jB_calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_calcularActionPerformed(evt);
            }
        });

        jL_imc_es.setText("Su IMC es:");

        jL_imc_tiene.setText("De acuerdo con el IMC, tiene:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jL_escribir_estatura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jL_escribir_peso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_estatura, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                            .addComponent(jTF_peso)))
                    .addComponent(jL_imc_es, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jL_imc_tiene, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jB_calcular)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_escribir_estatura)
                    .addComponent(jTF_estatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jL_escribir_peso)
                    .addComponent(jTF_peso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jB_calcular)
                .addGap(18, 18, 18)
                .addComponent(jL_imc_es)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_imc_tiene)
                .addContainerGap(64, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jTF_pesoActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

    private void jB_calcularActionPerformed(java.awt.event.ActionEvent evt) {                                            
        
    }                                           

    private void jTF_estaturaActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
    }                                            

    private void jTF_estaturaKeyTyped(java.awt.event.KeyEvent evt) {                                      
        char validar = evt.getKeyChar();
            
            if(Character.isLetter(validar)){
                getToolkit().beep();
                evt.consume(); 
            JOptionPane.showMessageDialog(this, "¡No se Puede Introducir Letras, solo Números!");
        
        }
    }                                     

    private void jTF_pesoKeyTyped(java.awt.event.KeyEvent evt) {                                  
        char validar = evt.getKeyChar();
            
            if(Character.isLetter(validar)){
                getToolkit().beep();
                evt.consume();
            JOptionPane.showMessageDialog(this, "¡No se Puede Introducir Letras, solo Números!");
           
        }
    }                                 

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
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMessage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMessage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public javax.swing.JButton jB_calcular;
    public javax.swing.JLabel jL_escribir_estatura;
    public javax.swing.JLabel jL_escribir_peso;
    public javax.swing.JLabel jL_imc_es;
    public javax.swing.JLabel jL_imc_tiene;
    public javax.swing.JTextField jTF_estatura;
    public javax.swing.JTextField jTF_peso;
    // End of variables declaration                   
}
