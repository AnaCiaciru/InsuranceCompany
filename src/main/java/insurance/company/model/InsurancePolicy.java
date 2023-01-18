package insurance.company.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyId;
    private Date startingDate;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public InsurancePolicy(int policyId, Date startingDate) {
        this.policyId = policyId;
        this.startingDate = startingDate;
    }

    public InsurancePolicy() {

    }
}
