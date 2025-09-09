package SOLUCOES;

class VIPDiscountPolicy implements DiscountPolicy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.2;
    }
}
