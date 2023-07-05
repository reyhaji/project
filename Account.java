
public class Account {
    private String accountNumber;
    private double balance;
    private Customer owner;

    public Account(String accountNumber, double balance, Customer owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
      public void setAccountNumber(String accountNumber) {
        this.accountNumber=accountNumber;
      }
    public double getBalance() {
        return balance;
    }
     public void setBalance(double balance) {
        this.balance=balance;
    }

    public Customer getOwner() {
        return owner;
    }
       public void setOwner(Customer owner) {
        this.owner=owner;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public String toString() {
        return "account number :"+accountNumber+"\naccount balance : "+balance+owner;
    }
}