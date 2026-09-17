package lab1;

public class AccountTest {
    public static void main(String[] args) {
        Account a1 = new Account("Fluke", -500);
        System.out.println(a1.getName() + " balance: " + a1.getBalance());

        Account a2 = new Account("Trin", 1000);
        a2.deposit(500);
        System.out.println(a2.getName() + " balance: " + a2.getBalance());

        a2.deposit(-200);
        System.out.println(a2.getName() + " balance: " + a2.getBalance());
    }
}