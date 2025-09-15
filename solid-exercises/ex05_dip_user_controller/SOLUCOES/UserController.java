package SOLUCOES;

class UserController {
    private final UserRepository repo;
    private final EmailService email;

    public UserController(UserRepository repo, EmailService email) {
        this.repo = repo;
        this.email = email;
    }

    public void register(User use) {
        repo.save(use);
        email.sendWelcome(use.getEmail());
    }
}
