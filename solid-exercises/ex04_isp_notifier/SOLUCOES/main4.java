package SOLUCOES;

public class main4 {
    public static void main(String[] args) {
        SmsSender sms = new SmsNotifier();
        EmailSender email = new EmailNotifier();
        PushSender push = new PushNotifier();

        sms.sendSms("+55 47 99169-4665", "Olá Hellen, esse é uma mensagem nova!");
        email.sendEmail("hellen@email.com", "Bem-vinda", "Obrigado por me testar");
        push.sendPush("hellengabi123", "Você ganhou um bônus!");
    }
}

