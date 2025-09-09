package SOLUCOES;

class EmailNotifier implements EmailSender {
    @Override
    public void sendEmail(String to, String subject, String body) {
        System.out.println("Enviando um Email para " + to + " | Subject: " + subject);
    }
}

