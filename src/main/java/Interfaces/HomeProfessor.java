/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.Arquivo;
import Persistence.BolsaExtensaoPersistence;
import Persistence.IniciacaoCientificaPersistence;
import Persistence.MonitoriaPersistence;
import Persistence.Persistence;
import Persistence.TreinamentoProfissionalPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Bolsa;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
import com.mycompany.sistemadegerenciamentodebolsas.Usuario;
import java.awt.event.InputMethodEvent;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;

/**
 *
 * @author igor
 */
public class HomeProfessor extends javax.swing.JFrame {

    List<Bolsa> bolsasLista = new ArrayList();
    DefaultListModel<Bolsa> model = new DefaultListModel();
    private Professor user;

    /**
     * Creates new form HomeProfessor
     */
    public HomeProfessor() {
        

        initComponents();
        /*this.jListBolsa = new JList<>(listModel);
        this.jScrollPane1 = new javax.swing.JScrollPane(this.jListBolsa);
        this.getContentPane().add(this.jScrollPane1);*/
        jListBolsa.setModel(model);
        //jListBolsa.removeAll();
        setExtendedState(MAXIMIZED_BOTH);

    }
    
    public HomeProfessor(Professor user) {

        initComponents();
        this.user = user;
        /*listModel = new DefaultListModel<>();
        this.jListBolsa = new JList<>(listModel);

        this.jScrollPane1 = new javax.swing.JScrollPane(this.jListBolsa);
        this.getContentPane().add(this.jScrollPane1);*/
        
        jListBolsa.setModel(model);
        

        
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jListBolsa = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jListBolsa.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
        jListBolsa.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListBolsa.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jListBolsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListBolsaMouseClicked(evt);
            }
        });
        jListBolsa.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jListBolsaInputMethodTextChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jListBolsa);

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Minhas Bolsas");
        jLabel1.setToolTipText("");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jButton1.setFont(new java.awt.Font("Liberation Sans", 0, 36)); // NOI18N
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

        jMenu1.setText("Perfil");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Sair");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked

        VisualizacaoPerfilProfessor viewPerfil = new VisualizacaoPerfilProfessor(user);
        viewPerfil.setVisible(true);

    }//GEN-LAST:event_jMenu1MouseClicked

    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked

        int option = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            Login login = new Login();
            login.setVisible(true);
            // Fechar a tela atual
            dispose();
        }

    }//GEN-LAST:event_jMenu2MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked

        CadastroBolsa cadbolsa = new CadastroBolsa(this.user);
        cadbolsa.setVisible(true);

    }//GEN-LAST:event_jButton1MouseClicked

    private void jListBolsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListBolsaMouseClicked

        if (evt.getClickCount() == 2) {
            int selectedIndex = jListBolsa.getSelectedIndex();
            if (selectedIndex != -1) {
                //abrirTelaSelecionada(selectedIndex);
                VisualizacaoBolsa ViewBolsa = new VisualizacaoBolsa();
                ViewBolsa.setVisible(true);
            }

        }
    }//GEN-LAST:event_jListBolsaMouseClicked

    private void jListBolsaInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jListBolsaInputMethodTextChanged

        /*CadastroBolsa lista = new CadastroBolsa(this.user); // Inicialize a variável lista com um objeto válido
        DefaultListModel<Bolsa> model = new DefaultListModel<>();
        
        
        
        //listaMonitoria = lista.listaMonitoria;
        //model.addElement(lista.getTitulo());
        jListBolsa.setModel(model);
        jListBolsa.revalidate();
        jListBolsa.repaint();*/
    }//GEN-LAST:event_jListBolsaInputMethodTextChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    public void windowOpened(WindowEvent e) {

        List<Bolsa> bolsasCadastradas = user.getBolsasCadastradas();
        addLista(bolsasCadastradas);
        
        BolsaExtensaoPersistence pExtensao = new BolsaExtensaoPersistence();
        this.addLista(pExtensao.findAll());
        
        IniciacaoCientificaPersistence pIC = new IniciacaoCientificaPersistence();
        this.addLista(pIC.findAll());
        
        MonitoriaPersistence pMoni = new MonitoriaPersistence();
        this.addLista(pMoni.findAll());
        
        TreinamentoProfissionalPersistence pTP = new TreinamentoProfissionalPersistence();
        this.addLista(pTP.findAll());

    }

    public void addLista(List<Bolsa> bolsa) {
        //DefaultListModel<Bolsa> model = (DefaultListModel<Bolsa>)this.jListBolsa.getModel();
        for (Bolsa b : bolsa) {
            if(b.getProfessorResponsavel().equals(this.user.getSiap())){
                model.addElement(b);
                //this.bolsasLista.add(b);
            }
        }
    }


    public void inputListBolsa() {
        InputMethodEvent evt = null;
        jListBolsaInputMethodTextChanged(evt);
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

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeProfessor().setVisible(true);
            }
        });
    }

    //DefaultListModel<String> model = new DefaultListModel<>();

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<Bolsa> jListBolsa;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
