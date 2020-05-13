
import javax.swing.JOptionPane;

 
 
public class Principal extends javax.swing.JFrame {

     
    public Principal() {
        initComponents();
    }
     double valor1,valor2;
     String sinal;
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bntNum1 = new javax.swing.JButton();
        bntNum2 = new javax.swing.JButton();
        bntNum3 = new javax.swing.JButton();
        bntNum4 = new javax.swing.JButton();
        bntNum5 = new javax.swing.JButton();
        bntNum6 = new javax.swing.JButton();
        bntNum7 = new javax.swing.JButton();
        bntNum8 = new javax.swing.JButton();
        bntNum9 = new javax.swing.JButton();
        bntDivisao = new javax.swing.JButton();
        bntMultiplicaçao = new javax.swing.JButton();
        bntDiferença = new javax.swing.JButton();
        bntNum0 = new javax.swing.JButton();
        bntIgual = new javax.swing.JButton();
        bntSomar = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLimpar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(290, 340));

        bntNum1.setText("1");
        bntNum1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum1ActionPerformed(evt);
            }
        });

        bntNum2.setText("2");
        bntNum2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum2ActionPerformed(evt);
            }
        });

        bntNum3.setText("3");
        bntNum3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum3ActionPerformed(evt);
            }
        });

        bntNum4.setText("4");
        bntNum4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum4ActionPerformed(evt);
            }
        });

        bntNum5.setText("5");
        bntNum5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum5ActionPerformed(evt);
            }
        });

        bntNum6.setText("6");
        bntNum6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum6ActionPerformed(evt);
            }
        });

        bntNum7.setText("7");
        bntNum7.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bntNum7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum7ActionPerformed(evt);
            }
        });

        bntNum8.setText("8");
        bntNum8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum8ActionPerformed(evt);
            }
        });

        bntNum9.setText("9");
        bntNum9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum9ActionPerformed(evt);
            }
        });

        bntDivisao.setText("/");
        bntDivisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDivisaoActionPerformed(evt);
            }
        });

        bntMultiplicaçao.setText("x");
        bntMultiplicaçao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntMultiplicaçaoActionPerformed(evt);
            }
        });

        bntDiferença.setText("-");
        bntDiferença.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntDiferençaActionPerformed(evt);
            }
        });

        bntNum0.setText("0");
        bntNum0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntNum0ActionPerformed(evt);
            }
        });

        bntIgual.setText("=");
        bntIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntIgualActionPerformed(evt);
            }
        });

        bntSomar.setText("+");
        bntSomar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntSomarActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setText(" ");
        txtResultado.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 51, 51));

        jLabel1.setText("CALCULADORA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnLimpar.setText("CE");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtResultado)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(bntNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)
                                .addComponent(bntNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(bntNum7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(bntNum8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntNum6, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                            .addComponent(bntNum9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(bntDivisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(bntMultiplicaçao, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))))
                .addGap(71, 71, 71))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(bntNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntIgual, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bntNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bntNum2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bntDiferença, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(72, 72, 72))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bntDivisao, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNum7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(bntNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(bntNum8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(1, 1, 1)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bntNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntMultiplicaçao, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bntNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntDiferença, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(bntSomar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bntNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(87, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bntNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum1ActionPerformed
       txtResultado.setText(txtResultado.getText()+ "1");
       
    }//GEN-LAST:event_bntNum1ActionPerformed

    private void bntNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum2ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "2");
    }//GEN-LAST:event_bntNum2ActionPerformed

    private void bntNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum3ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "3");
    }//GEN-LAST:event_bntNum3ActionPerformed

    private void bntNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum5ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "5");
    }//GEN-LAST:event_bntNum5ActionPerformed

    private void bntNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum4ActionPerformed
       txtResultado.setText(txtResultado.getText()+ "4");
    }//GEN-LAST:event_bntNum4ActionPerformed

    private void bntNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum6ActionPerformed
     txtResultado.setText(txtResultado.getText()+ "6");
    }//GEN-LAST:event_bntNum6ActionPerformed

    private void bntNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum7ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "7");
    }//GEN-LAST:event_bntNum7ActionPerformed

    private void bntNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum8ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "8");
    }//GEN-LAST:event_bntNum8ActionPerformed

    private void bntNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum9ActionPerformed
       txtResultado.setText(txtResultado.getText()+ "9");
    }//GEN-LAST:event_bntNum9ActionPerformed

    private void bntDivisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDivisaoActionPerformed
       valor1=Double.parseDouble(txtResultado.getText());
        
       txtResultado.setText("");
       sinal = "divisao";
        
    }//GEN-LAST:event_bntDivisaoActionPerformed

    private void bntMultiplicaçaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntMultiplicaçaoActionPerformed
        valor1=Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "multiplicaçao";
    }//GEN-LAST:event_bntMultiplicaçaoActionPerformed

    private void bntDiferençaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntDiferençaActionPerformed
        valor1=Double.parseDouble(txtResultado.getText());
        
        txtResultado.setText("");
         sinal = "menos";
    }//GEN-LAST:event_bntDiferençaActionPerformed

    private void bntSomarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntSomarActionPerformed
         
        valor1=Double.parseDouble(txtResultado.getText());
        txtResultado.setText("");
        sinal = "soma";
    }//GEN-LAST:event_bntSomarActionPerformed

    private void bntIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntIgualActionPerformed
        valor2=Double.parseDouble(txtResultado.getText());
        if (sinal == "soma"){
            txtResultado.setText(String.valueOf(valor1+valor2));
        }
        if(sinal == "menos"){
            txtResultado.setText(String.valueOf(valor1-valor2));
        }
        if(sinal == "multiplicaçao"){
           txtResultado.setText(String.valueOf(valor1*valor2)); 
        }
        if(sinal == "divisao"){
            if(valor2==0){
           JOptionPane.showMessageDialog(this, "Impossivel dividir por zero","ERRO",JOptionPane.ERROR_MESSAGE);   
          txtResultado.setText(String.valueOf(valor1/valor2)); 
            }
        } 
          
    }//GEN-LAST:event_bntIgualActionPerformed

    private void bntNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntNum0ActionPerformed
        txtResultado.setText(txtResultado.getText()+ "0");
    }//GEN-LAST:event_bntNum0ActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
         txtResultado.setText("");
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bntDiferença;
    private javax.swing.JButton bntDivisao;
    private javax.swing.JButton bntIgual;
    private javax.swing.JButton bntMultiplicaçao;
    private javax.swing.JButton bntNum0;
    private javax.swing.JButton bntNum1;
    private javax.swing.JButton bntNum2;
    private javax.swing.JButton bntNum3;
    private javax.swing.JButton bntNum4;
    private javax.swing.JButton bntNum5;
    private javax.swing.JButton bntNum6;
    private javax.swing.JButton bntNum7;
    private javax.swing.JButton bntNum8;
    private javax.swing.JButton bntNum9;
    private javax.swing.JButton bntSomar;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
