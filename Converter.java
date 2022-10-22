package CurrencyConverter;

public class Converter {

    /*
     * .......... Indian Rupees to other currency Converter ..........
     * ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
     */

    public static void indian_To_Other(int choice, double amount) {
        switch (choice) {
            case 1:
                // Indian Rupees to USA Doller Converter → → → → → → → → → → → → 
                amount *= 0.012;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
            case 2:
                // Indian Rupees to German Euro Converter → → → → → → → → → → → → 
                amount *= 0.012;
                System.out.println("The final converted amount is : " + amount + " €");
                break;
            case 3:
                // Indian Rupees to Canadian Dollar Converter → → → → → → → → → → → → 
                amount *= 0.017;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
        }
    }

    /*
     * .......... USA Dollers to other currency Converter ..........
     * ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
     */

    public static void usa_To_Other(int choice, double amount) {
        switch (choice) {
            case 1:
                // USA Dollers to Indian Rupees converter → → → → → → → → → → → → 
                amount /= 82.54;
                System.out.println("The final converted amount is : " + amount + " ₹");
                break;
            case 2:
                // USA Dollers to German Euro Converter → → → → → → → → → → → → 
                amount *= 1.01;
                System.out.println("The final converted amount is : " + amount + " €");
                break;
            case 3:
                // USA Dollers to Canadian Dollar Converter → → → → → → → → → → → → 
                amount *= 1.36;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
        }
    }

    /*
     * .......... German Euro to other currency Converter ..........
     * ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
     */

    public static void german_To_Other(int choice, double amount) {
        switch (choice) {
            case 1:
                // German Euro to Indian Rupees converter → → → → → → → → → → → → 
                amount /= 81.40;
                System.out.println("The final converted amount is : " + amount + " ₹");
                break;
            case 2:
                // German Euro to USA Dollers Converter → → → → → → → → → → → → 
                amount *= 0.99;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
            case 3:
                // German Euro to Canadian Dollar Converter → → → → → → → → → → → → 
                amount *= 1.35;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
        }
    }

    /*
     * .......... Canadian Dollar to other currency Converter ..........
     * ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓ ↓
     */

    public static void canda_To_Other(int choice, double amount) {
        switch (choice) {
            case 1:
                // Canadian Dollar to Indian Rupees converter → → → → → → → → → → → → 
                amount /= 60.51;
                System.out.println("The final converted amount is : " + amount + " ₹");
                break;
            case 2:
                // Canadian Dollar to USA Dollers Converter → → → → → → → → → → → → 
                amount *= 0.73;
                System.out.println("The final converted amount is : " + amount + " $");
                break;
            case 3:
                // Canadian Dollar to German Euro Converter → → → → → → → → → → → → 
                amount *= 0.74;
                System.out.println("The final converted amount is : " + amount + " €");
                break;
        }
    }

}
