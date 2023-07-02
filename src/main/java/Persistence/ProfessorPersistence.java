package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;
import java.util.HashSet;
import java.util.Set;

public class ProfessorPersistence implements Persistence<Professor> {

    private static final String PATH = DIRECTORY+ File.separator +"professor.json";
    @Override
    public void saveSet(Set<Professor> professor) {
        Gson gson = new Gson();
        String json = gson.toJson(professor);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public Set<Professor> findAllSet() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        Set<Professor> prof = new HashSet<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<Set<Professor>>() {
            }.getType();
        prof = gson.fromJson(json, tipoLista);

            if (prof == null)
                prof = new HashSet<>();
        }

        return prof;
    }
    
    public void replace(Set<Professor> professor) {
        Gson gson = new Gson();
        String json = gson.toJson(professor);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);

    }


    @Override
    public void save(List<Professor> itens) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Professor> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }


}
