/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.BolsaExtensaoPersistence;
import Persistence.IniciacaoCientificaPersistence;
import Persistence.MonitoriaPersistence;
import Persistence.TreinamentoProfissionalPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Extensao;
import com.mycompany.sistemadegerenciamentodebolsas.IniciacaoCientifica;
import com.mycompany.sistemadegerenciamentodebolsas.Monitoria;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import com.mycompany.sistemadegerenciamentodebolsas.TreinamentoProfissional;
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
    DefaultListModel modelIC = new DefaultListModel();
    DefaultListModel modelTP = new DefaultListModel();
    DefaultListModel modelMo = new DefaultListModel();
    DefaultListModel modelBE = new DefaultListModel();

    public List<IniciacaoCientifica> listaIC = new ArrayList<>();
    public List<TreinamentoProfissional> listaTP = new ArrayList<>();
    public List<Monitoria> listaMonitoria = new ArrayList<>();
    public List<Extensao> listaBExtensao = new ArrayList<>();

    Aluno user;

    public HomeAluno(Aluno user) {

        this.user = user;

        initComponents();

        this.ListExtensao.setModel(modelBE);
        this.ListIC.setModel(modelIC);
        this.ListMonitoria.setModel(modelMo);
        this.ListTP.setModel(modelTP);

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
        jMenuPerfil1 = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Monitoria");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Extensão");
        jLabel2.setAlignmentX(0.5F);

        jLabel3.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Iniciação Cientifica");
        jLabel3.setAlignmentX(0.5F);

        jLabel4.setFont(new java.awt.Font("Liberation Sans", 1, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Treinamento Profissional");
        jLabel4.setAlignmentX(0.5F);

        jScrollPane4.setAlignmentX(getAlignmentX());
        jScrollPane4.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListExtensao.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListExtensao.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        ListExtensao.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListExtensao.setToolTipText("");
        ListExtensao.setMinimumSize(new java.awt.Dimension(100, 200));
        ListExtensao.setName(""); // NOI18N
        ListExtensao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListExtensaoMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(ListExtensao);

        jScrollPane8.setAlignmentX(getAlignmentX());
        jScrollPane8.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListMonitoria.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListMonitoria.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        ListMonitoria.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListMonitoria.setToolTipText("");
        ListMonitoria.setMinimumSize(new java.awt.Dimension(100, 200));
        ListMonitoria.setName(""); // NOI18N
        ListMonitoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListMonitoriaMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(ListMonitoria);

        jScrollPane9.setAlignmentX(getAlignmentX());
        jScrollPane9.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListTP.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListTP.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        ListTP.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListTP.setToolTipText("");
        ListTP.setMinimumSize(new java.awt.Dimension(100, 200));
        ListTP.setName(""); // NOI18N
        ListTP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListTPMouseClicked(evt);
            }
        });
        jScrollPane9.setViewportView(ListTP);

        jScrollPane10.setAlignmentX(getAlignmentX());
        jScrollPane10.setPreferredSize(new java.awt.Dimension(1014, 375));

        ListIC.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ListIC.setFont(new java.awt.Font("Liberation Sans", 0, 24)); // NOI18N
        ListIC.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ListIC.setToolTipText("");
        ListIC.setMinimumSize(new java.awt.Dimension(100, 200));
        ListIC.setName(""); // NOI18N
        ListIC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListICMouseClicked(evt);
            }
        });
        jScrollPane10.setViewportView(ListIC);

        jMenuPerfil.setText("Perfil");
        jMenuPerfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfilMouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuPerfil);

        jMenuPerfil1.setText("Cadastrar Disciplinas");
        jMenuPerfil1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuPerfil1MouseClicked(evt);
            }
        });
        jMenuBar2.add(jMenuPerfil1);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 220, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2))
                    .addComponent(jLabel4))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListMonitoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMonitoriaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaMonitoria.get(selectedIndex), user);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListMonitoriaMouseClicked

    private void ListExtensaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListExtensaoMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListExtensao.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaBExtensao.get(selectedIndex), user);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListExtensaoMouseClicked

    private void ListICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListICMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListIC.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaIC.get(selectedIndex), user);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListICMouseClicked

    private void ListTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListTPMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListTP.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaTP.get(selectedIndex), user);
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

        VisualizacaoPerfilAluno viewPerfilAluno = new VisualizacaoPerfilAluno(user,this);
        viewPerfilAluno.setVisible(true);


    }//GEN-LAST:event_jMenuPerfilMouseClicked
    
    public void fecharHomeAluno(){
        this.dispose();
        this.setVisible(false);
    }
    
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.modelBE.removeAllElements();
        this.modelIC.removeAllElements();
        this.modelMo.removeAllElements();
        this.modelTP.removeAllElements();

        BolsaExtensaoPersistence pExtensao = new BolsaExtensaoPersistence();
        this.addListaExtensao(listaBExtensao, this.modelBE, pExtensao.findAll());

        IniciacaoCientificaPersistence pIC = new IniciacaoCientificaPersistence();
        this.addListaIniciacaoCientifica(listaIC, this.modelIC, pIC.findAll());

        MonitoriaPersistence pMoni = new MonitoriaPersistence();
        this.addListaMonitoria(listaMonitoria, this.modelMo, pMoni.findAll());

        TreinamentoProfissionalPersistence pTP = new TreinamentoProfissionalPersistence();
        this.addListaTreinamentoProfissional(listaTP, this.modelTP, pTP.findAll());

    }//GEN-LAST:event_formWindowOpened

    private void jMenuPerfil1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuPerfil1MouseClicked
        CadastroDisciplina viewCadastroDisciplinas = new CadastroDisciplina(user);
        viewCadastroDisciplinas.setVisible(true);
    }//GEN-LAST:event_jMenuPerfil1MouseClicked

    public void addListaExtensao(List<Extensao> bolsa, DefaultListModel model, List<Extensao> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (Extensao b : persistence) {
            bolsa.add(b);
            model.addElement(b.getTitulo());
        }
    }

    public void addListaIniciacaoCientifica(List<IniciacaoCientifica> bolsa, DefaultListModel model, List<IniciacaoCientifica> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (IniciacaoCientifica b : persistence) {
            bolsa.add(b);
            model.addElement(b.getTitulo());
        }
    }

    public void addListaMonitoria(List<Monitoria> bolsa, DefaultListModel model, List<Monitoria> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (Monitoria b : persistence) {
            bolsa.add(b);
            model.addElement(b.getTitulo());
        }
    }

    public void addListaTreinamentoProfissional(List<TreinamentoProfissional> bolsa, DefaultListModel model, List<TreinamentoProfissional> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (TreinamentoProfissional b : persistence) {
            bolsa.add(b);
            model.addElement(b.getTitulo());
        }
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
    private javax.swing.JMenu jMenuPerfil1;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
