import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter the number of temperatures: ");
        int numTemps = scanner.nextInt();


        double[] temperatures = new double[numTemps];
        double total = 0;

        for (int i = 0; i < numTemps; i++) {
            System.out.print("Enter temperature " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();
            total += temperatures[i];
        }

        double averageTemp = total / numTemps;

        int aboveAverageCount = 0;
        for (double temp : temperatures) {
            if (temp > averageTemp) {
                aboveAverageCount++;
            }
        }


        System.out.printf("\nThe average temperature is: %.2f\n", averageTemp);
        System.out.println("The number of days above the average temperature is: " + aboveAverageCount);

        scanner.close();
    }
}