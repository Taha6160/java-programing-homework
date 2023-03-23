import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter value of a: ");
        double a = input.nextDouble();
        
        while(a == 0) {
            System.out.println("Invalid input: a cannot be zero.\nEnter value of a: ");
            a = input.nextDouble();
        }
        
        System.out.print("Enter value of b: ");
        double b = input.nextDouble();
        
        System.out.print("Enter value of c: ");
        double c = input.nextDouble();
        
        double delta = Math.pow(b, 2) - 4 * a * c;
        switch (numberOfRoots(delta)) {
            case 0:
                System.out.println("There are no real roots.");
                break;
            case 1:
                double x1 = (-b) / (2 * a);
                System.out.printf("The only root is: %.2f\n", x1);
                break;
            case 2:
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                double x3 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.printf("The roots are: %.2f and %.2f\n", x2, x3);
                break;
        }
        input.close();
    }

private static int numberOfRoots(double delta) {
    if (delta < 0) {
        return 0;
    } else if (delta == 0) {
        return 1;
    } else {
        return 2;
    }
}

}
