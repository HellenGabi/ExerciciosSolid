package SOLUCOES;

class Cupom10DiscontoPolicy implements DiscountPolicy {
    @Override
    public double applyDiscount(double amount) {
        return amount * 0.1;
    }
}
