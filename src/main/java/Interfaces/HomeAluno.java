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
public class HomeAluno extends javax.swing.JFrame {

    /**
     * Creates new form HomeAluno
     */
    
    public List<Bolsa> listaIC = new ArrayList<>();
    public List<Bolsa> listaTP = new ArrayList<>();
    public List<Bolsa> listaMonitoria = new ArrayList<>();
    public List<Bolsa> listaBExtensao = new ArrayList<>();
    
    Aluno user;
    
    public HomeAluno(Aluno user) {
        
        this.user = user;
        
        initComponents();
        setLocationRelativeTo(null);
        setExtendedState(MAXIMIZED_BOTH);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListExtensao = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        ListMonitoria = new javax.swing.JList<>();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListTP = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        ListIC = new javax.swing.JList<>();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monitoria");
        jLabel1.setAlignmentX(0.5F);
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 220, 22);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Extensão");
        jLabel2.setAlignmentX(0.5F);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(240, 10, 220, 22);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciação Cientifica");
        jLabel3.setAlignmentX(0.5F);
        getContentPane().add(jLabel3);
        jLabel3.setBounds(470, 10, 220, 22);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Treinamento Profissional");
        jLabel4.setAlignmentX(0.5F);
        getContentPane().add(jLabel4);
        jLabel4.setBounds(700, 10, 219, 22);

