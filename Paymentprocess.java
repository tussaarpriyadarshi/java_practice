abstract class Payment{
    protected double amount;
    public Payment(double amount){
        this.amount=amount;
    }
    public abstract void pay();
    
}
class CreditCardPayment extends Payment{
    private String cardNumber;
    public CreditCardPayment (String cardNumber,double amount){
        super(amount);
        this.cardNumber=cardNumber;
    }
    @Override
    public void pay(){
        System.out.println("Credit Card ->cardNumner ="+cardNumber+"amount ="+amount);
    }

}
class UPIPayment extends Payment{
    private String upiId;
    public UPIPayment(String upiId,double amount){
        super(amount);
        this.upiId=upiId;
    }
    @Override
    public void pay(){
        System.out.println("UPI ->upiId ="+upiId+","+"amount"+" "+amount);
    }

}
public class Paymentprocess{
    public static void main(String[] args){
        Payment p;
        p=new CreditCardPayment("1234567890123456",5000);
        p.pay();
        p=new UPIPayment("rahul@upi", 2000);
        p.pay();
        
    }
}
