import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display Program Title
        System.out.println("Temperature Converter Program");

        // Display options
        System.out.println("Select an option(1 or 2):");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");

        // Accept user's response
        int userOption = scanner.nextInt();

        // Running conditions based on users input
        if (userOption == 1) {
            // Converts from Celsius to Fahrenheit
            System.out.println("Enter temperature in celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.print("The temperature in fahrenheit is ");
            System.out.println(fahrenheit);
        } else if (userOption == 2) {
            // Converts from Fahrenheit to Celsius
            System.out.println("Enter temperature in fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.print("The temperature in celsius is ");
            System.out.println(celsius);
        } else {
            // Displays when a user inputs any other number other than 1 or 2
            System.out.println("Invalid option, input either 1 or 2");
        }
        scanner.close();

    }
}