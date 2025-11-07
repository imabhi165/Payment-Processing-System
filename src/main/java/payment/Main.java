package payment;


import payment.model.PaymentResult;
import payment.processor.PaymentProcessor;
import payment.service.PaymentService;
import payment.util.PaymentFactory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to PaymentApp ===");
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter amount: ");
            double amount = Double.parseDouble(scanner.nextLine().trim());

            System.out.println("Choose payment method:");
            System.out.println("1: Credit Card");
            System.out.println("2: UPI");
            System.out.println("3: PayPal");
            System.out.print("Enter choice (1/2/3 or card/upi/paypal): ");
            String choice = scanner.nextLine().trim();

            // Create service via factory (could be replaced by DI container later)
            PaymentService service = PaymentFactory.create(choice);

            // Inject dependency via constructor
            PaymentProcessor processor = new PaymentProcessor(service);

            // Process payment
            PaymentResult result = processor.process(amount);
            System.out.println("Result: " + result.getMessage());
            System.out.println("Success? " + result.isSuccess());
        } catch (NumberFormatException nfe) {
            System.err.println("Invalid amount. Please enter a numeric value.");
        } catch (IllegalArgumentException iae) {
            System.err.println("Error: " + iae.getMessage());
        } finally {
            scanner.close();
            System.out.println("=== Exiting PaymentApp ===");
        }
    }
}
