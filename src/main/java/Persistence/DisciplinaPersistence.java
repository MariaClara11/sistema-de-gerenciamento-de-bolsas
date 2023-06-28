/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.Disciplina;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class DisciplinaPersistence implements Persistence<Disciplina>{
         private static final String PATH = DIRECTORY+ File.separator +"disciplinas.json";
    @Override
    public void save(List<Disciplina> disciplinas) {
        Gson gson = new Gson();
        String json = gson.toJson(disciplinas);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);
}
    @Override
    public List<Disciplina> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Disciplina> listaDisciplinas = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Disciplina>>() {
            }.getType();
        listaDisciplinas = gson.fromJson(json, tipoLista);

            if (listaDisciplinas == null)
                listaDisciplinas = new ArrayList<>();
        }

        return listaDisciplinas;
    }
}
