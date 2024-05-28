package visao;

import com.google.protobuf.TextFormat;
import dao.AmigoDAO;
import dao.RepeticaoDAO;
import dao.EmprestimoDAO;
import dao.FerramentaDAO;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Emprestimo;
import modelo.Ferramenta;
import modelo.Data;

public class FrmCadastroEmprestimo extends javax.swing.JFrame {

    private AmigoDAO daoAmg = new AmigoDAO();
    private FerramentaDAO dao = new FerramentaDAO();
    private EmprestimoDAO daoEmp = new EmprestimoDAO();
    private boolean countData = true;
    private Emprestimo objEmprestimo;
    private RepeticaoDAO connect;
    public ArrayList<String> FerSelect = new ArrayList<>();

    public FrmCadastroEmprestimo() {
        initComponents();
        preencherComboBox();
        this.objEmprestimo = new Emprestimo();
        connect = new RepeticaoDAO();
        String data = Data.dataAtual().toString();
        JTFDataEmp.setText(data);
        this.carregaTabelaFerramentas();
    }

    private void preencherComboBox() {
        try {
            String query = "SELECT nome FROM tb_amigos";
            PreparedStatement statement = connect.getConexao().prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                String nome = resultSet.getString("nome");
                JCBAmigo.addItem(nome);
            }

        } catch (SQLException ex) {
            System.out.println("Erro:" + ex);
            // Lidar com exceções adequadamente
        }
    }

    public void carregaTabelaFerramentas() {
        DefaultTableModel modelo = (DefaultTableModel) this.jTable.getModel();
        modelo.setNumRows(0);
        for (Ferramenta a : dao.getFerramentasDisponiveis()) {
            modelo.addRow(new Object[]{
                a.getId(),
                a.getNome()});
        }
    }

    public boolean alterarIdEmpFerramenta() {
        String sql = "UPDATE tb_ferramentas SET id_emprestimo = ? WHERE id_ferramenta = ?";
        try {
            PreparedStatement stmt = connect.getConexao().prepareStatement(sql);

            for (String id : FerSelect) {
                stmt.setInt(1, daoEmp.maiorId());
                stmt.setInt(2, Integer.parseInt(id));
                stmt.execute();
            }
            FerSelect.clear();

            stmt.close();

            return true;

        } catch (SQLException erro) {
            System.out.println("Erro: " + erro);
            throw new RuntimeException(erro);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        JTFDataEmp = new javax.swing.JTextField();
        JCBAmigo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        JTFDataDev = new javax.swing.JTextField();
        JBCadastrar = new javax.swing.JButton();
        JBCancelar = new javax.swing.JButton();
        JTFFerramenta = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JBAdicionar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JTFAmigo = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Data do Empréstimo:");

        JTFDataEmp.setEditable(false);
        JTFDataEmp.setBackground(new java.awt.Color(166, 166, 166));
        JTFDataEmp.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFDataEmp.setForeground(new java.awt.Color(255, 255, 255));
        JTFDataEmp.setBorder(null);

        JCBAmigo.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JCBAmigo.setForeground(new java.awt.Color(0, 0, 0));
        JCBAmigo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecionar" }));
        JCBAmigo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCBAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBAmigoActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Data de Devolução:");

        JTFDataDev.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        JTFDataDev.setForeground(new java.awt.Color(0, 0, 0));
        JTFDataDev.setText("yyyy-MM-dd");
        JTFDataDev.setBorder(null);
        JTFDataDev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTFDataDevMouseClicked(evt);
            }
        });
        JTFDataDev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFDataDevActionPerformed(evt);
            }
        });
        JTFDataDev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                JTFDataDevKeyPressed(evt);
            }
        });

        JBCadastrar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBCadastrar.setForeground(new java.awt.Color(0, 0, 0));
        JBCadastrar.setText("Cadastrar");
        JBCadastrar.setBorder(null);
        JBCadastrar.setContentAreaFilled(false);
        JBCadastrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCadastrarActionPerformed(evt);
            }
        });

        JBCancelar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBCancelar.setForeground(new java.awt.Color(0, 0, 0));
        JBCancelar.setText("Fechar");
        JBCancelar.setBorder(null);
        JBCancelar.setContentAreaFilled(false);
        JBCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCancelarActionPerformed(evt);
            }
        });

        JTFFerramenta.setEditable(false);
        JTFFerramenta.setBackground(new java.awt.Color(166, 166, 166));
        JTFFerramenta.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTFFerramenta.setForeground(new java.awt.Color(255, 255, 255));
        JTFFerramenta.setBorder(null);
        JTFFerramenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFFerramentaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Ferramentas:");

        JBAdicionar.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        JBAdicionar.setForeground(new java.awt.Color(0, 0, 0));
        JBAdicionar.setText("Adicionar");
        JBAdicionar.setBorder(null);
        JBAdicionar.setContentAreaFilled(false);
        JBAdicionar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAdicionarActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Amigo:");

        JTFAmigo.setEditable(false);
        JTFAmigo.setBackground(new java.awt.Color(166, 166, 166));
        JTFAmigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        JTFAmigo.setForeground(new java.awt.Color(255, 255, 255));
        JTFAmigo.setBorder(null);
        JTFAmigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFAmigoActionPerformed(evt);
            }
        });

        jScrollPane3.setBorder(null);

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Ferramenta"
            }
        ));
        jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(1, 1, 1)
                                        .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(JTFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(JTFDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(30, 30, 30)
                                            .addComponent(JTFDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(40, 40, 40)
                                            .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(82, 82, 82)))
                                .addGap(89, 89, 89))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(169, 169, 169))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JCBAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(JTFAmigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFDataEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(JTFDataDev, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JBCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JBCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(JTFFerramenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(JBAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JCBAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBAmigoActionPerformed
        // TODO add your handling code here
        String nomeSelecionado = (String) JCBAmigo.getSelectedItem();
        JTFAmigo.setText(nomeSelecionado);
    }//GEN-LAST:event_JCBAmigoActionPerformed

    private void JTFDataDevMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTFDataDevMouseClicked
        // TODO add your handling code here:
        if (countData == true) {
            JTFDataDev.setText("");
            countData = false;
        }
    }//GEN-LAST:event_JTFDataDevMouseClicked

    private void JTFDataDevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFDataDevActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFDataDevActionPerformed

    private void JTFDataDevKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFDataDevKeyPressed
        // TODO add your handling code here:
        if (countData == true) {
            JTFDataDev.setText("");
            countData = false;
        }
    }//GEN-LAST:event_JTFDataDevKeyPressed

    private void JBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCadastrarActionPerformed
        // TODO add your handling code here:
        try {
            String regex = "\\d{4}-\\d{2}-\\d{2}";
            int idAmg = 0;
            Date dataEmprestimo = Data.dataAtual();
            boolean entregue = false;
            Date dataDevolucao = null;

            if ("".equals(this.JTFAmigo.getText())) {
                throw new Mensagens("Primeiro selecione um Amigo.");
            } else {
                idAmg = AmigoDAO.getIdPeloNome(JTFAmigo.getText());
                boolean Ver = daoAmg.verificarPendencia(idAmg);
                if (Ver == true) {
                    int respostaUsuario = JOptionPane.showConfirmDialog(null, "Esse amigo tem empréstimos pendentes deseja continuar?");

                    if (respostaUsuario != 0) {
                        return;
                    }
                }
            }

            if (FerSelect.size() == 0) {
                throw new Mensagens("Primeiro selecione pelo menos uma Ferramenta");
            }

            if (this.JTFDataDev.getText().matches(regex)) {
                dataDevolucao = Data.stringParaDateSQL(JTFDataDev.getText());
                if (dataDevolucao.before(dataEmprestimo)) {
                    dataDevolucao = null;
                    throw new Mensagens("Data de Devolução não pode ser antes da Data do Empréstimo");

                } else if (dataDevolucao.after(dataEmprestimo)) {
                    dataDevolucao = Data.stringParaDateSQL(JTFDataDev.getText());
                } else {
                    dataDevolucao = null;
                    throw new Mensagens("Data de Devolução não pode ser igual a da Data do Empréstimo");
                }
            } else {
                throw new Mensagens("Data de Devolução deve conter o seguite formato:\nyyyy-MM-dd");
            }

            if (this.objEmprestimo.inserirEmprestimo(dataEmprestimo, dataDevolucao, entregue, idAmg)) {
                JOptionPane.showMessageDialog(rootPane, "Empréstimo Cadastrado com Sucesso!");
                this.JTFAmigo.setText("");
                this.JTFFerramenta.setText("");
                this.JTFDataDev.setText("");

            }

            alterarIdEmpFerramenta();
            //System.out.println(this.objEmprestimo.getListaFerramentas().toString());
        } catch (Mensagens erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
        } catch (TextFormat.ParseException ex) {
            Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } catch (java.text.ParseException ex) {
            Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            carregaTabelaFerramentas();
        }
    }//GEN-LAST:event_JBCadastrarActionPerformed

    private void JBCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_JBCancelarActionPerformed

    private void JTFFerramentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFFerramentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFFerramentaActionPerformed

    private void JBAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAdicionarActionPerformed
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Primeiro Selecione uma Ferramenta");
        } else {
            if (this.jTable.getSelectedRow() != -1) {
                String id = this.jTable.getValueAt(this.jTable.getSelectedRow(), 0).toString();
                if (!FerSelect.contains(id)) { // Verifica se o número já está na lista
                    FerSelect.add(id);
                    System.out.println("Selecionados: " + FerSelect);
                    JOptionPane.showMessageDialog(null, "Ferramenta adicionada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Essa Ferramenta já foi adicionada!");
                }
            }
        }
    }//GEN-LAST:event_JBAdicionarActionPerformed

    private void JTFAmigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFAmigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFAmigoActionPerformed

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMouseClicked
        // TODO add your handling code here:
        if (this.jTable.getSelectedRow() != -1) {
            String nome = this.jTable.getValueAt(this.jTable.getSelectedRow(), 1).toString();
            this.JTFFerramenta.setText(nome);
        }
    }//GEN-LAST:event_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCadastroEmprestimo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCadastroEmprestimo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAdicionar;
    private javax.swing.JButton JBCadastrar;
    private javax.swing.JButton JBCancelar;
    private javax.swing.JComboBox<String> JCBAmigo;
    private javax.swing.JTextField JTFAmigo;
    private javax.swing.JTextField JTFDataDev;
    private javax.swing.JTextField JTFDataEmp;
    private javax.swing.JTextField JTFFerramenta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable;
    // End of variables declaration//GEN-END:variables
}
