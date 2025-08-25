package exercicio5;

import java.util.List;

public class GerenciadorDeNotificacoes {
    private List<Notificacao> notificadores;

    public GerenciadorDeNotificacoes(List<Notificacao> notificadores) {
        this.notificadores = notificadores;
    }

    public void notificarTodos(String mensagem) {
        for (Notificacao notificacao : notificadores) {
            notificacao.enviar(mensagem);
        }
    }
}
