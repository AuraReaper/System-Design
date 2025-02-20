import Payments.CreditCard;
import Payments.PayPal;
import ShoppingCart.Item;
import ShoppingCart.Shopping;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shopping cart = new Shopping();

        Item item1 = new Item("milk" , 200) ;
        Item item2 = new Item("apple" , 500) ;
        cart.add(item1);
        cart.add(item2);

        System.out.println("Choose Payment Method");
        System.out.println("1. PayPal");
        System.out.println("2. CreditCard");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: System.out.println("Enter PayPal email");
                    String email = scanner.next();
                    System.out.println("Enter PayPal password");
                    String password = scanner.next();
                    cart.setPaymentMode(new PayPal(email , password)) ;
                    cart.pay() ;
                    break;
            case 2: System.out.println("Enter Card number");
                    String cardNumber = scanner.next();
                    System.out.println("Enter Card expiration");
                    String expiryDate = scanner.next();
                    System.out.println("Enter CVV number");
                    String cvv = scanner.next();
                    System.out.println("Enter name on card");
                    String nameOnCard = scanner.next();
                    cart.setPaymentMode(new CreditCard(cardNumber, expiryDate, cvv, nameOnCard)) ;
                    cart.pay() ;
                    break;
            default: System.out.println("Choose Payment Method");

        }
    }
}
