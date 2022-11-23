import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sideA = 0;
        double sideB = 0;
        double area = 0;
        double perimeter = 0;
        double diag = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.println("Please enter a side A of the rectangle: ");
        if (in.hasNextDouble())
        {
            sideA = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        System.out.println("Please enter a side B of the rectangle: ");
        if (in.hasNextDouble())
        {
            sideB = in.nextDouble();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("You entered " + trash +". Please restart the program and enter a correct value.");
        }

        area = sideA * sideB;
        perimeter = (sideA * 2) + (sideB * 2);
        diag = Math.sqrt((sideA * sideA) + (sideB * sideB));

        System.out.println("The values that you have entered is a rectangle with a perimeter of " + perimeter + ", area of " + area + ", and a diagonal of " + diag);
    }
}