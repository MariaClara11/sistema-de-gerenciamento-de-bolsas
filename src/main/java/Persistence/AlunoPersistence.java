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

public class AlunoPersistence implements Persistence<Aluno> {

    private static final String PATH = DIRECTORY+ File.separator +"alunos.json";
    @Override
    public void save(List<Aluno> alunos) {
        Gson gson = new Gson(); 
        String json = gson.toJson(alunos);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<Aluno> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Aluno> alunos = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Aluno>>() {
            }.getType();
        alunos = gson.fromJson(json, tipoLista);

            if (alunos == null)
                alunos = new ArrayList<>();
        }

        return alunos;
    }
    
    public void replace(List<Aluno> alunos) {
        Gson gson = new Gson();
        String json = gson.toJson(alunos);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }


}
