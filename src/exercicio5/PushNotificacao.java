package exercicio5;

public class PushNotificacao implements Notificacao {
    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem push: " + mensagem);
    }
}
