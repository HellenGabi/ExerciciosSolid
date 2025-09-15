package SOLUCOES;

public class Main7 {
    public static void main(String[] args) {
        PaymentGateway gateway = new RealPaymentGateway();
        PaymentResult result = gateway.cobranca(51.22);

        System.out.println("Pagamento ok? " + result.success);
        System.out.println("AuthCode: " + result.authCode);

        System.out.println("----");

        FreeTrialService freeTrial = new FreeTrialService();
        freeTrial.TesteGratuito("user@email.com");
    }
}
