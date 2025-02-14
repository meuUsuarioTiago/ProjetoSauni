package View;

import Dados.Paciente;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import Dados.SistemaDao;

public class CadastroPaciente extends javax.swing.JFrame {

    public CadastroPaciente() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        txtUsuario = new javax.swing.JTextField();
        txtSenha = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtCPF = new javax.swing.JTextField();
        txtTelefone = new javax.swing.JTextField();
        cmbSexo = new javax.swing.JComboBox<>();
        btnConcluir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(30, 60, 70, 20);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 300, 70, 20);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Senha:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(30, 100, 70, 20);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Nome:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(30, 140, 70, 20);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(30, 180, 70, 20);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Sexo:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 220, 70, 20);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Telefone:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(30, 260, 70, 20);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(110, 300, 160, 22);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(110, 60, 160, 22);
        getContentPane().add(txtSenha);
        txtSenha.setBounds(110, 100, 160, 22);
        getContentPane().add(txtNome);
        txtNome.setBounds(110, 140, 160, 22);
        getContentPane().add(txtCPF);
        txtCPF.setBounds(110, 180, 160, 22);
        getContentPane().add(txtTelefone);
        txtTelefone.setBounds(110, 260, 160, 20);

        cmbSexo.setForeground(new java.awt.Color(0, 0, 0));
        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione uma opção", "Masculino", "Feminino", "Outro" }));
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(110, 220, 160, 22);

        btnConcluir.setBackground(new java.awt.Color(19, 148, 205));
        btnConcluir.setForeground(new java.awt.Color(0, 0, 0));
        btnConcluir.setText("Concluir");
        btnConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnConcluir);
        btnConcluir.setBounds(130, 340, 110, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/cadastro paciente.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 577, 420);

        setSize(new java.awt.Dimension(593, 426));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConcluirActionPerformed

        if (txtUsuario.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar um usuário");
            txtUsuario.requestFocus();
            return;
        }

        if (txtSenha.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar uma senha");
            txtSenha.requestFocus();
            return;
        }

        if (txtNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar um nome");
            txtNome.requestFocus();
            return;
        }

        if (txtCPF.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar um CPF");
            txtCPF.requestFocus();
            return;
        }

        if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "É obrigatório digitar um email");
            txtEmail.requestFocus();
            return;
        }

        //Instanciando objeto paciente
        Paciente paciente = new Paciente();

        //Variavel para verificar se a conta já não existe
        String validar;

        //Preenchendo obj com os txt
        paciente.setUsuario(txtUsuario.getText());
        paciente.setSenha(txtSenha.getText());
        paciente.setNome(txtNome.getText());
        paciente.setCpf(txtCPF.getText());
        paciente.setSexo(cmbSexo.getSelectedItem().toString());
        paciente.setTelefone(txtTelefone.getText());
        paciente.setEmail(txtEmail.getText());

        try {

            SistemaDao dao = new SistemaDao();

            //Verificando se a pessoa já não está cadastrada
            validar = dao.validarContaExistente(paciente);

            //Se não estiver com uma conta já criada
            if (validar.equalsIgnoreCase("prosseguir")) {

                //Sexo selecionado
                if (cmbSexo.getSelectedIndex() != 0) {

                    //Cadastrar Paciente
                    dao.cadastrarPaciente(paciente);
                    dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Campo sexo não preenchido");

                }

            } else {
                //Se a pessoa já tiver uma conta
                JOptionPane.showMessageDialog(null, validar);
            }

            //Padrão
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }

    }//GEN-LAST:event_btnConcluirActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnConcluir;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCPF;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtSenha;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
