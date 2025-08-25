package exercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Notificacao> canaisSelecionados = new ArrayList<>();

        System.out.println("Escolha os canais de notificação (digite os números separados por vírgula):");
        System.out.println("1 - Email");
        System.out.println("2 - SMS");
        System.out.println("3 - Push");

        String escolha = scanner.nextLine();
        String[] opcoes = escolha.split(",");

        for (String opcao : opcoes) {
            switch (opcao.trim()) {
                case "1":
                    canaisSelecionados.add(new EmailNotificacao());
                    break;
                case "2":
                    canaisSelecionados.add(new SmsNotificacao());
                    break;
                case "3":
                    canaisSelecionados.add(new PushNotificacao());
                    break;
                default:
                    System.out.println("Opção inválida: " + opcao);
            }
        }

        if (canaisSelecionados.isEmpty()) {
            System.out.println("Nenhum canal selecionado. Encerrando...");
            return;
        }

        System.out.println("Digite a mensagem a ser enviada:");
        String mensagem = scanner.nextLine();

        GerenciadorDeNotificacoes gerenciador = new GerenciadorDeNotificacoes(canaisSelecionados);
        gerenciador.notificarTodos(mensagem);

        scanner.close();
    }
}
