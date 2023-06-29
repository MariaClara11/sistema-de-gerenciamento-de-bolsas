/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.AlunoPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Disciplina;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

/**
 *
 * @author chris
 */
public class CadastroDisciplina extends javax.swing.JFrame {

    /**
     * Creates new form CadastroDisciplina
     */
    List<Disciplina> DisciplinaLista = new ArrayList();
    private Aluno user = new Aluno();

    public CadastroDisciplina() {
        initComponents();
    }

    public CadastroDisciplina(Aluno user) {
        this.user = user;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        notaTF = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        btnVoltar = new java.awt.Button();
        codigoDisciplinaSelect = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Código:");

        jLabel4.setText("Nota tirada na disciplina:");

        notaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaTFActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cadastro de Disciplinas");

        btnVoltar.setLabel("<--");
        btnVoltar.setName(""); // NOI18N
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });

        codigoDisciplinaSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "ANE40", "CAD076", "DCC001", "DCC008", "DCC012", "DCC013", "DCC014", "DCC019", "DCC025", "DCC033", "DCC037", "DCC042", "DCC045", "DCC055", "DCC059", "DCC060", "DCC061", "DCC062", "DCC063", "DCC064", "DCC065", "DCC066", "DCC067", "DCC068", "DCC069", "DCC070", "DCC071", "DCC072", "DCC073", "DCC074", "DCC075", "DCC076", "DCC078", "DCC080", "DCC082", "DCC083", "DCC086", "DCC088", "DCC089", "DCC090", "DCC091", "DCC092", "DCC093", "DCC094", "DCC095", "DCC096", "DCC097", "DCC098", "DCC099", "DCC100", "DCC101", "DCC102", "DCC103", "DCC104", "DCC105", "DCC117", "DCC122", "DCC123", "DCC124", "DCC125", "DCC126", "DCC127", "DCC128", "DCC129", "DCC130", "DCC131", "DCC132", "DCC133", "DCC136", "DCC137", "DCC138", "DCC139", "DCC140", "DCC141", "DCC142", "DCC143", "DCC144", "DCC145", "DCC147", "DCC148", "DCC149", "DCC152", "DCC153", "DCC154", "DCC155", "DCC159", "DCC160", "DCC161", "DCC162", "DCC163", "DCC164", "DCC165", "DCC166", "DCC167", "DCC168", "DCC171", "DCC172", "DCC174", "DCC176", "DCC177", "DCC178", "DCC179", "DCC180", "DCC181", "DCC182", "DCC183", "DCC184", "DCC185", "DCC186", "DCC187", "DCC188", "DCC189", "DCC190", "DCC199", "DCC200", "DC5199", "DC5200", "DPR032", "EADCC037", "EADCC043", "EADCC044", "EADDCC048", "EADDCC049", "EST028", "EST029", "EST030", "FIL012", "FIN001", "FIS073", "FIS074", "FIS075", "FIS077", "FIS122", "ICE001", "LEC003", "LEM184", "MAC011", "MAC013", "MAT013", "MAT029", "MAT143", "MAT154", "MAT155", "MAT156", "MAT157", "MAT158", "QUI125", "QUI126", "QUI168", "UNI001", "UNI002", "UNI003" }));
        codigoDisciplinaSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(67, 67, 67)
                                        .addComponent(btnCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(notaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(182, 182, 182)))
                                .addGap(62, 62, 62))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(codigoDisciplinaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(btnVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(codigoDisciplinaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(notaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnCadastrar)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaTFActionPerformed

    }//GEN-LAST:event_notaTFActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nota = notaTF.getText();

        AlunoPersistence alunoP = new AlunoPersistence();
        List<Aluno> todosAlunos = new ArrayList<>();
        todosAlunos = alunoP.findAll();

        if (disciplinaIsValid()) {
            float notaFloat = Float.parseFloat(nota);
            String codigo = (String) codigoDisciplinaSelect.getSelectedItem();
            Disciplina cadDisciplina = new Disciplina(notaFloat, codigo);
            for (Aluno a : todosAlunos) {
                if (a.getMatricula().equals(this.user.getMatricula())) {
                        a.getDisciplinas().add(cadDisciplina);
                        alunoP.replace(todosAlunos);
                        JOptionPane.showMessageDialog(this, "Disciplina cadastrada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        dispose();
                        break;

                    

                }
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed

        dispose();
    }//GEN-LAST:event_btnVoltarActionPerformed

    public boolean ehIgual(Disciplina newDisciplina) {

        for (Disciplina a : this.user.getDisciplinas()) {
            if (a.getCodigo().equals(newDisciplina.getCodigo())) {
                return true;
            }
        }

        return false;
    }

    public boolean disciplinaIsValid() {

        int codigoIndex = codigoDisciplinaSelect.getSelectedIndex();
        String nota = notaTF.getText();

        if (codigoIndex == 0) {
            JOptionPane.showMessageDialog(this, "Selecione o código da disciplina", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else if (nota.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Informe a nota da disciplina", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            float notaFloat = Float.parseFloat(nota);
            if (notaFloat > 100 || notaFloat < 0) {
                JOptionPane.showMessageDialog(this, "Nota deve estar entre 0 e 100", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }

        }
        return true;
    }

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
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroDisciplina.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroDisciplina().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private java.awt.Button btnVoltar;
    private javax.swing.JComboBox<String> codigoDisciplinaSelect;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField notaTF;
    // End of variables declaration//GEN-END:variables
}
