package SOLUCOES;

public class Main2 {
    public static void main(String[] args) {
        DiscountCalculator calculator = new DiscountCalculator();

        double amount = 200.0;

        double blackFridayDiscount = calculator.calc("BLACK_FRIDAY", amount);
        double coupon10Discount = calculator.calc("COUPON10", amount);
        double vipDiscount = calculator.calc("VIP", amount);

        System.out.println("Desconto Black Friday: " + blackFridayDiscount);
        System.out.println("Desconto COUPON10: " + coupon10Discount);
        System.out.println("Desconto VIP: " + vipDiscount);
    }
}