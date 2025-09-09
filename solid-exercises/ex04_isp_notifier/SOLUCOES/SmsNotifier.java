package SOLUCOES;

class SmsNotifier implements SmsSender {
    @Override
    public void sendSms(String phone, String text) {
        System.out.println("Enviando um SMS para " + phone + ": " + text);
    }
}