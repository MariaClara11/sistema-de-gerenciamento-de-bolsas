package Persistence;

import java.io.*;
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
public class Arquivo {

    public static String le(String filePath) {

        StringBuilder content = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            //e.printStackTrace();
        }

        return content.toString();
    }

    public static void salva(String filePath, String novo) {

        String conteudo = le(filePath);

        if (conteudo.indexOf("]")== 1) {
            
            //conteudo = conteudo.replace("[", "");
            conteudo = conteudo.replace("]", "");
            
            
            // conteudo = conteudo.substring(0, conteudo.length() - 2);
            // conteudo = conteudo.concat(",\n");

            novo = novo.substring(1);

            conteudo = conteudo.concat(novo);

            salvaAux(filePath, conteudo);
            
        } else if (!conteudo.isEmpty()) {

            conteudo = conteudo.substring(0, conteudo.length() - 2);
            conteudo = conteudo.concat(",\n");

            novo = novo.substring(1);

            conteudo = conteudo.concat(novo);

            salvaAux(filePath, conteudo);

        } else {
            salvaAux(filePath, novo);
        }

    }

    public static void replace(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void salvaAux(String filePath, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
