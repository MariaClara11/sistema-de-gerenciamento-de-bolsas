package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.mycompany.sistemadegerenciamentodebolsas.Aluno;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
import java.util.HashSet;
import java.util.Set;
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
public class AlunoPersistence implements Persistence<Aluno> {

    private static final String PATH = DIRECTORY+ File.separator +"alunos.json";
    @Override
    public void saveSet(Set<Aluno> alunos) {
        Gson gson = new Gson(); 
        String json = gson.toJson(alunos);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public Set<Aluno> findAllSet() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        Set<Aluno> alunos = new HashSet<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<Set<Aluno>>() {
            }.getType();
        alunos = gson.fromJson(json, tipoLista);

            if (alunos == null)
                alunos = new HashSet<>();
        }

        return alunos;
    }
    
    public void replace(Set<Aluno> alunos) {
        Gson gson = new Gson();
        String json = gson.toJson(alunos);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }

    @Override
    public List<Aluno> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); //Função apenas na Aluno, não necessaria sua implementação aqui
    }

    @Override
    public void save(List<Aluno> itens) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
