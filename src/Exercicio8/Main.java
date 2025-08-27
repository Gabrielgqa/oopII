package Exercicio8;

public class Main {
    public static void main(String[] args) {
        RepositorioProduto repoProduto = new RepositorioProduto();
        RepositorioCliente repoCliente = new RepositorioCliente();

        repoProduto.salvar(new Produto(1, "Notebook", 3500.0));
        repoProduto.salvar(new Produto(2, "Mouse", 80.0));

        repoCliente.salvar(new Cliente(1, "Gabriel", "gabriel@email.com"));
        repoCliente.salvar(new Cliente(2, "Maria", "maria@email.com"));

        System.out.println("Produto com ID 1: " + repoProduto.buscarPorId(1));
        System.out.println("Cliente com ID 2: " + repoCliente.buscarPorId(2));

        System.out.println("\nLista de Produtos:");
        for (Produto p : repoProduto.listarTodos()) {
            System.out.println(p);
        }

        System.out.println("\nLista de Clientes:");
        for (Cliente c : repoCliente.listarTodos()) {
            System.out.println(c);
        }
    }
}
