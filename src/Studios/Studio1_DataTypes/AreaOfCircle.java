package Studios.Studio1_DataTypes;

import java.util.Scanner;

public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a radius: ");
        Double radius = input.nextDouble();


//        while (radius instanceof Double) {
//            System.err.println("Input not of type Double.");//
//        }

        Double area = getArea.getArea(radius);
        System.out.println("The area of a circle of radius " + radius + " is: " + area);

//        Double pi = 3.14;
//        Double area = pi * radius * radius;




    }
}
