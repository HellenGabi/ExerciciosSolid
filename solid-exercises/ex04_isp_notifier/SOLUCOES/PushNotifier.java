package SOLUCOES;

class PushNotifier implements PushSender {
    @Override
    public void sendPush(String deviceToken, String msg) {
        System.out.println("Enviando um Push para " + deviceToken + ": " + msg);
    }
}