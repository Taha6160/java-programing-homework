import java.util.Scanner;

public class test6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight (kg): ");
        float weightKuresa = scanner.nextFloat();

        System.out.print("Enter your height (cm): ");
        float heightKuresa = scanner.nextFloat();
        heightKuresa = heightKuresa/100;

        float index = weightKuresa / (heightKuresa * heightKuresa);
        index = (float) Math.round(index * 100) / 100; // round to two decimal places

        System.out.printf("Your BMI is %.2f\n", index);

        if (index <= 16.00) {
            System.out.println("Starvation");
        } else if (index > 16.00 && index <= 16.99) {
            System.out.println("Emaciation");
        } else if (index > 17.00 && index <= 18.49) {
            System.out.println("Underweight");
        } else if (index >= 18.50 && index <= 22.99) {
            System.out.println("Normal, low range");
        } else if (index >= 23.00 && index <= 24.99) {
            System.out.println("Normal, high range");
        } else if (index >= 25.00 && index <= 27.49) {
            System.out.println("Overweight, low range");
        } else if (index >= 25.50 && index <= 29.99) {
            System.out.println("Overweight, high range");
        } else if (index >= 30.00 && index < 34.9) {
            System.out.println("1st degree obesity");
        } else if (index >= 16.00 && index < 39.9) {
            System.out.println("2nd degree obesity");
        } else {
            System.out.println("3rd degree obesity");
        }
        scanner.close();
    }
}