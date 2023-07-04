package Persistence;

import java.util.List;
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
public interface Persistence<T> {

    String DIRECTORY = "data";
    public void save(List<T> itens);
    public void saveSet(Set<T> itens);
    public List<T> findAll(); // metodo para buscar tudo em um ArrayList
    public Set<T> findAllSet(); // metodo para buscar tudo em um HashSet

}
