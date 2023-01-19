package insurance.company.model;

import jakarta.persistence.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    private String accountName;
    @OneToOne
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;

//    @ManyToMany
//    @JoinTable(name = )
//    private List<Contact> contacts = new ArrayList<>();

    public Account() {

    }

    public Account(int accountId, String accountName, AccountDetails accountDetails) {
        this.accountId = accountId;
        this.accountName = accountName;
        this.accountDetails = accountDetails;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public AccountDetails getAccountDetails() {
        return accountDetails;
    }

    public void setAccountDetails(AccountDetails accountDetails) {
        this.accountDetails = accountDetails;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountDetails=" + accountDetails +
                '}';
    }
}
