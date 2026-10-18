
class Account {
    long accountNumber;
    String holderName;

    Account(long accountNumber, String holderName) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
    }

    void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Holder Name: " + holderName);
    }
}

class SavingsAccount extends Account {
    double interestRate;
    double balance;

    SavingsAccount(long accountNumber, String holderName,
            double interestRate, double balance) {
        super(accountNumber, holderName);
        this.interestRate = interestRate;
        this.balance = balance;
    }

    void calculateInterest() {
        double interest = balance * interestRate / 100;

        displayAccount();
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest: " + interest);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(12345, "Aditi", 5, 10000);
        s.calculateInterest();
    }
}