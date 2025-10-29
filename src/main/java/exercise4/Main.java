package exercise4;

import java.util.Optional;
import java.util.Scanner;


public class Main {
    static boolean dontstop = true;

    static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BankAccount bankA = new BankAccount("Vasilisa", "Geiger", 909, 1000, 500);

        while (dontstop) {
            menu();
            String option = scanner.nextLine();

            if (option.equals("5")) {
                System.out.println("finished");
                dontstop = false;
            } else {
                chooseMenuOption(option, bankA);
            }
        }
    }

    public static void chooseMenuOption(String auswahloption, BankAccount bankA) {
        switch (auswahloption) {
            case "1":

                System.out.println(bankA);

                break;

            case "2":
                System.out.println("How much do you want to deposit?");

                bankA.deposit(scan.nextInt());
                bankA.printbalance();

                break;

            case "3": // withdraw

                System.out.println("How much do you want to withdraw?");
                bankA.withdraw(scan.nextInt());

                break;

            case "4":

                bankA.printbalance();
                // printbalance(BankAccount.getBalance);
                break;

            case "5":

                System.out.println("finish");

                break;

            default:
                System.out.println("Option doesn't exist / Option is invalid");

                menu();
                String o = scan.nextLine();
                break;
        }
    }


    public static void menu() {

        System.out.println("Bank Account menu");
        System.out.println("-------------------------------------");
        System.out.println("1" + " show Bank Information         |");
        System.out.println("2" + " deposit amount                |");
        System.out.println("3" + " withdraw amount               |");
        System.out.println("4" + " print balance                 |");
        System.out.println("5" + " finish                        |");
        System.out.println("-------------------------------------");
    }
}
