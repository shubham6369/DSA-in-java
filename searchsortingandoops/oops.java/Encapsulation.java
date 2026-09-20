public class Encapsulation {

     public static void main(String[] args) {
        BankAccount account = new BankAccount("name shubham patel", 25545, 9999000);
        System.out.println("Initial Balance: " + account.getBalance());
        account.setBalance(9999000);
        System.out.println("Updated Balance: " + account.getBalance());
    }
}

class BankAccount {
    private String name;
    private int balance;

    BankAccount(String name, int accNo, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
}