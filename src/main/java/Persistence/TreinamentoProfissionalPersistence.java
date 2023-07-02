/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistence;

import static Persistence.Persistence.DIRECTORY;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.mycompany.sistemadegerenciamentodebolsas.Projeto;
import com.mycompany.sistemadegerenciamentodebolsas.TreinamentoProfissional;
import java.io.File;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author marlo
 */
public class TreinamentoProfissionalPersistence implements Persistence<TreinamentoProfissional>{
        private static final String PATH = DIRECTORY+ File.separator +"treinamentoProfissional.json";
    @Override
    public void save(List<TreinamentoProfissional> bolsasTP) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasTP);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.salva(PATH, json);


}
@Override
    public List<TreinamentoProfissional> findAll() {
        Gson gson = new Gson();

        String json = Arquivo.le(PATH);

        List<TreinamentoProfissional> listaBolsasTP = new ArrayList<>();
        if(!json.trim().equals("")) {

            Type tipoLista = new TypeToken<List<TreinamentoProfissional>>() {
            }.getType();
        listaBolsasTP = gson.fromJson(json, tipoLista);

            if (listaBolsasTP == null)
                listaBolsasTP = new ArrayList<>();
        }

        return listaBolsasTP;
    }
            public void replace(List<TreinamentoProfissional> bolsasTP) {
        Gson gson = new Gson();
        String json = gson.toJson(bolsasTP);

        File diretorio = new File(DIRECTORY);
        if(!diretorio.exists())
            diretorio.mkdirs();

        Arquivo.replace(PATH, json);


    }

    @Override
    public Set<TreinamentoProfissional> findAllSet() {
        throw new UnsupportedOperationException("Not supported yet."); //Função apenas na Aluno, não necessaria sua implementação aqui
    }

    @Override
    public void saveSet(Set<TreinamentoProfissional> itens) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     }