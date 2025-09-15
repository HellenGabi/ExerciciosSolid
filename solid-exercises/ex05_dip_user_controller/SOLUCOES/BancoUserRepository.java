package SOLUCOES;

class BancoUserRepository implements UserRepository {
    @Override
    public void save(User use) {
        System.out.println("Salvando usuario " + use.getEmail() + " no banco");
    }
}

























