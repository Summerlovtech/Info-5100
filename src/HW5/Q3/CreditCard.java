package HW5.Q3;

public class CreditCard implements PaymentStrategy{

    String cardNumber;

    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int money){
        System.out.println(" CreditCard : $" + money);
    }
}