        jScrollPane4.setAlignmentX(getAlignmentX());
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListExtensao.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        ListExtensao.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ListExtensao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListExtensao.setToolTipText("");
        ListExtensao.setMinimumSize(new java.awt.Dimension(100, 200));
        ListExtensao.setName(""); // NOI18N
        ListExtensao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListExtensaoMouseClicked(evt);
            }
        });
        ListExtensao.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListExtensaoInputMethodTextChanged(evt);
            }
        });
        jScrollPane4.setViewportView(ListExtensao);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(240, 40, 220, 270);

        jScrollPane8.setAlignmentX(getAlignmentX());
        jScrollPane8.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListMonitoria.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        ListMonitoria.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ListMonitoria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListMonitoria.setToolTipText("");
        ListMonitoria.setMinimumSize(new java.awt.Dimension(100, 200));
        ListMonitoria.setName(""); // NOI18N
        ListMonitoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMonitoriaMouseClicked(evt);
            }
        });
        ListMonitoria.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListMonitoriaInputMethodTextChanged(evt);
            }
        });
        ListMonitoria.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListMonitoriaValueChanged(evt);
            }
        });
        jScrollPane8.setViewportView(ListMonitoria);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(10, 40, 220, 270);

        jScrollPane9.setAlignmentX(getAlignmentX());
        jScrollPane9.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListTP.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        ListTP.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ListTP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListTP.setToolTipText("");
        ListTP.setMinimumSize(new java.awt.Dimension(100, 200));
        ListTP.setName(""); // NOI18N
        ListTP.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                ListTPAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        ListTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListTPMouseClicked(evt);
            }
        });
        ListTP.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListTPInputMethodTextChanged(evt);
            }
        });
        jScrollPane9.setViewportView(ListTP);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(700, 40, 220, 270);

        jScrollPane10.setAlignmentX(getAlignmentX());
        jScrollPane10.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListIC.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.gray));
        ListIC.setFont(new java.awt.Font("Liberation Sans", 0, 18)); // NOI18N
        ListIC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListIC.setToolTipText("");
        ListIC.setMinimumSize(new java.awt.Dimension(100, 200));
        ListIC.setName(""); // NOI18N
        ListIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListICMouseClicked(evt);
            }
        });
        ListIC.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                ListICInputMethodTextChanged(evt);
            }
        });
        jScrollPane10.setViewportView(ListIC);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(470, 40, 220, 270);

        jMenuPerfil.setText("Perfil");
        jMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuPerfil);

        jMenuSair.setText("Sair");
        jMenuSair.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenuSair.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenuSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuSairMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuSair);

        setJMenuBar(jMenuBar2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListMonitoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMonitoriaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa();
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListMonitoriaMouseClicked

    private void ListExtensaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListExtensaoMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa();
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListExtensaoMouseClicked

    private void ListICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListICMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa();
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListICMouseClicked

    private void ListTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListTPMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa();
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListTPMouseClicked

    private void jMenuSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuSairMouseClicked

        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            // Fechar a tela atual
            dispose();
        }

    }//GEN-LAST:event_jMenuSairMouseClicked

    private void jMenuPerfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPerfilMouseClicked

        VisualizacaoPerfilAluno viewPerfilAluno = new VisualizacaoPerfilAluno(user);
        viewPerfilAluno.setVisible(true);

    }//GEN-LAST:event_jMenuPerfilMouseClicked

    private void ListMonitoriaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListMonitoriaValueChanged

    }//GEN-LAST:event_ListMonitoriaValueChanged

    private void ListTPAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_ListTPAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_ListTPAncestorAdded

    private void ListMonitoriaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListMonitoriaInputMethodTextChanged

        CadastroBolsa lista = new CadastroBolsa(); // Inicialize a variável lista com um objeto válido
        DefaultListModel<String> model = new DefaultListModel<>();

        //listaMonitoria = lista.listaMonitoria;

        //model.addElement(lista.getTitulo());

        ListMonitoria.setModel(model);

    }//GEN-LAST:event_ListMonitoriaInputMethodTextChanged

    private void ListExtensaoInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListExtensaoInputMethodTextChanged
        CadastroBolsa lista = new CadastroBolsa(); // Inicialize a variável lista com um objeto válido
        DefaultListModel<String> model = new DefaultListModel<>();

        //listaBExtensao = lista.listaBExtensao;

        //model.addElement(lista.geTitulo());

        ListExtensao.setModel(model);        // TODO add your handling code here:
    }//GEN-LAST:event_ListExtensaoInputMethodTextChanged

    private void ListICInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListICInputMethodTextChanged
       CadastroBolsa lista = new CadastroBolsa(); // Inicialize a variável lista com um objeto válido
        DefaultListModel<String> model = new DefaultListModel<>();

        //listaIC = lista.listaIC;

        //model.addElement(lista.getTitulo());

        ListIC.setModel(model);   
    }//GEN-LAST:event_ListICInputMethodTextChanged

    private void ListTPInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_ListTPInputMethodTextChanged
        CadastroBolsa lista = new CadastroBolsa(); // Inicialize a variável lista com um objeto válido
        DefaultListModel<String> model = new DefaultListModel<>();

        //listaTP = lista.listaTP;

        //model.addElement(lista.getTitulo());

        ListTP.setModel(model);   
    }//GEN-LAST:event_ListTPInputMethodTextChanged

    private void abrirTelaSelecionada(int selectedIndex) {
        switch (selectedIndex) {
            case 0:
                // Abrir a primeira tela
                abrirTela1();
                break;
            case 1:
                // Abrir a segunda tela
                abrirTela2();
                break;
            case 2:
                // Abrir a terceira tela
                abrirTela3();
                break;
            case 3:
                // Abrir a quarta tela
                abrirTela4();
                break;
            case 4:
                // Abrir a quinta tela
                abrirTela5();
                break;
        }
    }

    private void abrirTela1() {
        // Lógica para abrir a primeira tela
        JOptionPane.showMessageDialog(this, "Abrindo Tela 1");
    }

    private void abrirTela2() {
        // Lógica para abrir a segunda tela
        JOptionPane.showMessageDialog(this, "Abrindo Tela 2");
    }

    private void abrirTela3() {
        // Lógica para abrir a terceira tela
        JOptionPane.showMessageDialog(this, "Abrindo Tela 3");
    }

    private void abrirTela4() {
        // Lógica para abrir a quarta tela
        JOptionPane.showMessageDialog(this, "Abrindo Tela 4");
    }

    private void abrirTela5() {
        // Lógica para abrir a quinta tela
        JOptionPane.showMessageDialog(this, "Abrindo Tela 5");
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
            java.util.logging.Logger.getLogger(HomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeAluno.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Aluno user1 = null;
            new HomeAluno(user1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListExtensao;
    private javax.swing.JList<String> ListIC;
    private javax.swing.JList<String> ListMonitoria;
    private javax.swing.JList<String> ListTP;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
