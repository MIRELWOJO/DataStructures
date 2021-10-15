package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a temperature in fahrenheit to retrieve it in Celcius");
        int temp = input.nextInt();
        double tempChange = ((double) temp - 32) * (.5555);
        System.out.println(temp + " degrees fahrenheit is " + tempChange + " degrees Celsius");


        System.out.println("Enter a number of hours to retrieve it in hours and minutes ");
        double hours = input.nextDouble();
        int timeHours = (int) (hours);
        double timeReminder = ((double) hours % 1);
        int timeMinutes = (int)(timeReminder * 60);
        double timeConvert = (int)(hours);

        System.out.println(timeHours + " hours");
        System.out.println(timeMinutes + " minutes");


        System.out.println(" Enter a height and width of an area to retrieve it in acres ");
        System.out.println("Enter a height (in feet)");
        double width = input.nextDouble();
        System.out.println("Enter a width (in feet)");
        double height = input.nextDouble();
        double area = (width + (height));
        double acres = (area / 43560);
        System.out.println(acres + " acres");






        }
}

