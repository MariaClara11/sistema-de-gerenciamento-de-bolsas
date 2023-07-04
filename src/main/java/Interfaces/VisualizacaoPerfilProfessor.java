/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.BolsaExtensaoPersistence;
import Persistence.IniciacaoCientificaPersistence;
import Persistence.MonitoriaPersistence;
import Persistence.ProfessorPersistence;
import Persistence.TreinamentoProfissionalPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Extensao;
import com.mycompany.sistemadegerenciamentodebolsas.IniciacaoCientifica;
import com.mycompany.sistemadegerenciamentodebolsas.Monitoria;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
import com.mycompany.sistemadegerenciamentodebolsas.TreinamentoProfissional;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.text.MaskFormatter;

/**
 * Autores do trabalho:
 *
 * Nome: Maria Clara Ribeiro de Menezes Matricula: 202165101AC
 *
 * Nome: Igor Titoneli Almeida Matricula: 202165064AB
 *
 * Nome: Christian Rafael De Oliveira Coelho Matricula: 202065249AC
 *
 * Nome: Marlon Ruffo Nascimento Matricula: 202065165AC
 */
public class VisualizacaoPerfilProfessor extends javax.swing.JFrame {

    private Professor user;

    HomeProfessor tela;

    /**
     * Creates new form VisualizaçãoPerfilProfessor
     */
    public VisualizacaoPerfilProfessor(Professor user, HomeProfessor tela) {
        this.user = user;
        this.tela = tela;
        initComponents();
        setLocationRelativeTo(null);
        this.setResizable(false);
    }

    public MaskFormatter Mascara(String Mascara) {

        MaskFormatter F_Mascara = new MaskFormatter();
        try {
            F_Mascara.setMask(Mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter('_'); //Caracter para preencimento 
        } catch (Exception excecao) {
            excecao.printStackTrace();
        }
        return F_Mascara;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cpfTF = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        siapeTF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ingressoTF = new javax.swing.JFormattedTextField(Mascara("##/##/####"));
        jLabel6 = new javax.swing.JLabel();
        telTF = new javax.swing.JFormattedTextField(Mascara("(##)9 ####-####"));
        jLabel7 = new javax.swing.JLabel();
        nascimentoTF = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(724, 624));
        setPreferredSize(new java.awt.Dimension(724, 624));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Dados pessoais");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Nome:");

        nomeTF.setEditable(false);
        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("CPF:");

        cpfTF.setEditable(false);
        cpfTF.setText("XXX.XXX.XXX-XX");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("SIAPE:");

        siapeTF.setEditable(false);
        siapeTF.setText("XXXXXXXXX");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Ingresso:");

        ingressoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingressoTFActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Telefone:");

        telTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telTFActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Nascimento:");

        nascimentoTF.setText("DD/MM/YYYY");

