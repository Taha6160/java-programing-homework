import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read in the amount of Lego bricks
        System.out.print("Enter the number of Lego bricks (between 50 and 100): ");
        int amountOfBricks = scanner.nextInt();

        // Read in the container capacity
        System.out.print("Enter the number of blocks that fit in one container (between 5 and 10): ");
        int containerCapacity = scanner.nextInt();

        // Calculate the number of full containers
        int fullContainers = amountOfBricks / containerCapacity;

        // Calculate the total number of containers (full and not full)
        int totalContainers = (int) Math.ceil((double) amountOfBricks / containerCapacity);

        // Calculate the number of blocks in the partially filled container
        int partialContainerBlocks = amountOfBricks % containerCapacity;

        // Print out the results
        System.out.println("Number of full containers: " + fullContainers);
        System.out.println("Total number of containers: " + totalContainers);
        System.out.println("Number of blocks in the partially filled container: " + partialContainerBlocks);
        scanner.close();
    }
}