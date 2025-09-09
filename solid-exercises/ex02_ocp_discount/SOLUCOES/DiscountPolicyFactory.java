package SOLUCOES;

public class DiscountPolicyFactory {

    public static DiscountPolicy getPolicy(String type) {
        switch (type) {
            case "BLACK_FRIDAY":
                return new BlackFridayDiscontoPolicy();
            case "COUPON10":
                return new Cupom10DiscontoPolicy();
            case "VIP":
                return new VIPDiscountPolicy();
            default:
                throw new IllegalArgumentException("Desconto não encontrado");
        }
    }
}
