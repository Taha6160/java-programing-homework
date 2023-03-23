import java.util.Random;

public class test9 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 100;
        int max = 0;
        int count = 0;
        while (count < 10) {
            int number = random.nextInt(100) + 1;
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }
            count++;
        }
        System.out.println("The smallest number is " + min);
        System.out.println("The largest number is " + max);
    }

}
