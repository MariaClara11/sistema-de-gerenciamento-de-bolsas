/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Bolsa;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class InscricaoBolsa extends javax.swing.JFrame {

    private Bolsa bolsa;
    private Aluno user;

    /**
     * Creates new form InscricaoBolsa
     */
    public InscricaoBolsa(Bolsa bolsa, Aluno user) {

        this.bolsa = bolsa;
        this.user = user;
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Lnome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fieldValor = new javax.swing.JTextField();
        fieldRequisitos = new javax.swing.JTextField();
        fieldHoraria = new javax.swing.JTextField();
        fieldTipo = new javax.swing.JTextField();
        fieldProfessor = new javax.swing.JTextField();
        bInscrever = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Lnome.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        Lnome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lnome.setText("Nome da Monitoria");

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Professor : ");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pre-Requisitos : ");

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Carga Horária :");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor :");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo :");

        fieldValor.setEditable(false);
        fieldValor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldValorActionPerformed(evt);
            }
        });

        fieldRequisitos.setEditable(false);
        fieldRequisitos.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRequisitosActionPerformed(evt);
            }
        });

        fieldHoraria.setEditable(false);
        fieldHoraria.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHorariaActionPerformed(evt);
            }
        });

        fieldTipo.setEditable(false);
        fieldTipo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTipoActionPerformed(evt);
            }
        });

        fieldProfessor.setEditable(false);
        fieldProfessor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldProfessorActionPerformed(evt);
            }
        });

        bInscrever.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        bInscrever.setText("Inscrever");
        bInscrever.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bInscreverMouseClicked(evt);
            }
        });
        bInscrever.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInscreverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lnome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(fieldProfessor, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fieldRequisitos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                            .addComponent(fieldTipo)
                            .addComponent(fieldValor)
                            .addComponent(fieldHoraria, javax.swing.GroupLayout.Alignment.LEADING))))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(bInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Lnome)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(fieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fieldRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(fieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(bInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldValorActionPerformed

    private void fieldRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRequisitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRequisitosActionPerformed

    private void fieldHorariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldHorariaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldHorariaActionPerformed

    private void fieldTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldTipoActionPerformed

    private void fieldProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldProfessorActionPerformed

    private void bInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscreverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInscreverActionPerformed

    private void bInscreverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInscreverMouseClicked

        if (this.user.getDisciplinas().containsAll(this.bolsa.getPreRequisitos()))
            this.bolsa.addAlunosCadastrados(user);
        else {
            JOptionPane.showMessageDialog(this, "Você ainda não cursou as disciplinas requisitadas.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bInscreverMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.Lnome.setText(this.bolsa.getTitulo());

        this.fieldProfessor.setText(this.bolsa.getProfessorResponsavel());

        String hora = Integer.toString(this.bolsa.getQuantidadeHoras());
        this.fieldHoraria.setText(hora);

        String req = new String();
        for (String p : this.bolsa.getPreRequisitos()) {
            req = req.concat("[");
            req = req.concat(p);
            req = req.concat("]");
        }
        this.fieldRequisitos.setText(req);

        String valor = String.format("%.2f", this.bolsa.getValor());
        this.fieldValor.setText(valor);

    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(InscricaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InscricaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InscricaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InscricaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new InscricaoBolsa(null, null).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lnome;
    private javax.swing.JButton bInscrever;
    private javax.swing.JTextField fieldHoraria;
    private javax.swing.JTextField fieldProfessor;
    private javax.swing.JTextField fieldRequisitos;
    private javax.swing.JTextField fieldTipo;
    private javax.swing.JTextField fieldValor;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
