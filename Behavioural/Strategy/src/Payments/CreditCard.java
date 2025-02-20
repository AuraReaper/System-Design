package Payments;

public class CreditCard implements PaymentStrategy {
    private String cardNumber;
    private String cvv;
    private String expiryDate;
    private String nameOnCard;

    public CreditCard(String cardNumber, String cvv, String expiryDate, String nameOnCard) {
        this.cardNumber = cardNumber;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
        this.nameOnCard = nameOnCard;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payment of " +amount+ " successfull via CreditCard");
    }
}
