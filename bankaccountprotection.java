class bankaccount{
    private double balance;
    public void deposit(double balance){

       this.balance+=balance;
        System.out.println("deposit ="+balance);  

    }
    public void withdraw(double balance){
        
        if(balance<=this.balance){
            this.balance-=balance;
            System.out.println("withdraw ="+balance);
        }
        else{
            System.out.println("insufficient balance");

        }

    }
    public double getBalance(){
       
      System.out.println("updated Balance ="+balance);
      return balance;

    }


}




public class bankaccountprotection {
    public static void main(String[] args){
        bankaccount acc=new bankaccount();
        acc.deposit(5000);
        acc.withdraw(2000);
        acc.getBalance();
    }
    
}
