package SOLUCOES;


import java.util.List;

class InvoiceCalculator {
    public double calculateTotal(List<Double> items, double tax) {
        double sum = 0;
        for (Double item : items) sum += item;
        return sum * (1 + tax);
    }

}
