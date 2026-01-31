import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Simple Currency Converter ===");
        System.out.println("Available Currencies: USD, INR, EUR");

        System.out.print("Enter base currency: ");
        String base = input.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = input.next().toUpperCase();

        System.out.print("Enter amount to convert: ");
        double amount = input.nextDouble();

        double rate = 0;

        // Exchange rates (approx values)
        if (base.equals("USD") && target.equals("INR")) rate = 83;
        else if (base.equals("INR") && target.equals("USD")) rate = 1.0 / 83;

        else if (base.equals("USD") && target.equals("EUR")) rate = 0.92;
        else if (base.equals("EUR") && target.equals("USD")) rate = 1.0 / 0.92;

        else if (base.equals("INR") && target.equals("EUR")) rate = 0.011;
        else if (base.equals("EUR") && target.equals("INR")) rate = 90;

        else if (base.equals(target)) rate = 1;

        else {
            System.out.println("Currency not supported.");
            return;
        }

        double convertedAmount = amount * rate;

        System.out.println("\nConverted Amount: " + convertedAmount + " " + target);

        input.close();
    }
}