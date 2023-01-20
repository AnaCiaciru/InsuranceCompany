package insurance.company.model;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import net.minidev.json.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @NotBlank
    private String accountName;
    @OneToOne
    @JoinColumn(name = "account_details_id")
    private AccountDetails accountDetails;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private final List<InsurancePolicy> policyList = new ArrayList<>();

    @ManyToMany(mappedBy = "accountList")
    @JsonIgnore
    private final List<Contact> contacts = new ArrayList<>();

    public Account() {}

    @Override
    public String toString() {
        return "Account{" +
                "accountId=" + accountId +
                ", accountName='" + accountName + '\'' +
                ", accountDetails=" + accountDetails +
                '}';
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

}
