/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.IniciacaoCientifica;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class IniciacaoCientificaPersistence implements Persistence<IniciacaoCientifica> {

    private static final String PATH = DIRECTORY + File.separator + "iniciacaoCientifica.json";

    @Override
    public void save(List<IniciacaoCientifica> bolsasIC) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasIC);

        File diretorio = new File(DIRECTORY);
        if (!diretorio.exists()) {
            diretorio.mkdirs();
        }

        Arquivo.salva(PATH, json);
    }

    @Override
    public List<IniciacaoCientifica> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<IniciacaoCientifica> listaBolsasIC = new ArrayList<>();
        if (!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<IniciacaoCientifica>>() {
            }.getType();
            listaBolsasIC = gson.fromJson(json, tipoLista);

            if (listaBolsasIC == null) {
                listaBolsasIC = new ArrayList<>();
            }
        }

        return listaBolsasIC;
    }
            public void replace(List<IniciacaoCientifica> bolsasIC) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasIC);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }
}