        jButton1.setBackground(new java.awt.Color(65, 142, 218));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Editar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Excluir");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(263, 263, 263)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                .addGap(271, 271, 271))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel7)
                            .addComponent(telTF)
                            .addComponent(jLabel6)
                            .addComponent(ingressoTF)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(nomeTF)
                            .addComponent(cpfTF, javax.swing.GroupLayout.DEFAULT_SIZE, 672, Short.MAX_VALUE)
                            .addComponent(siapeTF)
                            .addComponent(nascimentoTF)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siapeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ingressoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(telTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.nomeTF.setText(this.user.getNome());
        this.cpfTF.setText(this.user.getCPF());
        this.siapeTF.setText(this.user.getSiap());
        this.ingressoTF.setText(this.user.getDataContratacao());
        this.telTF.setText(this.user.getTelefone());
        this.nascimentoTF.setText(this.user.getDataNascimento());

    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed


    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        int cont = 0;

        CadastroUsuario user = new CadastroUsuario();

        ProfessorPersistence prof = new ProfessorPersistence();

        Set<Professor> professores = new HashSet<>();
        professores = prof.findAllSet();

        if (validarData(this.ingressoTF.getText()) || this.ingressoTF.getText().isEmpty()) {
            if (!this.ingressoTF.getText().isEmpty()) {
                this.user.setDataContratacao(this.ingressoTF.getText());

                for (Professor p : professores) {
                    if (p.getSiap().equals(this.user.getSiap())) {
                        p.setDataContratacao(this.ingressoTF.getText());
                        prof.replace(professores);
                        break;
                    }
                }
            }
            cont++;
        } else {
            JOptionPane.showMessageDialog(this, "Data Inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        if (ValidarTelefone(this.telTF.getText())) {
            if (!this.telTF.getText().isEmpty()) {
                this.user.setTelefone(this.telTF.getText());
                for (Professor p : professores) {
                    if (p.getSiap().equals(this.user.getSiap())) {
                        p.setTelefone(this.telTF.getText());
                        prof.replace(professores);
                        break;
                    }
                }
            }
            cont++;
        } else {
            JOptionPane.showMessageDialog(this, "Telefone Inválido", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        if (cont == 2) {
            JOptionPane.showMessageDialog(this, "Alterado com sucesso", "Alterado", JOptionPane.DEFAULT_OPTION);

        }
    }//GEN-LAST:event_jButton1MouseClicked

    public boolean validarData(String ingresso) {

        String regexData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";

        if (!Pattern.matches(regexData, ingresso)) {
            return false;
        }

        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

        try {
            Date ingressoD = formato.parse(ingresso);
            Date nascimentoD = formato.parse(this.user.getDataNascimento());
            Date dataAtual = new Date();

            if (ingressoD.after(nascimentoD) && ingressoD.before(dataAtual)) {
                return true;
            }
        } catch (ParseException e) {
            return false;
        }
        return false;
    }


    private void ingressoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingressoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ingressoTFActionPerformed

    private void telTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telTFActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        ProfessorPersistence professor = new ProfessorPersistence();

        Set<Professor> professores = new HashSet<>();
        professores = professor.findAllSet();
        int resposta = JOptionPane.showConfirmDialog(null, "Gostaria mesmo de excluir esse perfil?", "Confirmação de Exclusão", JOptionPane.YES_NO_OPTION);

        if (resposta == JOptionPane.YES_OPTION) {

            //Exlui o professor
            for (Professor p : professores) {
                if (p.getSiap().equals(this.user.getSiap())) {
                    professores.remove(p);
                    professor.replace(professores);
                    JOptionPane.showMessageDialog(this, "Perfil Excluído com sucesso", "Excluído", JOptionPane.OK_OPTION);
                    Login login = new Login();
                    login.setVisible(true);
                    tela.dispose();
                    dispose();
                    break;
                }
            }

            BolsaExtensaoPersistence be = new BolsaExtensaoPersistence();
            MonitoriaPersistence mo = new MonitoriaPersistence();
            IniciacaoCientificaPersistence ic = new IniciacaoCientificaPersistence();
            TreinamentoProfissionalPersistence tp = new TreinamentoProfissionalPersistence();

            List<Extensao> benova = new ArrayList<>();
            for (Extensao ex : be.findAll()) {
                if (!ex.getProfessorResponsavel().equals(this.user.getSiap())) {
                    benova.add(ex);
                }
            }
            be.replace(benova);
            
            List<Monitoria> monova = new ArrayList<>();
            for (Monitoria moni : mo.findAll()) {
                if (!moni.getProfessorResponsavel().equals(this.user.getSiap())) {
                    monova.add(moni);
                }
            }
            mo.replace(monova);

            List<IniciacaoCientifica> icnova = new ArrayList<>();
            for (IniciacaoCientifica ice : ic.findAll()) {
                if (!ice.getProfessorResponsavel().equals(this.user.getSiap())) {
                    icnova.add(ice);
                }
            }
            ic.replace(icnova);

            List<TreinamentoProfissional> tpnova = new ArrayList<>();
            for (TreinamentoProfissional tpe : tp.findAll()) {
                if (!tpe.getProfessorResponsavel().equals(this.user.getSiap())) {
                    tpnova.add(tpe);
                }
            }
            tp.replace(tpnova);

        }
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private boolean ValidarTelefone(String telefone) {
        String PHONE_NUMBER_REGEX = "^\\(\\d{2}\\)9 \\d{4}-\\d{4}$";
        Pattern pattern = Pattern.compile(PHONE_NUMBER_REGEX);
        return pattern.matcher(telefone).matches();
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
            java.util.logging.Logger.getLogger(VisualizacaoPerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoPerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoPerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoPerfilProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Professor user = null;
                new VisualizacaoPerfilProfessor(user, null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cpfTF;
    private javax.swing.JFormattedTextField ingressoTF;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nascimentoTF;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JTextField siapeTF;
    private javax.swing.JFormattedTextField telTF;
    // End of variables declaration//GEN-END:variables

}
