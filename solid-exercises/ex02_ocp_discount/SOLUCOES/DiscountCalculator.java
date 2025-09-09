package SOLUCOES;

class DiscountCalculator {
    double calc(String type, double amount) {
        DiscountPolicy policy = DiscountPolicyFactory.getPolicy(type);
        return policy.applyDiscount(amount);
    }
}
