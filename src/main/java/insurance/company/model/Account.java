package insurance.company.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    @OneToOne
    private AccountDetails accountDetails;

    @OneToMany(mappedBy = "policy")
    private List<InsurancePolicy> insurancePolicies = new ArrayList<>();

//    @ManyToMany
//    @JoinTable(name = )
//    private List<Contact> contacts = new ArrayList<>();


    public Account(int accountId, AccountDetails accountDetails, List<InsurancePolicy> insurancePolicies) {
        this.accountId = accountId;
        this.accountDetails = accountDetails;
        this.insurancePolicies = insurancePolicies;
    }

    public Account() {

    }
}
