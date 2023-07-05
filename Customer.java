import java.util.ArrayList;
import java.util.List;

public class Customer {
    private int customerId;
    private String name;
    private String address;
    private List<Account> accounts;

    public Customer(int customerId, String name, String address) {
        this.customerId = customerId;
        this.name = name;
        this.address = address;
        this.accounts = new ArrayList<Account>();
    }
     public int getCustomerId()
    {
        return customerId;
    }
    public void setCustomerId(int customerId)
    {
        this.customerId =customerId;
    }

    public String getName()
    {
        return name;
    }
     public void setName(String name)
    {
        this. name =name;
    }

    public void setAddress(String address)
    {
        this.address =address;
    }

       public String getAddress()
    {
        return address;
    }
   
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void removeAccount(Account account) {
        accounts.remove(account);
    }
  
    public List<Account> getAccounts() {
        return accounts;
    }
   @Override
    public String toString() {
        return "\ncustomer id : "+customerId+"\ncustomer name : "+name+"\ncustomer address : "+address;
    }
}
