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
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Extensao;
import com.mycompany.sistemadegerenciamentodebolsas.IniciacaoCientifica;
import com.mycompany.sistemadegerenciamentodebolsas.Monitoria;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
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
public class HomeProfessor extends javax.swing.JFrame {

    /**
     * Creates new form HomeAluno
     */
    DefaultListModel modelProfIC = new DefaultListModel();
    DefaultListModel modelProfTP = new DefaultListModel();
    DefaultListModel modelProfMo = new DefaultListModel();
    DefaultListModel modelProfBE = new DefaultListModel();

    public List<IniciacaoCientifica> listaIC = new ArrayList<>();
    public List<TreinamentoProfissional> listaTP = new ArrayList<>();
    public List<Monitoria> listaMonitoria = new ArrayList<>();
    public List<Extensao> listaBExtensao = new ArrayList<>();

    Professor user;

    public HomeProfessor(Professor user) {

        this.user = user;

        initComponents();

        this.ListExtensao.setModel(modelProfBE);
        this.ListIC.setModel(modelProfIC);
        this.ListMonitoria.setModel(modelProfMo);
        this.ListTP.setModel(modelProfTP);

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

        Container = new javax.swing.JPanel();
        jScrollPane9 = new javax.swing.JScrollPane();
        ListTP = new javax.swing.JList<>();
        jScrollPane10 = new javax.swing.JScrollPane();
        ListIC = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListExtensao = new javax.swing.JList<>();
        jScrollPane8 = new javax.swing.JScrollPane();
        ListMonitoria = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        BemVindo = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenuPerfil = new javax.swing.JMenu();
        jMenuSair = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName(""); // NOI18N
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Container.setBackground(new java.awt.Color(255, 255, 255));
        Container.setMinimumSize(new java.awt.Dimension(935, 444));
        Container.setPreferredSize(new java.awt.Dimension(935, 444));

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

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 142, 218));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MONITORIA");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(65, 142, 218));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("EXTENSÃO");
        jLabel2.setAlignmentX(0.5F);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 142, 218));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("IC");
        jLabel3.setAlignmentX(0.5F);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 142, 218));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("TP");
        jLabel4.setAlignmentX(0.5F);

        jButton1.setBackground(new java.awt.Color(65, 142, 218));
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Cadastrar Bolsa");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("BOLSAS CADASTRADAS:");

        BemVindo.setText("Bem-Vindo:");

        javax.swing.GroupLayout ContainerLayout = new javax.swing.GroupLayout(Container);
        Container.setLayout(ContainerLayout);
        ContainerLayout.setHorizontalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerLayout.createSequentialGroup()
                .addGap(558, 558, 558)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                .addGap(551, 551, 551))
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerLayout.createSequentialGroup()
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 290, Short.MAX_VALUE)))
                    .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(BemVindo)
                        .addComponent(jLabel5)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        ContainerLayout.setVerticalGroup(
            ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(BemVindo)
                .addGap(4, 4, 4)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(12, 12, 12)
                .addGroup(ContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(jScrollPane10, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane9, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 1288, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Container, javax.swing.GroupLayout.DEFAULT_SIZE, 509, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ListMonitoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListMonitoriaMouseClicked
        // TODO add your handling code here:
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListMonitoria.getSelectedIndex();
            if (selectedIndex != -1) {
                
                VisualizacaoBolsa ViewBolsa = new VisualizacaoBolsa(this.listaMonitoria.get(selectedIndex),this);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListMonitoriaMouseClicked

    private void ListExtensaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListExtensaoMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListExtensao.getSelectedIndex();
            if (selectedIndex != -1) {
                System.out.println(this.listaBExtensao.get(selectedIndex).getTitulo());
                VisualizacaoBolsa ViewBolsa = new VisualizacaoBolsa(this.listaBExtensao.get(selectedIndex),this);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListExtensaoMouseClicked

    private void ListICMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListICMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListIC.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                //InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaIC.get(selectedIndex),user);
                //ViewBolsa.setVisible(true);
                VisualizacaoBolsa ViewBolsa = new VisualizacaoBolsa(this.listaIC.get(selectedIndex),this);
                ViewBolsa.setVisible(true);
            }
        }
    }//GEN-LAST:event_ListICMouseClicked

    private void ListTPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListTPMouseClicked
        if (evt.getClickCount() == 2) {
            int selectedIndex = ListTP.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                //InscricaoBolsa ViewBolsa = new InscricaoBolsa(this.listaTP.get(selectedIndex),user);
                //ViewBolsa.setVisible(true);
                VisualizacaoBolsa ViewBolsa = new VisualizacaoBolsa(this.listaTP.get(selectedIndex),this);
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

        VisualizacaoPerfilProfessor viewPerfil = new VisualizacaoPerfilProfessor(user);
        viewPerfil.setVisible(true);

    }//GEN-LAST:event_jMenuPerfilMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

        this.BemVindo.setText("Bem-vindo: " + this.user.getNome());

        this.modelProfBE.removeAllElements();
        this.modelProfIC.removeAllElements();
        this.modelProfMo.removeAllElements();
        this.modelProfTP.removeAllElements();

        BolsaExtensaoPersistence pExtensao = new BolsaExtensaoPersistence();
        this.addListaExtensao(listaBExtensao, this.modelProfBE, pExtensao.findAll());

        IniciacaoCientificaPersistence pIC = new IniciacaoCientificaPersistence();
        this.addListaIniciacaoCientifica(listaIC, this.modelProfIC, pIC.findAll());

        MonitoriaPersistence pMoni = new MonitoriaPersistence();
        this.addListaMonitoria(listaMonitoria, this.modelProfMo, pMoni.findAll());

        TreinamentoProfissionalPersistence pTP = new TreinamentoProfissionalPersistence();
        this.addListaTreinamentoProfissional(listaTP, this.modelProfTP, pTP.findAll());

    }//GEN-LAST:event_formWindowOpened

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        CadastroBolsa cadbolsa = new CadastroBolsa(this.user, this);
        cadbolsa.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void addListaExtensao(List<Extensao> bolsa, DefaultListModel model, List<Extensao> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (Extensao b : persistence) {
            if (b.getProfessorResponsavel().equals(this.user.getSiap())) {
                bolsa.add(b);
                model.addElement(b.getTitulo());
            }
        }
    }

    public void addListaIniciacaoCientifica(List<IniciacaoCientifica> bolsa, DefaultListModel model, List<IniciacaoCientifica> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (IniciacaoCientifica b : persistence) {
            if (b.getProfessorResponsavel().equals(this.user.getSiap())) {
                bolsa.add(b);
                model.addElement(b.getTitulo());
            }
        }
    }

    public void addListaMonitoria(List<Monitoria> bolsa, DefaultListModel model, List<Monitoria> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (Monitoria b : persistence) {
            if (b.getProfessorResponsavel().equals(this.user.getSiap())) {
                bolsa.add(b);
                model.addElement(b.getTitulo());
            }
        }
    }

    public void addListaTreinamentoProfissional(List<TreinamentoProfissional> bolsa, DefaultListModel model, List<TreinamentoProfissional> persistence) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (TreinamentoProfissional b : persistence) {
            if (b.getProfessorResponsavel().equals(this.user.getSiap())) {
                bolsa.add(b);
                model.addElement(b.getTitulo());
            }
        }
    }

    public void atualizarTela() {

        this.modelProfBE.clear();
        this.modelProfIC.clear();
        this.modelProfMo.clear();
        this.modelProfTP.clear();
        this.listaBExtensao.clear();
        this.listaIC.clear();
        this.listaMonitoria.clear();
        this.listaTP.clear();
        
        BolsaExtensaoPersistence ex = new BolsaExtensaoPersistence();
        IniciacaoCientificaPersistence ic = new IniciacaoCientificaPersistence();
        MonitoriaPersistence mo = new MonitoriaPersistence();
        TreinamentoProfissionalPersistence tp = new TreinamentoProfissionalPersistence();
        
        for(Extensao be : ex.findAll()){
            if(be.getProfessorResponsavel().equals(this.user.getSiap())){
                this.modelProfBE.addElement(be.getTitulo());
                this.listaBExtensao.add(be);
            }
        }
        
        for(IniciacaoCientifica ice : ic.findAll()){
            if(ice.getProfessorResponsavel().equals(this.user.getSiap())){
                this.modelProfIC.addElement(ice.getTitulo());
                this.listaIC.add(ice);
            }
        }
        
        for(Monitoria moni : mo.findAll()){
            if(moni.getProfessorResponsavel().equals(this.user.getSiap())){
                this.modelProfMo.addElement(moni.getTitulo());
                this.listaMonitoria.add(moni);
            }
        }
        
        for(TreinamentoProfissional tpe : tp.findAll()){
            if(tpe.getProfessorResponsavel().equals(this.user.getSiap())){
                this.modelProfTP.addElement(tpe.getTitulo());
                this.listaTP.add(tpe);
            }
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
            java.util.logging.Logger.getLogger(HomeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeProfessor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            Professor user1 = null;
            new HomeProfessor(user1).setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BemVindo;
    private javax.swing.JPanel Container;
    private javax.swing.JList<String> ListExtensao;
    private javax.swing.JList<String> ListIC;
    private javax.swing.JList<String> ListMonitoria;
    private javax.swing.JList<String> ListTP;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenu jMenuPerfil;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
