package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter miles driven: ");
        Double milesDriven = input.nextDouble();

        System.out.println("Enter gas consumed (gallons): ");
        Double gasConsumed = input.nextDouble();

        System.out.println("Miles per gallon: " + (milesDriven/gasConsumed));

    }
}
