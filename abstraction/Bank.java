abstract class BankAccount{
    double amount;
    abstract public void deposite(double amount);
    abstract public void withdraw(double amount);
    public void getBalance(){
        System.out.println("the amount is : "+this.amount);
    }

    public BankAccount(double amount) {
        this.amount=amount;
    }
    
}
abstract class SavingsAccount extends BankAccount{
    double amount;
    double presentAmount;
    @Override
    public void deposite(double amount){
        System.out.println("deposite amount is : "+amount);
        System.out.println("your balance is : ");
        this.amount=this.presentAmount+amount;
    }
    SavingsAccount(double amount,double presentAmount){
        super(amount);
        this.presentAmount=presentAmount;
    }
}
abstract class CurrentAccount extends BankAccount{
    double amount;
    double presentAmount;
    @Override
    public void withdraw(double amount){
        System.out.println("wthdraw balance is : "+amount);
        System.out.println("your balance is : ");
        this.amount = this.presentAmount + amount;
    }

   CurrentAccount(double amount,double presentAmount) {
        super(amount);
        this.presentAmount=presentAmount;
    }
    
}
public class Bank{
    public static void main(String[] args) {
        
    }
}