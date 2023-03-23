import java.math.*;

public class test4 {

    private static final BigDecimal NET_PRICE = new BigDecimal("9.99");
    private static final BigDecimal VAT_RATE = new BigDecimal("0.23");
    private static final BigDecimal MULTIPLIER = new BigDecimal("10000");

    public static BigDecimal calculateGrossPrice(BigDecimal netPrice, BigDecimal vatRate) {
        return netPrice.multiply(BigDecimal.ONE.add(vatRate)).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateTotalGrossPrice(BigDecimal grossPrice, BigDecimal multiplier) {
        return grossPrice.multiply(multiplier).setScale(2, RoundingMode.HALF_UP);
    }

    public static BigDecimal calculateTotalNetPrice(BigDecimal totalGrossPrice, BigDecimal vatRate) {
        return totalGrossPrice.divide(BigDecimal.ONE.add(vatRate), 2, RoundingMode.HALF_UP);
    }

    public static void main(String[] args) {
        BigDecimal grossPrice = calculateGrossPrice(NET_PRICE, VAT_RATE);
        BigDecimal totalGrossPrice = calculateTotalGrossPrice(grossPrice, MULTIPLIER);
        BigDecimal totalNetPrice = calculateTotalNetPrice(totalGrossPrice, VAT_RATE);

        System.out.println("Net price: " + NET_PRICE);
        System.out.println("Gross price: " + grossPrice);
        System.out.println("Total gross price: " + totalGrossPrice);
        System.out.println("Total net price: " + totalNetPrice);
    }

   

}
