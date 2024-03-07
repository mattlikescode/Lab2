import java.math.BigDecimal;
import java.math.RoundingMode;

public class Task5 {
    public static void main(String[] args) {
        double netPricePerProduct = 9.99;
        double vatRate = 23.0;
        double grossPricePerProduct = calculateGrossValue(netPricePerProduct, vatRate);

        System.out.printf("Using double:\n");
        System.out.printf("Gross price of one product: %.2f%n", grossPricePerProduct);

        double totalGross = grossPricePerProduct * 10000;
        System.out.printf("Total gross value for 10,000 pcs: %.2f%n", totalGross);

        double totalNet = calculateNetValue(totalGross, vatRate);
        System.out.printf("Total value excluding VAT for 10,000 pcs: %.2f%n", totalNet);

        BigDecimal netPriceB = new BigDecimal("9.99");
        BigDecimal vatRateB = new BigDecimal("23.0");
        BigDecimal grossPricePerProductB = calculateGrossValueBigDecimal(netPriceB, vatRateB);

        System.out.println("\nUsing BigDecimal:");
        System.out.println("Gross price of one product: " + grossPricePerProductB.setScale(2, RoundingMode.HALF_EVEN));

        BigDecimal totalGrossB = grossPricePerProductB.multiply(new BigDecimal("10000"));
        System.out.println("Total gross value for 10,000 pcs: " + totalGrossB.setScale(2, RoundingMode.HALF_EVEN));

        BigDecimal totalNetB = calculateNetValueBigDecimal(totalGrossB, vatRateB);
        System.out.println("Total value excluding VAT for 10,000 pcs: " + totalNetB.setScale(2, RoundingMode.HALF_EVEN));
    }

    public static double calculateGrossValue(double netPrice, double vatRate) {
        double vatAmount = netPrice * (vatRate / 100);
        return netPrice + vatAmount;
    }

    public static double calculateNetValue(double grossPrice, double vatRate) {
        return grossPrice / (1 + vatRate / 100);
    }

    public static BigDecimal calculateGrossValueBigDecimal(BigDecimal netPrice, BigDecimal vatRate) {
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal vatAmount = netPrice.multiply(vatRate.divide(oneHundred));
        return netPrice.add(vatAmount);
    }

    public static BigDecimal calculateNetValueBigDecimal(BigDecimal grossPrice, BigDecimal vatRate) {
        BigDecimal oneHundred = new BigDecimal("100");
        return grossPrice.divide(vatRate.divide(oneHundred).add(BigDecimal.ONE), 2, RoundingMode.HALF_EVEN);
    }
}
