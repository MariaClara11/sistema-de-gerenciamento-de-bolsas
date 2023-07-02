/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.Monitoria;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author marlo
 */
public class MonitoriaPersistence implements Persistence<Monitoria>{
    private static final String PATH = DIRECTORY+ File.separator +"monitoria.json";
    @Override
    public void save(List<Monitoria> bolsasMonitoria) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasMonitoria);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


    }

    @Override
    public List<Monitoria> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Monitoria> listaBolsasMonitoria = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Monitoria>>() {
            }.getType();
        listaBolsasMonitoria = gson.fromJson(json, tipoLista);

            if (listaBolsasMonitoria == null)
                listaBolsasMonitoria = new ArrayList<>();
        }

        return listaBolsasMonitoria;
    }
        public void replace(List<Monitoria> bolsasMonitoria) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasMonitoria);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }

    @Override
    public Set<Monitoria> findAllSet() {
        throw new UnsupportedOperationException("Not supported yet."); //Função apenas na Aluno, não necessaria sua implementação aqui
    }

    @Override
    public void saveSet(Set<Monitoria> itens) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
