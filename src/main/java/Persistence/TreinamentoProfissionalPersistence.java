/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.Bolsa;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marlo
 */
public class TreinamentoProfissionalPersistence implements Persistence<Bolsa>{
        private static final String PATH = DIRECTORY+ File.separator +"treinamentoProfissional.json";
    @Override
    public void save(List<Bolsa> bolsasTP) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasTP);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


}
@Override
    public List<Bolsa> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<Bolsa> listaBolsasTP = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<Bolsa>>() {
            }.getType();
        listaBolsasTP = gson.fromJson(json, tipoLista);

            if (listaBolsasTP == null)
                listaBolsasTP = new ArrayList<>();
        }

        return listaBolsasTP;
    }
     }