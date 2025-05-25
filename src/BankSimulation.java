class BankAccount {
    private int balance = 10145;

    public synchronized void withdraw(String user, int amount) {
        System.out.println(user + " is trying to withdraw " + amount + " from account");

        if(amount > balance) {
            System.out.println("Insufficient balance for " + user + " to withdraw the amount " + amount);
        }
        else {
            balance -= amount;
            System.out.println(user + " has withdrawn " + amount + " from account");
        }
        System.out.println("Total balance is " + balance);
        System.out.println("-----------------------------------------------------------");
    }
}

class User extends Thread {
    private BankAccount account;
    private String name;
    private int amount;

    public User(String name, BankAccount account, int amount) {
        this.name = name;
        this.account = account;
        this.amount = amount;
    }

    public void run() {
        account.withdraw(name, amount);
    }
}

public class BankSimulation {
    public static void main(String[] args) {
        BankAccount sharedAccount = new BankAccount();

        User u1 = new User("Balaji", sharedAccount, 500);
        User u2 = new User("Shyam", sharedAccount, 700);
        User u3 = new User("Vhani", sharedAccount, 1000);

        u1.start();
        u2.start();
        u3.start();
    }
}
