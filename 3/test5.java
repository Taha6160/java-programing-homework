import java.util.Scanner;

public class test5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        float firstNumberKuresa = scanner.nextFloat();
        System.out.print("Enter the second number: ");
        float secondNumberKuresa = scanner.nextFloat();
        float sum = firstNumberKuresa + secondNumberKuresa;
        float difference = firstNumberKuresa - secondNumberKuresa;
        float product = firstNumberKuresa * secondNumberKuresa;
        float quotient = firstNumberKuresa / secondNumberKuresa;
        System.out.printf("Sum: %.2f\n", sum);
        System.out.printf("Difference: %.2f\n", difference);
        System.out.printf("Product: %.2f\n", product);
        System.out.printf("Quotient: %.2f\n", quotient);
        scanner.close();
    }
}
