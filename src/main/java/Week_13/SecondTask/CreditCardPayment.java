package Week_13.SecondTask;

interface Payment
{
    void processPayment();
}
interface PaymentFactory
{
    Payment createPayment();
}
class CreditCardPayment implements Payment {

    @Override
    public void processPayment() {

    }
}
class PayPalPayment implements Payment
{
    @Override
    public void processPayment(){

    }

}
class CreditCardPaymentFactory implements PaymentFactory{

    @Override
    public Payment createPayment(){

        return null;
    }
}
class PayPalPaymentFactory implements PaymentFactory
{
    @Override
    public Payment createPayment(){

        return null;
    }
}
class MainFactory
{
    public static void main(String[] args) {
        PaymentFactory creditCardPaymentFactory = new CreditCardPaymentFactory();
        PaymentFactory payPayPaymentFactory = new CreditCardPaymentFactory();
        Payment payment1 = creditCardPaymentFactory.createPayment();
        Payment payment2 = payPayPaymentFactory.createPayment();
        payment1.processPayment();
        payment2.processPayment();
    }
}