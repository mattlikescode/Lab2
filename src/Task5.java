public class Task5 {
    public static void main(String[] args) {
        double netPricePerProduct = 9.99;
        double vatRate = 23.0;
        double grossPricePerProduct = calculateGrossValue(netPricePerProduct, vatRate);

        System.out.printf("Gross price of one product: %.2f%n", grossPricePerProduct);

        double totalGross = grossPricePerProduct * 10000;

        System.out.printf("Total gross value for 10,000 pcs: %.2f%n", totalGross);

        double totalNet = calculateNetValue(totalGross, vatRate);
        System.out.printf("Total value excluding VAT for 10,000 pcs: %.2f%n", totalNet);
    }

    public static double calculateGrossValue(double netPrice, double vatRate) {
        double vatAmount = netPrice * (vatRate / 100);
        return netPrice + vatAmount;
    }

    public static double calculateNetValue(double grossPrice, double vatRate) {
        return grossPrice / (1 + vatRate / 100);
    }



}
