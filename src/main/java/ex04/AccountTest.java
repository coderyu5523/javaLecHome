package ex04;

public class AccountTest {
    public static void main(String[] args) {

        Account obj = new Account();

        obj.setName("tom");
        obj.setBalance(10000);

        System.out.println(obj.getBalance() +","+obj.getName());
    }
}
