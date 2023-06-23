/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Bolsa;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author igor
 */
public class VisualizacaoBolsa extends javax.swing.JFrame {
    
    
    List<Aluno> alunoLista = new ArrayList();
    DefaultListModel model = new DefaultListModel();
    Bolsa bolsa;
    
    
    /**
     * Creates new form VisualizacaoBolsa
     */
    public VisualizacaoBolsa(Bolsa bolsa) {
        initComponents();
        this.bolsa = bolsa;
        this.listAlunos.setModel(model);
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        bInscrever = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        valorTF = new javax.swing.JTextField();
        reqTF = new javax.swing.JTextField();
        horaTF = new javax.swing.JTextField();
        tipoTF = new javax.swing.JTextField();
        professorTF = new javax.swing.JTextField();
        Lnome = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAlunos = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("Professor : ");

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("Pre-Requisitos : ");

        bInscrever.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        bInscrever.setText("Alterar");
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

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("Carga Horária :");

        jLabel5.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("Valor :");

        jLabel6.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel6.setText("Tipo :");

        valorTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        valorTF.setText("fieldValor");
        valorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorTFActionPerformed(evt);
            }
        });

        reqTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        reqTF.setText("fieldRequisitos");
        reqTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reqTFActionPerformed(evt);
            }
        });

        horaTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        horaTF.setText("fieldHoraria");
        horaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                horaTFActionPerformed(evt);
            }
        });

        tipoTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        tipoTF.setText("fieldTipo");
        tipoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoTFActionPerformed(evt);
            }
        });

        professorTF.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        professorTF.setText("fieldProfessor");
        professorTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                professorTFActionPerformed(evt);
            }
        });

        Lnome.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        Lnome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lnome.setText("Nome da Monitoria");

        listAlunos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listAlunos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(listAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lnome, javax.swing.GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(reqTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(valorTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tipoTF, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(professorTF)
                            .addComponent(horaTF, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1)))
                .addGap(62, 62, 62))
            .addGroup(layout.createSequentialGroup()
                .addGap(304, 304, 304)
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
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(professorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(reqTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(valorTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(horaTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tipoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addGap(18, 18, 18)
                .addComponent(bInscrever, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bInscreverMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bInscreverMouseClicked
        // TODO add your handling code here:
        String professor = professorTF.getText();
        String requisitos = reqTF.getText();
        String valor = valorTF.getText();
        String horaria = horaTF.getText();
        String tipo = tipoTF.getText();

        if (bolsaIsValid()) {
            
        }


    }//GEN-LAST:event_bInscreverMouseClicked

    private void bInscreverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInscreverActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bInscreverActionPerformed

    private void valorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorTFActionPerformed

    private void reqTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reqTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_reqTFActionPerformed

    private void horaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_horaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_horaTFActionPerformed

    private void tipoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tipoTFActionPerformed

    private void professorTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_professorTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_professorTFActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        this.Lnome.setText(this.bolsa.getTitulo());
        
        this.professorTF.setText(this.bolsa.getProfessorResponsavel());
        
        String listb = new String();
        for(String p : this.bolsa.getPreRequisitos()){
            listb = listb.concat("[");
            listb = listb.concat(p);
            listb = listb.concat("]");
        }
        this.reqTF.setText(listb);
        
        String valor = String.format("%.2f", this.bolsa.getValor());
        this.valorTF.setText(valor);
        
        String hora = Integer.toString(this.bolsa.getQuantidadeHoras());
        this.horaTF.setText(hora);
        
        this.tipoTF.setText(this.bolsa.getTipo());
         
        for(Aluno a : this.bolsa.getAlunosCadastrados()){
            model.addElement(a.getNome());
        }

        
        
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    private boolean bolsaIsValid() {

        String professor = professorTF.getText();
        String requisitos = reqTF.getText();
        String valorS = valorTF.getText();
        String horariaS = horaTF.getText();
        String tipo = tipoTF.getText();
        
        int valor;
        int horaria;
        
        try {
            valor = Integer.parseInt(valorS);
            horaria = Integer.parseInt(horariaS);
            // Código a ser executado se a conversão for bem-sucedida
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, complete as informações da bolsa",
                "Aviso", JOptionPane.WARNING_MESSAGE);
            return false;
            // Código de tratamento para quando a conversão falha
        }

        if (valor<=0 || horaria<=0) {
            JOptionPane.showMessageDialog(null, "Digite um Valor e uma Carga Horaria valida",
                    "Aviso", JOptionPane.WARNING_MESSAGE);
            return false; // Verifica se campos obrigatórios estão vazios
        }
        else {
            return true;
        }
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
            java.util.logging.Logger.getLogger(VisualizacaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisualizacaoBolsa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisualizacaoBolsa(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lnome;
    private javax.swing.JButton bInscrever;
    private javax.swing.JTextField horaTF;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Aluno> listAlunos;
    private javax.swing.JTextField professorTF;
    private javax.swing.JTextField reqTF;
    private javax.swing.JTextField tipoTF;
    private javax.swing.JTextField valorTF;
    // End of variables declaration//GEN-END:variables
}
