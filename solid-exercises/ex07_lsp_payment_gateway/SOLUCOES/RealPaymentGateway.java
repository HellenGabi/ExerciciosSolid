package SOLUCOES;

class RealPaymentGateway implements PaymentGateway {
    @Override
    public PaymentResult cobranca(double amount) {
        String code = "AUTORIZADO-" + System.currentTimeMillis();
        return new PaymentResult(true, code);
    }
}
