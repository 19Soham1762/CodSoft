import java.util.Scanner;

public class ATM_MACHINE {
    String name;
    String location;
    long card_number;
    String holder;
    int pin;
    double balance;
    int entered_pin;

    Scanner sc = new Scanner(System.in);

    public ATM_MACHINE() {
        System.out.print("Enter the name of the ATM: ");
        name = sc.nextLine();

        System.out.print("Enter the location of " + name + ": ");
        location = sc.nextLine();

        System.out.print("Enter the card number: ");
        card_number = sc.nextLong();
        sc.nextLine(); // consume newline

        System.out.print("Enter the customer name: ");
        holder = sc.nextLine();

        System.out.print("Enter the pin number: ");
        pin = sc.nextInt();

        balance=60000.00;

        System.out.println();
    }

    public void display_info() {
        System.out.println("ATM NAME IS " + name);
        System.out.println(name + " is located in " + location);
        System.out.println(holder + " is the customer name");
        System.out.println("Your's debit card number is " + card_number);
        System.out.println("Debit Card's pin number is " + pin);
        System.out.println();
    }

    public boolean Punching() {
        System.out.print("Enter your pin: ");
        entered_pin = sc.nextInt();

        if (entered_pin == pin) {
            System.out.println("Authorization is Successful");
            return true;
        } else {
            System.out.println("Error, Authorization failed");
            return false;
        }
    }

    public void display_balance() {
        System.out.printf("AVALIABLE BALANCE IS Rs %.2f\n", balance);
    }

    public void credit(double amount) {
        balance += amount;
        System.out.println("Amount of Rs " + amount + " has been deposited to your account number XXXXX650");
    }

    public void credit_total() {
        System.out.printf("Avaliable Balance is Rs %.2f\n", balance);
    }

    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Amount of Rs " + amount + " has been debited from account no XXX650 in " + name);
        } else {
            System.out.println("Insufficient Fund");
        }
    }

    public void debit_total() {
        System.out.printf("Avaliable balance is Rs %.2f\n", balance);
    }

    public void menu() {
        System.out.println("\nWelcome  " + holder);
        while (true) {
            System.out.println("\nATM MENU ARE AS FOLLOW");
            System.out.println("1. Check Balance");
            System.out.println("2. Credit the amount");
            System.out.println("3. Debit the amount");
            System.out.println("4. Exit");

            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                display_balance();
            } else if (choice == 2) {
                System.out.print("Enter the amount to credit is Rs ");
                double credit_amount = sc.nextDouble();
                credit(credit_amount);
            } else if (choice == 3) {
                System.out.print("Enter the amount to debit is Rs ");
                double debit_amount = sc.nextDouble();
                debit(debit_amount);
            } else if (choice == 4) {
                System.out.println("Thank You for choosing " + name + ". Visit again!!!");
                break;
            } else {
                System.out.println("Invalid Choice");
            }
        }
    }

    public static void main(String[] args) {
        ATM_MACHINE A = new ATM_MACHINE();
        if (A.Punching()) {
            A.display_info();
            A.menu();
        }
    }
}
