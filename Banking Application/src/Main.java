import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);

        boolean active = true;

        while (active){
            System.out.println(" \n Welcome to banking menu----");
            System.out.println(" press 1 to make a deposit");
            System.out.println(" press 2 to withdraw");
            System.out.println(" press 3 to check your balance");
            System.out.println(" press 4 to exit the application");

            int choice = scanner.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Please enter to amount to deposit");
                    double depositAmount = scanner.nextDouble();
                    account.Deposit(depositAmount);
                    break;

                case 2:
                    System.out.println("Please enter the amount to withdaw");
                    double withdrawAmount = scanner.nextDouble();
                    account.Withdraw(withdrawAmount);
                    break;

                case 3:
                    account.checkBalance();
                    break;

                case 4:
                    active = false;
                    System.out.println("Exiting the application");
                    break;

                default:
                    System.out.println("Invalid Option! Please try again");
            }
        }
        scanner.close();
    }
}