/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Disciplina;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class InscricaoBolsa extends javax.swing.JFrame {

    private Projeto bolsa;
    private Aluno user;

    /**
     * Creates new form InscricaoBolsa
     */
    public InscricaoBolsa(Projeto bolsa, Aluno user) {

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

        jPanel1 = new javax.swing.JPanel();
        Lnome = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fieldProfessor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fieldRequisitos = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldHoraria = new javax.swing.JTextField();
        fieldValor = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        fieldTipo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        preRequisitoComboBox = new javax.swing.JComboBox<>();
        bInscrever = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        Lnome.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Lnome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lnome.setText("Titulo");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Professor : ");

        fieldProfessor.setEditable(false);
        fieldProfessor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldProfessorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pre-Requisitos : ");

        fieldRequisitos.setEditable(false);
        fieldRequisitos.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldRequisitos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldRequisitosActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Carga Horária Semanal :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor :");

        fieldHoraria.setEditable(false);
        fieldHoraria.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldHoraria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldHorariaActionPerformed(evt);
            }
        });

        fieldValor.setEditable(false);
        fieldValor.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldValorActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo :");

        fieldTipo.setEditable(false);
        fieldTipo.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        fieldTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldTipoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Pre-Requisitos : ");

        preRequisitoComboBox.setEditable(false);
        preRequisitoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        preRequisitoComboBox.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        bInscrever.setBackground(new java.awt.Color(65, 142, 218));
        bInscrever.setForeground(new java.awt.Color(255, 255, 255));
        bInscrever.setText("Me inscrever");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Lnome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldProfessor)
                    .addComponent(fieldRequisitos, javax.swing.GroupLayout.DEFAULT_SIZE, 438, Short.MAX_VALUE)
                    .addComponent(fieldHoraria)
                    .addComponent(fieldValor)
                    .addComponent(fieldTipo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(preRequisitoComboBox, 0, 438, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(bInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Lnome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(2, 2, 2)
                .addComponent(fieldRequisitos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preRequisitoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldValorActionPerformed

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
        
        int counter=0;
        
        for(Disciplina d: user.getDisciplinas()){
            for(String b: this.bolsa.getPreRequisitos()){
                
                System.out.println("Disciplina -> "+d);
                System.out.println("Bolsa -> "+b);
                if(d.getCodigo().equals(b)){
                    counter++;
                }
            }
        }
        if(counter>=this.bolsa.getPreRequisitos().size()){
            this.bolsa.addAlunosCadastrados(user);
            JOptionPane.showMessageDialog(this, "Inscrito com sucesso.", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }else {
            JOptionPane.showMessageDialog(this, "Você ainda não cursou as disciplinas requisitadas.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_bInscreverActionPerformed

    private void bInscreverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInscreverMouseClicked

    }//GEN-LAST:event_bInscreverMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement("Veja mais");
        this.Lnome.setText(this.bolsa.getTitulo());
        
        this.fieldProfessor.setText(this.bolsa.getProfessorResponsavel());

        String hora = Integer.toString(this.bolsa.getQuantidadeHoras());
        this.fieldHoraria.setText(hora);

        String req = new String();
        for (String p : this.bolsa.getPreRequisitos()) {
            comboBoxModel.addElement(p);
            req = req.concat("[");
            req = req.concat(p);
            req = req.concat("]");
        }
        this.preRequisitoComboBox.setModel(comboBoxModel);
        this.fieldRequisitos.setText(req);

        String valor = String.format("%.2f", this.bolsa.getValor());
        this.fieldValor.setText(valor);
        
        this.fieldTipo.setText(this.bolsa.retornaTipo());
        
    }//GEN-LAST:event_formWindowOpened

    private void fieldRequisitosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldRequisitosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldRequisitosActionPerformed

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
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> preRequisitoComboBox;
    // End of variables declaration//GEN-END:variables
}
