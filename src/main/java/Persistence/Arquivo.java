package Persistence;

import java.io.*;

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
  
        if(!conteudo.isEmpty()){
            conteudo = conteudo.substring(0, conteudo.length()-2);
            conteudo = conteudo.concat(",\n");
            
            novo = novo.substring(1);
            
            conteudo = conteudo.concat(novo);
        
            salvaAux(filePath, conteudo); 
        }
        else{
            salvaAux(filePath, novo); 
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