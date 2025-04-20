
class BankAccount {
    public double getInterestRate() {
        return 0.05;
    }
}

class SavingsAccount extends BankAccount {
    public double getInterestRate() {
        return 0.1;
    }
}

public class BankMain {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        SavingsAccount s1 = new SavingsAccount();

        System.out.println("BankAccount Interest Rate: " + b1.getInterestRate());
        System.out.println("SavingsAccount Interest Rate: " + s1.getInterestRate());
    }
}
