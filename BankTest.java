import java.util.*;
import java.util.ArrayList;
import java.util.List;
public class BankTest{
    public static void main(String[] args){
        // Create a Bank
        Bank bank = new Bank("CRDB");
        // Create Branches
        Branch branch1 = new Branch(213 , " michezani ");
        // Add Branches to the Bank
        bank.addBranch(branch1);
        // Create Customers
        Customer customer1 = new Customer(345, "rehema  haji", "bububu");
        // Create Accounts
        Account account1 = new Account("275398765", 1000.0, customer1);
        // Add Accounts to Customers
        customer1.addAccount(account1);
            // Add Customers to Branches
        branch1.addAccount(account1);
        // Accessing data and testing functionality
       System.out.println("Bank name : " + bank.getName());
        System.out.println(bank.getBranches());
        account1.deposit(500.0);
        account1.withdraw(200.0);
        System.out.println("Accountnumber  : " + account1.getAccountNumber());
         System.out.println("Account balance: " + account1.getBalance());
    
            System.out.println("\n\n");

      //update 
    bank.setName("pbz");
    branch1.setBranchId(4365);
    branch1.setName("mlandege");
    customer1.setCustomerId(2345);
    customer1.setName("asma khamis");
    customer1.setAddress(" saateni");
    account1.setAccountNumber("23456578689");
    account1.setBalance(300000);

     System.out.println("Bank name : " + bank.getName());
     System.out.println(bank.getBranches());
     account1.deposit(7000.0);
        account1.withdraw(5000.0);
     System.out.println("Accountnumber  : " + account1.getAccountNumber());
      System.out.println("Account balance: " + account1.getBalance());
}
}