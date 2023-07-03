/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.AlunoPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Disciplina;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
        setLocationRelativeTo(null);
    }

    public CadastroDisciplina(Aluno user) {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();
        codigoDisciplinaSelect = new javax.swing.JComboBox<>();
        notaTF = new javax.swing.JTextField();
        btnCadastrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Código:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Nota obtida:");

        tituloPrincipal.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        tituloPrincipal.setForeground(new java.awt.Color(65, 142, 218));
        tituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tituloPrincipal.setText("Cadastro de Disciplina");
        tituloPrincipal.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        codigoDisciplinaSelect.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecione", "DCC001-ANALISE E PROJETO DE ALGORITMOS", "DCC008-CALCULO NUMERICO", "DCC012-ESTRUTURA DE DADOS II", "DCC013-ESTRUTURA DE DADOS", "DCC014-INTELIGENCIA ARTIFICIAL", "DCC019-LINGUAGEM DE PROGRAMACAO", "DCC025-ORIENTACAO A OBJETOS", "DCC033-FLUXO EM REDES", "DCC037-LABORATORIO DE ORGANIZACAO DE COMPUTADORES", "DCC042-REDES DE COMPUTADORES", "DCC045-TEORIA DOS COMPILADORES", "DCC049-EMPREENDIMENTOS EM INFORMATICA", "DCC055-TEORIA DA COMPUTACAO", "DCC057-ARQUITETURA DE COMPUTADORES", "DCC059-TEORIA DOS GRAFOS", "DCC060-BANCO DE DADOS", "DCC061-ENGENHARIA DE SOFTWARE", "DCC062-SISTEMAS OPERACIONAIS", "DCC063-LINGUAGENS FORMAIS E AUTOMATOS", "DCC064-SISTEMAS DISTRIBUIDOS", "DCC065-COMPUTACAO GRAFICA", "DCC066-PROCESSAMENTO DE IMAGENS", "DCC067-COMPUTAÇÃO EVOLUCIONISTA", "DCC068-REDES NEURAIS ARTIFICIAIS", "DCC069-PROGRAMACAO NAO LINEAR", "DCC070-ORGANIZACAO DE COMPUTADORES", "DCC071-LABORATORIO DE SISTEMAS OPERACIONAIS", "DCC072-LABORATORIO DE REDES DE COMPUTADORES", "DCC073-TEORIA DE FILAS", "DCC074-AVALIACAO DE DESEMPENHO DE SISTEMAS", "DCC075-SEGURANCA EM SISTEMAS DE COMPUTACAO", "DCC076-PROGRAMACAO EM LOGICA", "DCC077-ASPECTOS AVANCADOS EM BANCO DE DADOS", "DCC078-ASPECTOS AVANCADOS EM ENGENHARIA DE SOFTWARE", "DCC079-PROGRAMACAO PARA A WEB", "DCC080-LAB.INTEGRADO DE DESENVOLVIMENTO DE SOFTWARE", "DCC082-SISTEMAS MULTIMIDIA", "DCC083-QUALIDADE DE SOFTWARE", "DCC086-INFORMATICA NA EDUCACAO", "DCC088-GESTAO DA TECNOLOGIA E INOVACAO TECNOLOGICA", "DCC089-TOPICOS EM COMPUTACAO CIENTIFICA I", "DCC090-TOPICOS EM COMPUTACAO CIENTIFICA II", "DCC091-TOPICOS EM REDES E PROCESSAMENTO DISTRIBUIDO I", "DCC092-TOPICOS EM REDES E PROCESSAMENTO DISTRIBUIDO II", "DCC093-TOPICOS EM DESENVOLVIMENTO DE SOFTWARE I", "DCC094-TOPICOS EM DESENVOLVIMENTO DE SOFTWARE II", "DCC095-TOPICOS EM CIENCIA", "TECNOLOGIA E SOCIEDADE I", "DCC096-TOPICOS EM CIENCIA", "TECNOLOGIA E SOCIEDADE II", "DCC097-SEMINARIO EM COMPUTACAO I", "DCC098-SEMINARIO EM COMPUTACAO II", "DCC099-SEMINARIO EM COMPUTACAO III", "DCC100-SEMINARIO EM COMPUTACAO IV", "DCC101-SEMINARIO EM COMPUTACAO V", "DCC102-SEMINARIO EM COMPUTACAO VI", "DCC103-SEMINARIO EM COMPUTACAO VII", "DCC104-SEMINARIO EM COMPUTACAO VIII", "DCC105-SEMINARIO EM COMPUTACAO IX", "DCC107-LABORATORIO DE PROGRAMACAO II", "DCC110-MONOGRAFIA FINAL EM COMPUTAÇÃO", "DCC117-MODELAGEM DE SISTEMAS", "DCC118-INFORMATICA E SOCIEDADE", "DCC119-ALGORITMOS", "DCC119E-ALGORITMOS", "DCC120-LABORATORIO DE PROGRAMACAO", "DCC121-LABORATORIO DE PROGRAMACAO WEB", "DCC122-CIRCUITOS DIGITAIS", "DCC123-METODOLOGIA CIENTIFICA EM COMPUTACAO", "DCC124-AMBIENTES VIRTUAIS DE APRENDIZAGEM", "DCC125-PROGRAMACAO PARALELA", "DCC126-TV DIGITAL", "DCC127-MINERACAO DE DADOS", "DCC128-GERENCIA DE REDES", "DCC129-REALIDADE VIRTUAL E AUMENTADA", "DCC130-COMPUTACAO MOVEL", "UBIQUA E PERVASIVA", "DCC131-PROJETO DE REDES DE COMPUTADORES", "DCC132-ENGENHARIA DE SOFTWARE EXPERIMENTAL", "DCC133-INTRODUCAO A SISTEMAS DE INFORMACAO", "DCC134-MODELAGEM DE SISTEMAS DE INFORMACAO", "DCC136-INTELIGENCIA COMPUTACIONAL", "DCC137-SISTEMAS NEBULOSOS", "DCC138-TOPICOS DE LINGUAGEM PROGRAMACAO I", "DCC139-TOPICOS DE LINGUAGEM PROGRAMACAO II", "DCC140-TOPICOS EM INTELIGENCIA COMPUTACIONAL I", "DCC141-TOPICOS EM INTELIGENCIA COMPUTACIONAL II", "DCC142-ANALISE E PROJETO DE ALGORITMOS II", "DCC143-ADMINISTRACAO DE DADOS", "DCC144-ADMINISTRACAO DE REDES", "DCC145-ASPECTOS ORGANIZACIONAIS DE SISTEMAS DE INFORMACAO", "DCC146-ASPECTOS TEORICOS DA COMPUTACAO", "DCC147-DATA WAREHOUSE", "DCC148-DESENVOLVIMENTO DE JOGOS", "DCC149-ENGENHARIA DE REQUISITOS", "DCC152-FUNDAMENTOS DE DESENVOLVIMENTO WEB", "DCC153-GERENCIA DE CONFIGURAÇÃO DE SOFTWARE", "DCC154-GERENCIA DE PROJETOS", "DCC155-GESTAO DO CONHECIMENTO", "DCC156-LABORATORIO DE PROGRAMACAO IV", "DCC157-LABORATORIO DE PROGRAMACAO V", "DCC158-LABORATORIO DE PROGRAMACAO VI", "DCC159-LABORATORIO DE APLICACOES DE REDES DE COMPUTADORES", "DCC160-LOGICA E FUNDAMENTOS PARA A COMPUTACAO", "DCC161-MODELAGEM DE NEGOCIO", "DCC162-PADROES DE PROJETO", "DCC163-PESQUISA OPERACIONAL", "DCC164-RECUPERACAO DA INFORMACAO", "DCC165-SEGURANCA E AUDITORIA DE SISTEMAS", "DCC166-SISTEMAS DE APOIO A DECISAO", "DCC167-SISTEMAS INTELIGENTES", "DCC168-TESTE DE SOFTWARE", "DCC170-TRABALHO DE CONCLUSAO DE BACHARELADO EM SISTEMAS DE INFORMACAO", "DCC171-LABORATORIO DE PROGRAMACAO III", "DCC172-PROGRAMACAO COMPETITIVA", "DCC173-ANALISE NUMERICA", "DCC174-INTERACAO HUMANO-COMPUTADOR", "DCC175-INTRODUCAO A CIENCIA DA COMPUTACAO", "DCC176-SISTEMAS COLABORATIVOS", "DCC177-PESQUISA OPERACIONAL II", "DCC178-PESQUISA OPERACIONAL III", "DCC179-LABORATORIO DE CIENCIA DA COMPUTACAO", "DCC180-ESTAGIO SUPERVISIONADO", "DCC181-ESTAGIO SUPERVISIONADO II", "DCC182-ESTAGIO SUPERVISIONADO III", "DCC183-ESTAGIO SUPERVISIONADO IV", "DCC184-ESTAGIO SUPERVISIONADO V", "DCC185-ESTAGIO SUPERVISIONADO VI", "DCC186-ESTAGIO SUPERVISIONADO VII", "DCC187-ESTAGIO SUPERVISIONADO VIII", "DCC188-ESTAGIO SUPERVISIONADO IX", "DCC189-ESTAGIO SUPERVISIONADO X", "DCC190-SOLUCAO NUMERICA DE EQUACOES DIFERENCIAIS", "DCC191-VISUALIZACAO CIENTIFICA", "EADDCC001-INTRODUCAO A EAD", "EADDCC002-INTRODUCAO AS TECNOLOGIAS DA INFORMACAO E DA COMUNICACAO", "EADDCC003-LOGICA PARA COMPUTACAO", "EADDCC006-INTRODUCAO AOS SISTEMAS OPERACIONAIS", "EADDCC007-FUNDAMENTOS DA ORGANIZACAO DE COMPUTADORES", "EADDCC008-ALGORITMOS", "EADDCC009-FUNDAMENTOS DE REDES DE COMPUTADORES", "EADDCC011-INGLES INSTRUMENTAL", "EADDCC012-METODOLOGIA DE PESQUISA CIENTIFICA E EDUCACIONAL", "EADDCC013-SEMINARIO INTEGRADO I", "EADDCC014-LINGUAGEM DE PROGRAMACAO I", "EADDCC015-LABORATORIO DE MONTAGEM E MANUTENCAO", "EADDCC021-SEMINARIO INTEGRADO II", "EADDCC023-PROGRAMACAO PARA WEB I", "EADDCC024-FUNDAMENTOS DE SISTEMAS DE INFORMACAO", "EADDCC025-MODELAGEM DE SISTEMAS", "EADDCC029-SISTEMAS MULTIMIDIAS", "EADDCC030-FUNDAMENTOS DE BANCO DE DADOS", "EADDCC031-LINGUAGEM DE PROGRAMACAO II", "EADDCC032-FUNDAMENTOS DE ENGENHARIA DE SOFTWARE", "EADDCC033-METODOS DE ENSINO DE APRENDIZAGEM EM INFORMATICA", "EADDCC034-ESTAGIO SUPERVISIONADO I", "EADDCC035-PROGRAMACAO PARA WEB II", "EADDCC036-INTERFACE USUARIO – MAQUINA", "EADDCC037-PROJETO DE SOFTWARE EDUCACIONAL", "EADDCC038-INFORMATICA NA EDUCACAO", "EADDCC039-OFICINA DE GESTAO DE SALA DE AULA", "EADDCC040-OFICINA DE AVALIACAO EDUCACIONAL", "EADDCC041-ESTAGIO SUPERVISIONADO II", "EADDCC042-TRABALHO DE CONCLUSAO DE CURSO I", "EADDCC043-AVALIACAO DE SOFTWARE EDUCACIONAL", "EADDCC044-INFORMATICA E SOCIEDADE", "EADDCC045-FUNDAMENTOS DA INTELIGENCIA ARTIFICIAL", "EADDCC046-EDUCACAO DE JOVENS E ADULTOS", "EADDCC047-ESTAGIO SUPERVISIONADO III", "EADDCC048-OBJETOS DE APRENDIZAGEM", "EADDCC049-ASPECTOS LEGAIS DA INFORMATICA", "EADDCC050-ESTAGIO SUPERVISIONADO IV", "EADDCC052-TRABALHO DE CONCLUSAO DE CURSO II", "EADQUI002-INTRODUCAO AS TECNOLOGIAS DE COMUNICACAO E INFORMACAO I", "EADQUI009-INTRODUCAO AS TECNOLOGIAS DE COMUNICACAO E INFORMACAO II", "UABFIS005-INTRODUCAO A INFORMATICA", "UABMAT004-INTRODUCAO A INFORMATICA" }));
        codigoDisciplinaSelect.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        codigoDisciplinaSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoDisciplinaSelectActionPerformed(evt);
            }
        });

        notaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notaTFActionPerformed(evt);
            }
        });

        btnCadastrar.setBackground(new java.awt.Color(65, 142, 218));
        btnCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        btnCadastrar.setText("Cadastrar");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 516, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(codigoDisciplinaSelect, 0, 495, Short.MAX_VALUE)
                            .addComponent(jLabel4)
                            .addComponent(notaTF)
                            .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(tituloPrincipal)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(codigoDisciplinaSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(notaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void notaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notaTFActionPerformed

    }//GEN-LAST:event_notaTFActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed

        String nota = notaTF.getText();

        AlunoPersistence alunoP = new AlunoPersistence();
        Set<Aluno> todosAlunos = new HashSet<>();
        todosAlunos = alunoP.findAllSet();

        boolean erro = false;
        if (disciplinaIsValid()) {
            float notaFloat = Float.parseFloat(nota);
            String codigo = (String) codigoDisciplinaSelect.getSelectedItem();
            Disciplina cadDisciplina = new Disciplina(notaFloat, codigo);
            for (Aluno a : todosAlunos) {
                if (a.getMatricula().equals(this.user.getMatricula())) {
                    for (Disciplina d : a.getDisciplinas()) {
                        if (d.getCodigo().equals(cadDisciplina.getCodigo())) {
                            int resposta = JOptionPane.showConfirmDialog(null, cadDisciplina.getCodigo() + " já cadastrada. \nDeseja alterar a nota?", "Confirmação de Alteração", JOptionPane.YES_NO_OPTION);
                            if (resposta == JOptionPane.YES_OPTION) {
                                d.setNota(notaFloat);
                                JOptionPane.showMessageDialog(this, "Nota alterada com sucesso!", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                                alunoP.replace(todosAlunos);
                            }
                            erro = true;
                            codigoDisciplinaSelect.setSelectedIndex(0);
                            notaTF.setText("");
                            break;
                        }
                    }
                    if (erro == false) {

                        a.getDisciplinas().add(cadDisciplina);
                        alunoP.replace(todosAlunos);
                        JOptionPane.showMessageDialog(this, "Disciplina cadastrada", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
                        codigoDisciplinaSelect.setSelectedIndex(0);
                        notaTF.setText("");
                        break;
                    }
                }
            }
        }

    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void codigoDisciplinaSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoDisciplinaSelectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoDisciplinaSelectActionPerformed

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
            if (notaFloat > 100 || notaFloat < 60) {
                JOptionPane.showMessageDialog(this, "Você deve ter passado na disciplina, (nota entre 60 e 100)", "Erro", JOptionPane.ERROR_MESSAGE);
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
    private javax.swing.JComboBox<String> codigoDisciplinaSelect;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField notaTF;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
