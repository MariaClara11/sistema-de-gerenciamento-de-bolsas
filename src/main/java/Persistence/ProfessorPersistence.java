package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.reflect.TypeToken;

import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.mycompany.sistemadegerenciamentodebolsas.Professor;

public class ProfessorPersistence implements Persistence<Professor> {

    private static final String PATH = DIRECTORY+ File.separator +"professor.json";
    @Override
    public void save(List<Professor> professor) {
        Gson gson = new Gson();
        String json = gson.toJson(professor);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<Professor> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Professor> prof = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Professor>>() {
            }.getType();
        prof = gson.fromJson(json, tipoLista);

            if (prof == null)
                prof = new ArrayList<>();
        }

        return prof;
    }


}
