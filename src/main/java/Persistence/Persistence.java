package Persistence;

import java.util.List;
import java.util.Set;

public interface Persistence<T> {

    String DIRECTORY = "data";
    public void save(List<T> itens);
    public void saveSet(Set<T> itens);
    public List<T> findAll(); // metodo para buscar tudo em um ArrayList
    public Set<T> findAllSet(); // metodo para buscar tudo em um HashSet

}
