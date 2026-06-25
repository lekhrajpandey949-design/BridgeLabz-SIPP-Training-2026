class bank{
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Raman",10000);
        acc1.deposit(300);
        BankAccount acc2 = new BankAccount("Shyam",1200);
        acc2.withdraw(700);
    }
}
class BankAccount {
    long accountNumber;
    String holderName;
    double balance;
    static long totalAccounts;
    BankAccount(String holderName, double balance) {
        System.out.println("Account Created Successfully");
        this.holderName = holderName;
        this.balance = balance;
        totalAccounts++;
        accountNumber = totalAccounts;
        getAccountDetail();
    }
    void deposit(double amount) {
        if(amount < 0) {
            System.out.println("Invalid Amount");
            return;
        }
        balance += amount;
        System.out.println("Amount Added Successfully");
        checkBalance();
    }
    void withdraw(double amount) {
        if(amount > balance) {
            System.out.println("Invalid Amount");
            checkBalance();
        }
        balance -= amount;
        System.out.println("Withdraw Successful");
        checkBalance();
    }
    void checkBalance() {
        System.out.println("Your Current Balance: " + balance);
    }
    void getAccountDetail() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + holderName);
        System.out.println("Total Balance: " + balance);
    }
}