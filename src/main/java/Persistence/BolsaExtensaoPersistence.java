/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.Extensao;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class BolsaExtensaoPersistence implements Persistence<Extensao>{
     private static final String PATH = DIRECTORY+ File.separator +"bolsaExtensao.json";
    @Override
    public void save(List<Extensao> bolsasBE) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasBE);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);
}
    @Override
    public List<Extensao> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Extensao> listaBolsasBE = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Extensao>>() {
            }.getType();
        listaBolsasBE = gson.fromJson(json, tipoLista);

            if (listaBolsasBE == null)
                listaBolsasBE = new ArrayList<>();
        }

        return listaBolsasBE;
    }
            public void replace(List<Extensao> bolsasBE) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasBE);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }
    }
