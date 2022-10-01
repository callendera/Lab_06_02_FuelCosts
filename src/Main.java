import java.util.*;
public class Main
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double p;
        double n;
        double e;

        System.out.print("Enter number of gallons of gas in the tank: ");
        n = scanner.nextDouble();

        System.out.print("Enter the fuel efficiency in miles per gallon: ");
        e = scanner.nextDouble();

        System.out.print("Price per gallon: ");
        p = scanner.nextDouble();



        if(n < 0 || e < 0 || p < 0)
            System.out.println("Error: Bad Input!!");
        else
        {
            System.out.println("Cost of 100 mile: $"+ ((100/e)*p));

            System.out.printf("Car can go about %.2f miles",(e*n));

        }

    }

}