package CurrencyConverter;

import java.util.Scanner;

public class CurrencyConverter extends Converter {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        welcome();

        Menu m = new Menu();

        int choice = m.start_Menu();

        switch (choice) {
            case 1:
                int indianChoice = m.indian_Converter_Menu();
                indian_To_Other(indianChoice, m.userAmount(indianChoice));
                break;

            case 2:
                int UsaChoice = m.USA_Converter_Menu();
                usa_To_Other(UsaChoice, m.userAmount(UsaChoice));
                break;

            case 3:
                int germanchoice = m.Germany_Converter_Menu();
                german_To_Other(germanchoice, m.userAmount(germanchoice));
                break;

            case 4:
                int canadachoice = m.Canada_Converter_Menu();
                canda_To_Other(canadachoice, m.userAmount(canadachoice));
                break;

            default:
                System.out.println("Invalid choice ......... \nPlease Re-Enter your choice ..............");
                break;
        }

    }

    public static void welcome() {
        System.out.println("\n.......... Welcome to the currency converter ..........\n");
    }

}