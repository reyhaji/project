import java.util.ArrayList;
import java.util.List;
  public class Branch {
    private int branchId;
    private String name;
    private List<Account> accounts;

    public Branch(int branchId, String name) {
        this.branchId = branchId;
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public int getBranchId() {
        return branchId;
    }

    public void setBranchId(int branchId) {
        this.branchId = branchId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Account getAccount(String accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return  "\nbranch id :"+branchId+"\nbranch name : "+name+"\n"+accounts;
    }
}
