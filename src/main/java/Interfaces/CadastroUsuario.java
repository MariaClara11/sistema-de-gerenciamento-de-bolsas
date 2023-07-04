/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import Persistence.AlunoPersistence;
import Persistence.Persistence;
import Persistence.ProfessorPersistence;
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import java.util.regex.Pattern;
import javax.swing.text.DefaultFormatterFactory;
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
public class CadastroUsuario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroUsuario
     */
    Aluno user = new Aluno();
    public CadastroUsuario() {

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
        this.jScrollPane1.getVerticalScrollBar().setUnitIncrement(10);
        //this.user = user;
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

        tipoDeUsuario = new javax.swing.ButtonGroup();
        Esquerda = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Direita = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        rbProfessor = new javax.swing.JRadioButton();
        rbAluno = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        nomeTF = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        nascimentoTF = new javax.swing.JFormattedTextField(Mascara("##/##/####"));
        txtCPForSIAPE = new javax.swing.JLabel();
        cpfTF = new javax.swing.JFormattedTextField(Mascara("###.###.###-##"));
        jLabelUser = new javax.swing.JLabel();
        matriculaTF = new javax.swing.JFormattedTextField(Mascara("#########AA"));
        jLabel12 = new javax.swing.JLabel();
        senhaTF = new javax.swing.JPasswordField();
        jLabel13 = new javax.swing.JLabel();
        confirmarSenhaTF = new javax.swing.JPasswordField();
        cadastrarBTN = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        Esquerda.setBackground(new java.awt.Color(65, 142, 218));
        Esquerda.setForeground(new java.awt.Color(255, 255, 255));
        Esquerda.setMinimumSize(new java.awt.Dimension(1092, 552));
        Esquerda.setPreferredSize(new java.awt.Dimension(1092, 552));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/UFJF-logo-AFD67C1C88-seeklogo.com.png"))); // NOI18N

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("SISTEMA DE ");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("GERÊNCIA ");

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("DE BOLSAS");

        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        jScrollPane1.setMinimumSize(new java.awt.Dimension(546, 552));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(546, 552));

        Direita.setBackground(new java.awt.Color(255, 255, 255));
        Direita.setMinimumSize(new java.awt.Dimension(546, 1000));
        Direita.setPreferredSize(new java.awt.Dimension(546, 1000));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Nome:");

        rbProfessor.setBackground(new java.awt.Color(255, 255, 255));
        tipoDeUsuario.add(rbProfessor);
        rbProfessor.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbProfessor.setForeground(new java.awt.Color(51, 51, 51));
        rbProfessor.setText("Professor");
        rbProfessor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbProfessorMouseClicked(evt);
            }
        });
        rbProfessor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbProfessorActionPerformed(evt);
            }
        });

        rbAluno.setBackground(new java.awt.Color(255, 255, 255));
        tipoDeUsuario.add(rbAluno);
        rbAluno.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        rbAluno.setForeground(new java.awt.Color(51, 51, 51));
        rbAluno.setText("Aluno");
        rbAluno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rbAlunoMouseClicked(evt);
            }
        });
        rbAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlunoActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 142, 218));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Cadastro");

        nomeTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomeTFActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Tipo User:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Data de Nascimento:");

        nascimentoTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nascimentoTFActionPerformed(evt);
            }
        });

        txtCPForSIAPE.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtCPForSIAPE.setText("CPF:");

        jLabelUser.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabelUser.setText("Matrícula:");

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Senha:");

        senhaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                senhaTFActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Confirmar Senha:");

        confirmarSenhaTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmarSenhaTFActionPerformed(evt);
            }
        });

        cadastrarBTN.setBackground(new java.awt.Color(65, 142, 218));
        cadastrarBTN.setForeground(new java.awt.Color(255, 255, 255));
        cadastrarBTN.setText("Cadastrar");
        cadastrarBTN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cadastrarBTNMouseClicked(evt);
            }
        });
        cadastrarBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrarBTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout DireitaLayout = new javax.swing.GroupLayout(Direita);
        Direita.setLayout(DireitaLayout);
        DireitaLayout.setHorizontalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
                    .addGroup(DireitaLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelUser)
                            .addComponent(txtCPForSIAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(DireitaLayout.createSequentialGroup()
                                .addComponent(rbProfessor)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeTF, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                            .addComponent(nascimentoTF)
                            .addComponent(cpfTF)
                            .addComponent(matriculaTF)
                            .addComponent(senhaTF)
                            .addComponent(confirmarSenhaTF))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        DireitaLayout.setVerticalGroup(
            DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DireitaLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DireitaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbProfessor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nomeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nascimentoTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCPForSIAPE, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cpfTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(matriculaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(senhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmarSenhaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(cadastrarBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(232, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(Direita);

        javax.swing.GroupLayout EsquerdaLayout = new javax.swing.GroupLayout(Esquerda);
        Esquerda.setLayout(EsquerdaLayout);
        EsquerdaLayout.setHorizontalGroup(
            EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EsquerdaLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(EsquerdaLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                        .addGap(74, 74, 74))
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EsquerdaLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 582, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        EsquerdaLayout.setVerticalGroup(
            EsquerdaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(EsquerdaLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(Logo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu1.setText("Voltar");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Esquerda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrarBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrarBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastrarBTNActionPerformed

    private void nomeTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomeTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nomeTFActionPerformed

    private void rbProfessorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbProfessorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbProfessorActionPerformed

    private void rbAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlunoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAlunoActionPerformed

    private void senhaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_senhaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_senhaTFActionPerformed

    private void confirmarSenhaTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmarSenhaTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmarSenhaTFActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jMenu1MouseClicked

    private void cadastrarBTNMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cadastrarBTNMouseClicked
        // TODO add your handling code here:

        if (tipoDeUsuario.getSelection() != null) {

            String nome = nomeTF.getText();
            String cpf = cpfTF.getText();
            String nascimento = nascimentoTF.getText();
            String matricula = matriculaTF.getText();
            char[] senhaC = senhaTF.getPassword();
            String senha = String.valueOf(senhaC);
            char[] senhaCc = confirmarSenhaTF.getPassword();
            String confirmarSenha = String.valueOf(senhaCc);

            if (rbProfessor.isSelected()) {
                // Código para quando o RadioButton 'rbProfessor' estiver selecionado

                if (validarNome(nome)) {
                    if (validarCPF(cpf)) {
                        if (validarData(nascimento)) {
                            if (validarSiape(matricula)) {
                                try {
                                    double matriculaValida = Double.parseDouble(matricula);
                                    if (senha.length() >= 8) {
                                        if (senha.equals(confirmarSenha)) {
                                            // calcular a idade apartir da data de nascimento
                                            //validar dados dos campos

                                            try {
                                                String hash = gerarHash(senha);
                                                Professor professor = new Professor(matricula, nome, cpf, nascimento, hash);
                                                Set<Professor> listaProfessor = new HashSet<>();
                                                listaProfessor.add(professor);

                                                Persistence<Professor> professorPersistence = new ProfessorPersistence();

                                                professorPersistence.saveSet(listaProfessor);
                                                JOptionPane.showMessageDialog(this, nome + " cadastrado com sucesso", "Sucesso", JOptionPane.DEFAULT_OPTION);
                                                dispose();

                                            } catch (NoSuchAlgorithmException e) {
                                                System.out.println("Algoritmo de hash não encontrado: " + e.getMessage());
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Senhas diferentes!", "Erro", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Insira uma senha de no minimo 8 digitos", "Erro", JOptionPane.ERROR_MESSAGE);
                                    }

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(this, "Por favor, digite apenas numeros para SIAPE!", "Erro", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                }

            } else if (rbAluno.isSelected()) {

                if (validarNome(nome)) {
                    if (validarCPF(cpf)) {
                        if (validarData(nascimento)) {
                            if (validarMatricula(matricula)) {
                                try {
                                    String mat = matricula.substring(0, 8);
                                    double matValida = Double.parseDouble(mat);
                                    if (senha.length() >= 8) {
                                        if (senha.equals(confirmarSenha) && senha.length() >= 8) {

                                            // calcular a idade apartir da data de nascimento
                                            //validar dados dos campos
                                            try {
                                                String hash = gerarHash(senha);
                                                Aluno aluno = new Aluno(matricula, nome, cpf, nascimento, hash);
                                                Set<Aluno> listaAluno = new HashSet<>();
                                                listaAluno.add(aluno);

                                                Persistence<Aluno> alunoPersistence = new AlunoPersistence();

                                                alunoPersistence.saveSet(listaAluno);
                                                JOptionPane.showMessageDialog(this, nome + " cadastrado com sucesso", "Cadastrado realizado!", JOptionPane.DEFAULT_OPTION);
                                                dispose();
                                            } catch (NoSuchAlgorithmException e) {
                                                System.out.println("Algoritmo de hash não encontrado: " + e.getMessage());
                                            }

                                        } else {
                                            JOptionPane.showMessageDialog(this, "Senhas diferentes!", "Erro", JOptionPane.ERROR_MESSAGE);
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(this, "Insira uma senha de no minimo 8 digitos", "Erro", JOptionPane.ERROR_MESSAGE);
                                    }

                                } catch (NumberFormatException e) {
                                    JOptionPane.showMessageDialog(this, "Por favor, digite apenas numeros para MATRICULA!", "Erro", JOptionPane.ERROR_MESSAGE);
                                }

                            } else {
                                //JOptionPane.showMessageDialog(this, "MATRICULA INCORRETA!", "Erro", JOptionPane.ERROR_MESSAGE);
                            }
                        }
                    }
                }
            }
        } else {
            // Nenhum RadioButton selecionado
            JOptionPane.showMessageDialog(this, "Por favor, selecione o tipo de usuario", "Erro", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_cadastrarBTNMouseClicked

    private void rbProfessorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbProfessorMouseClicked
        // TODO add your handling code here:
        jLabelUser.setText("Siape:");
        DefaultFormatterFactory newFactory = new DefaultFormatterFactory(Mascara("#####"));
        matriculaTF.setFormatterFactory(newFactory);


    }//GEN-LAST:event_rbProfessorMouseClicked

    private void rbAlunoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rbAlunoMouseClicked
        jLabelUser.setText("Matricula:");
        DefaultFormatterFactory newFactory = new DefaultFormatterFactory(Mascara("#########AA"));
        matriculaTF.setFormatterFactory(newFactory);

    }//GEN-LAST:event_rbAlunoMouseClicked

    private void nascimentoTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nascimentoTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nascimentoTFActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroUsuario.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Direita;
    private javax.swing.JPanel Esquerda;
    private javax.swing.JLabel Logo;
    private javax.swing.JButton cadastrarBTN;
    private javax.swing.JPasswordField confirmarSenhaTF;
    private javax.swing.JFormattedTextField cpfTF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JFormattedTextField matriculaTF;
    private javax.swing.JFormattedTextField nascimentoTF;
    private javax.swing.JTextField nomeTF;
    private javax.swing.JRadioButton rbAluno;
    private javax.swing.JRadioButton rbProfessor;
    private javax.swing.JPasswordField senhaTF;
    private javax.swing.ButtonGroup tipoDeUsuario;
    private javax.swing.JLabel txtCPForSIAPE;
    // End of variables declaration//GEN-END:variables

    private boolean validarSiape(String siape) {
        
        siape = siape.toUpperCase();
        if (siape.length() == 5) {
            ProfessorPersistence professores = new ProfessorPersistence();
            for (Professor p : professores.findAllSet()) {
                if (p.getSiap().equals(siape)) {
                    JOptionPane.showMessageDialog(this, "Siape ja cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Siape incorreto!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    private boolean validarMatricula(String matricula) {
        
        matricula = matricula.toUpperCase();
        if (matricula.length() >= 9 && matricula.length() <= 11) {
            AlunoPersistence alunos = new AlunoPersistence();
            for (Aluno p : alunos.findAllSet()) {
                if (p.getMatricula().equals(matricula)) {
                    JOptionPane.showMessageDialog(this, "Matricula ja cadastrado", "Erro", JOptionPane.ERROR_MESSAGE);
                    return false;
                }
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Matricula incorreta!", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validarNome(String name) {
        // Regex para verificar se o nome contém apenas letras e espaços em branco

        String regex = "^[a-zA-Z\\s]+$";
        // Verifica se o nome corresponde ao regex
        if (name.matches(regex) == true && name.length() > 3) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Digite um nome valido", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

    }

    public boolean validarCPF(String cpf) {
        String cpfRegex = "\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}";

        if (Pattern.matches(cpfRegex, cpf) && cpf.length() == 14) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, insira 11 numeros para o CPF", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }

    public boolean validarData(String ingresso) {

        String regexData = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/([0-9]{4})$";

        if (!Pattern.matches(regexData, ingresso)) {
            JOptionPane.showMessageDialog(this, "Insira uma data valida (dd/mm/aaaa)", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        DateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println(ingresso);
            System.out.println(this.user.getDataNascimento());
            Date ingressoD = formato.parse(ingresso);
            Date dataAtual = new Date();
      

            if (ingressoD.after(dataAtual)){
                JOptionPane.showMessageDialog(this, "Insira uma data valida (dd/mm/aaaa)", "Erro", JOptionPane.ERROR_MESSAGE);
                return false;
            }
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "Insira uma data valida (dd/mm/aaaa)", "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    public static String gerarHash(String texto) throws NoSuchAlgorithmException {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] hashBytes = digest.digest(texto.getBytes(StandardCharsets.UTF_8));
        return bytesToHex(hashBytes);
    }

    public static String bytesToHex(byte[] bytes) {
        StringBuilder result = new StringBuilder();
        for (byte b : bytes) {
            result.append(String.format("%02x", b));
        }
        return result.toString();
    }
}
