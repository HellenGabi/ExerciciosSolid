package SOLUCOES;

class SmtpEmailService implements EmailService {
    @Override
    public void sendWelcome(String email) {
        System.out.println("Enviando boas-vindas para " + email);
    }
}
