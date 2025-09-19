abstract class BankAccount{
    protected int accountNumber;
    protected String accountHolder;
    protected int balance;
    public BankAccount(int acc,String holder,int b){
        this.accountNumber=acc;
        this.accountHolder=holder;
        this.balance=b;
    }
    public abstract void displayBalance();
        
    
}
class SavingsAccount extends BankAccount{
    int interestRate;
    SavingsAccount(int acno,String acholder,int bal,int interestRate){
        super(acno,acholder,bal);
        this.interestRate=interestRate;
    }
    public int calculateInterest() {
    return (balance * interestRate) / 100;
}

@Override
public void displayBalance() {
    System.out.println(accountHolder + "  Balance=" + balance + ", Interest=" + calculateInterest());
}


}
class CurrentAccount extends BankAccount{
    int overdraftlimit;
    CurrentAccount(int acno,String acholder,int bal,int overdraftlimit){
        super(acno,acholder,bal);
        this.overdraftlimit=overdraftlimit;
    }
    public void checkOverdraft(){
        System.out.println(overdraftlimit);
    }

    @Override
    public void displayBalance(){
        System.out.println("CurrentAccount -->"+accountNumber+"accountHolder="+accountHolder+"balance="+balance+","+"overdraftlimit ="+overdraftlimit);

    }

}
public class BankSystem{
    public static void main(String[] args){
        BankAccount b;
        b=new SavingsAccount(101, "Ramesh", 5000, 5);
        b.displayBalance();

    }
}