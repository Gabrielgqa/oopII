package Exercicio8;

public class RepositorioCliente extends RepositorioMemoria<Cliente> {
    @Override
    public Cliente buscarPorId(int id) {
        for (Cliente c : lista) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }
}
