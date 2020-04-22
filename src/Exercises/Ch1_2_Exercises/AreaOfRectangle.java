package Ch1_2_Exercises;

import java.util.Scanner;

public class AreaOfRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter rectangle length: ");
        Double length = input.nextDouble();

        System.out.println("Enter rectangle width: ");
        Double width = input.nextDouble();

        System.out.println("Rectangle area: " + length + "*" + width + " = " + (length * width));

    }
}
