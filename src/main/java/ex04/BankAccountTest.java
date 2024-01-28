package ex04;

class BankAccount{
    private int accountNumber ;
    private String owner ;
    private int balance ;


    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void deposit(int amount){
       this.balance = balance + amount;
   }
   public void withdraw(int amount){
       this.balance = balance - amount;
   }

    @Override
    public String toString() {
        return "현재의 잔액은" +balance +"입니다";
    }
}



public class BankAccountTest {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount() ;

        ba.setBalance(10000);
        System.out.println("계좌잔액:"+ba.getBalance());

        ba.withdraw(8000);
        System.out.println("계좌잔액:"+ba.getBalance());


    }
}
