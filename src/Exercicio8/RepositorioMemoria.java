package Exercicio8;

import java.util.ArrayList;
import java.util.List;

public abstract class RepositorioMemoria<T> implements Repositorio<T> {

    protected List<T> lista = new ArrayList<>();

    @Override
    public void salvar(T obj) {
        lista.add(obj);
    }

    @Override
    public List<T> listarTodos() {
        return lista;
    }

    public abstract T buscarPorId(int id);
}
