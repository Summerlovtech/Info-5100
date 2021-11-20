package HW5.Q3;

public class PayPal implements PaymentStrategy{

    String email;

    public PayPal(String email) {
        this.email = email;
    }

    @Override
    public void pay(int money){
        System.out.println(" Paypal : $" + money);
    }
}
