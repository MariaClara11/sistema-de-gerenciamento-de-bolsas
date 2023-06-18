/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Interfaces;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author igor
 */
public class HomeProfessorAntigo extends JFrame {
    
    public HomeProfessorAntigo() {
    
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);
        setLocationRelativeTo(null);
        
        JButton botaoCadastrarBolsa = new JButton("Cadastrar Bolsa");
        JButton botaoViewBolsas = new JButton("Minhas Bolsas");
        JButton botaoVerPerfil = new JButton("Perfil");
        
        botaoCadastrarBolsa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela atual
                CadastroBolsa cadastroBolsa = new CadastroBolsa();
                cadastroBolsa.setVisible(true); // Abre a nova tela
            }
        });
            
        botaoViewBolsas.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //dispose(); // Fecha a tela atual
                //VisualizacaoBolsa visualizacaoBolsa = new VisualizacaoBolsa();
                //visualizacaoBolsa.setVisible(true); // Abre a nova tela
            }
        });
        
        botaoVerPerfil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose(); // Fecha a tela atual
                VisualizacaoPerfilProfessor visualizacaoPerfil = new VisualizacaoPerfilProfessor();
                visualizacaoPerfil.setVisible(true); // Abre a nova tela
            }
        });

        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(botaoCadastrarBolsa);
        getContentPane().add(botaoViewBolsas);
        getContentPane().add(botaoVerPerfil);
    }

    public static void main(String[] args) {
        HomeProfessorAntigo menu = new HomeProfessorAntigo();
        menu.setVisible(true);
    }
}


