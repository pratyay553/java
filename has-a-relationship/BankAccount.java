
class Account{
    private String acNo;
    private String acHo;
    private double balance;
    public void setAcNo(String acNo) {
        this.acNo = acNo;
    }
    public String getAcNo() {
        return acNo;
    }
    public void setAcHo(String acHo) {
        this.acHo = acHo;
    }
    public String getAcHo() {
        return acHo;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        if(balance>0){
            this.balance=this.balance+amount;
        }else{System.out.println("Enter valid amount..");}
    }
    public void Withdraw(double amount){
        if(this.balance!=0 && amount<this.balance){
            this.balance=this.balance-amount;
        }else{
            System.out.println("Enter a valid amount..");
        }
    }
    
    
}

public class BankAccount {
    public static void main(String[] args) {
      Account a = new Account();
      a.setBalance(900);
      a.setAcHo("pratyay");
      a.setAcNo("de1008227");  
      System.out.println(a.getBalance());
      a.deposit(400);
      System.out.println(a.getBalance());
      a.Withdraw(500);
      System.out.println(a.getBalance());
      a.Withdraw(1000);
    }
}
