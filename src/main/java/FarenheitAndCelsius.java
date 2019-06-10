import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class FarenheitAndCelsius {

    public static double celsiusToFahrenheit(double a) {
        double fahrenheit = (9.0 / 5) * a + 32;
        return fahrenheit;
    }

    ;

    public static double fahrenheitToCelsius(double b) {
        double celsius = (5.0 / 9) * (b - 32);
        return celsius;
    }

    ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat(("#.00"));
        double fahrenheit, celsius;
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Fahrenheit to Celsius");
            System.out.println("2. Celsius to Fahreheit");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Fahrenheit: ");
                    fahrenheit = scanner.nextDouble();
                    System.out.println("Farenheit to Celsius: " + format.format(fahrenheitToCelsius(fahrenheit)) + " C" + "\n");
                    break;
                case 2:
                    System.out.println("Enter Celsius: ");
                    celsius = scanner.nextDouble();
                    System.out.println("Celsius to Fareheit1: " + format.format(celsiusToFahrenheit(celsius)) + " F" + "\n");
                    break;
                case 0:
                    System.exit(0);
            }
        }
        while (choice != 0);
    }
}
