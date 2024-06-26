package visao;

import javax.swing.JOptionPane;
import modelo.Ferramenta;

/**
 * Classe responsável pela interface de cadastro de ferramentas.
 */
public class FrmCadastroFerramenta extends javax.swing.JFrame {

    private boolean countNome = true, countMarca = true, countCusto = true;
    private Ferramenta objFerramenta;

    /**
     * Construtor da classe FrmCadastroFerramenta.
     */
    public FrmCadastroFerramenta() {
        initComponents();
        this.objFerramenta = new Ferramenta();
    }    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JTFFerramentaMarca = new javax.swing.JTextField();
        JLCustoAquisicao = new javax.swing.JLabel();
        JTFFerramentaCusto = new javax.swing.JTextField();
        JBCancelar = new javax.swing.JButton();
        JBCadastrar = new javax.swing.JButton();
        JLNome = new javax.swing.JLabel();
        JTFFerramentaNome = new javax.swing.JTextField();
        JLMarca = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Ferramentas");

        JTFFerramentaMarca.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFFerramentaMarca.setText("Digite o Nome da Marca");
        JTFFerramentaMarca.setBorder(null);
        JTFFerramentaMarca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaMarcaMouseClicked(evt);
            }
        });
        JTFFerramentaMarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaMarcaActionPerformed(evt);
            }
        });
        JTFFerramentaMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaMarcaKeyPressed(evt);
            }
        });

        JLCustoAquisicao.setText("Custo:");

        JTFFerramentaCusto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFFerramentaCusto.setText("Digite o Preço da Ferramenta");
        JTFFerramentaCusto.setBorder(null);
        JTFFerramentaCusto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                JTFFerramentaCustoFocusLost(evt);
            }
        });
        JTFFerramentaCusto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaCustoMouseClicked(evt);
            }
        });
        JTFFerramentaCusto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaCustoActionPerformed(evt);
            }
        });
        JTFFerramentaCusto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaCustoKeyPressed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCancelar.setText("Fechar");
        JBCancelar.setBorder(null);
        JBCancelar.setContentAreaFilled(false);
        JBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JBCadastrar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.setBorder(null);
        JBCadastrar.setContentAreaFilled(false);
        JBCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JLNome.setText("Nome:");

        JTFFerramentaNome.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFFerramentaNome.setText("Digite o Nome da Ferramenta");
        JTFFerramentaNome.setBorder(null);
        JTFFerramentaNome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFFerramentaNomeMouseClicked(evt);
            }
        });
        JTFFerramentaNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaNomeActionPerformed(evt);
            }
        });
        JTFFerramentaNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFFerramentaNomeKeyPressed(evt);
            }
        });

        JLMarca.setText("Marca:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramentaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramentaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLCustoAquisicao, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFFerramentaCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(94, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JLNome, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(JTFFerramentaNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(JLMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(JTFFerramentaMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(JLCustoAquisicao)
                .addGap(4, 4, 4)
                .addComponent(JTFFerramentaCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTFFerramentaMarcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaMouseClicked
        if (countMarca == true) {
            JTFFerramentaMarca.setText("");
            countMarca = false;
        }
    }//GEN-LAST:event_JTFFerramentaMarcaMouseClicked

    private void JTFFerramentaMarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaMarcaActionPerformed

    private void JTFFerramentaMarcaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaMarcaKeyPressed
        // TODO add your handling code here:
        if (countMarca == true) {
            JTFFerramentaMarca.setText("");
            countMarca = false;
        }
    }//GEN-LAST:event_JTFFerramentaMarcaKeyPressed

    private void JTFFerramentaCustoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoFocusLost

    private void JTFFerramentaCustoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoMouseClicked
        // TODO add your handling code here:
        if (countCusto == true) {
            JTFFerramentaCusto.setText("");
            countCusto = false;
        }
    }//GEN-LAST:event_JTFFerramentaCustoMouseClicked

    private void JTFFerramentaCustoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaCustoActionPerformed

    private void JTFFerramentaCustoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaCustoKeyPressed
        // TODO add your handling code here:
        if (countCusto == true) {
            JTFFerramentaCusto.setText("");
            countCusto = false;
        }
    }//GEN-LAST:event_JTFFerramentaCustoKeyPressed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            String nome, marca = "";
            double custoAquisicao = 0.0;

            if ("Digite o Nome da Ferramenta".equals(JTFFerramentaNome.getText())) {
                throw new Mensagem("Primeiro escreva o nome da Ferramenta.");
            }

            if ("Digite o Nome da Marca".equals(JTFFerramentaMarca.getText())) {
                throw new Mensagem("Primeiro escreva o nome da Marca.");
            }

            if (this.JTFFerramentaNome.getText().length() < 2) {
                throw new Mensagem("Nome deve conter ao menos 2 caracteres.");
            } else {
                nome = this.JTFFerramentaNome.getText();
            }

            if (this.JTFFerramentaMarca.getText().length() < 2) {
                throw new Mensagem("Marca deve conter ao menos 2 caracteres.");
            } else {
                marca = this.JTFFerramentaMarca.getText();
            }

            if (Double.parseDouble(this.JTFFerramentaCusto.getText()) <= 0) {
                throw new Mensagem("Custo da Aquisição deve ser maior que zero.");
            } else {
                custoAquisicao = Double.parseDouble(this.JTFFerramentaCusto.getText());
            }

            if (this.objFerramenta.inserirFerramenta(nome, marca, custoAquisicao)) {
                JOptionPane.showMessageDialog(rootPane, "Ferramenta Cadastrada com Sucesso!");
                this.JTFFerramentaNome.setText("");
                this.JTFFerramentaMarca.setText("");
                this.JTFFerramentaCusto.setText("");

            }
            System.out.println(this.objFerramenta.getListaFerramentas().toString());
        } catch (Mensagem erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (NumberFormatException erro2) {
            JOptionPane.showMessageDialog(null, "Informe um número válido para o custo da Ferramenta.");
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JTFFerramentaNomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeMouseClicked
        // TODO add your handling code here:
        if (countNome == true) {
            JTFFerramentaNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFFerramentaNomeMouseClicked

    private void JTFFerramentaNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaNomeActionPerformed

    private void JTFFerramentaNomeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFFerramentaNomeKeyPressed
        // TODO add your handling code here:
        if (countNome == true) {
            JTFFerramentaNome.setText("");
            countNome = false;
        }
    }//GEN-LAST:event_JTFFerramentaNomeKeyPressed

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
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroFerramenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroFerramenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JLabel JLCustoAquisicao;
    private javax.swing.JLabel JLMarca;
    private javax.swing.JLabel JLNome;
    private javax.swing.JTextField JTFFerramentaCusto;
    private javax.swing.JTextField JTFFerramentaMarca;
    private javax.swing.JTextField JTFFerramentaNome;
    // End of variables declaration//GEN-END:variables
}
