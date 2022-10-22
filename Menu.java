package CurrencyConverter;

import java.util.Scanner;

public class Menu {

    static Scanner sc = new Scanner(System.in);

    // Method to select the current user have → → → → → → → → → → → →
    public int start_Menu() {
        System.out.println(".......... Select The Curreny You Have From The List Given Below ..........");
        System.out.println("1. Indian Rupees.");
        System.out.println("2. USA Dollers.");
        System.out.println("3. Germany Euro.");
        System.out.println("4. Canadian Dollar.");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }

    // If the user have indian currency the this menu get printed to
    // select to which currency the user wants to change it's currency → → → → → → →
    // → → → → →
    public int indian_Converter_Menu() {
        System.out.println("\n.......... Select The Currency You Want To Convert Indian Rupees Currency ..........");
        System.out.println("1. Indian Rupees To USA Dollers.");
        System.out.println("2. Indian Rupees To Germany Euro");
        System.out.println("3. Indian Rupees To Canadian Dollar");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }

    // If the user have USA currency the this menu get printed to
    // select to which currency the user wants to change it's currency → → → → → → →
    // → → → → →
    public int USA_Converter_Menu() {
        System.out.println("\n.......... Select The Currency You Want To Convert USA Dollers Currency ..........");
        System.out.println("1. USA Dollers To Indian Rupees.");
        System.out.println("2. USA Dollers To Germany Euro");
        System.out.println("3. USA Dollers To Canadian Dollar");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }

    // If the user have Germany currency the this menu get printed to
    // select to which currency the user wants to change it's currency → → → → → → →
    // → → → → →
    public int Germany_Converter_Menu() {
        System.out.println("\n.......... Select The Currency You Want To Convert Germany Euro Currency ..........");
        System.out.println("1. Germany Euro To Indian Rupees.");
        System.out.println("2. Germany Euro To USA Dollers");
        System.out.println("3. Germany Euro To Canadian Dollar");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }

    // If the user have Canadian currency the this menu get printed to
    // select to which currency the user wants to change it's currency → → → → → → →
    // → → → → →
    public int Canada_Converter_Menu() {
        System.out.println("\n.......... Select The Currency You Want To Convert Canadian Dollar Currency ..........");
        System.out.println("1. Canadian Dollar To Indian Rupees.");
        System.out.println("2. Canadian Dollar To USA Dollers");
        System.out.println("3. Canadian Dollar To Germany Euro");
        System.out.print("Enter your choice : ");
        int choice = sc.nextInt();
        return choice;
    }

    // Method to get the amount from user and print it → → → → → → → → → → → →
    public double userAmount(int choice) {
        double amount = 0.0;
        switch (choice) {
            case 1:
                System.out.println("Enter your amount in Indian Rupees : ");
                amount = sc.nextDouble();
                System.out.println("The Indian Rupees amount entered by the user is " + amount + " ₹.");
                break;
            case 2:
                System.out.println("Enter your amount in USA Dollers : ");
                amount = sc.nextDouble();
                System.out.println("The USA Dollers amount entered by the user is " + amount + " $.");
                break;
            case 3:
                System.out.println("Enter your amount in German Euro : ");
                amount = sc.nextDouble();
                System.out.println("The Germany Euro amount entered by the user is " + amount + " €.");
                break;
            case 4:
                System.out.println("Enter your amount in Candian Doller : ");
                amount = sc.nextDouble();
                System.out.println("The Canadian Dollar amount entered by the user is " + amount + " $.");
                break;
        }
        return amount;
    }

}
