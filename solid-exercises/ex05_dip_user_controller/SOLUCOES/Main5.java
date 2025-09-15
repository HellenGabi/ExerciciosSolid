package SOLUCOES;

public class Main5 {
        public static void main(String[] args) {
            UserRepository repo = new BancoUserRepository();
            EmailService email = new SmtpEmailService();

            UserController controller = new UserController(repo, email);

            User u = new User("hellen@gmail.com");
            controller.register(u);
        }
    }

