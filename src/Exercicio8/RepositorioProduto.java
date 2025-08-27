package Exercicio8;

public class RepositorioProduto extends RepositorioMemoria<Produto> {
    @Override
    public Produto buscarPorId(int id) {
        for (Produto p : lista) {
            if (p.getId() == id) {
                return p;
            }
        }
        return null;
    }
}
