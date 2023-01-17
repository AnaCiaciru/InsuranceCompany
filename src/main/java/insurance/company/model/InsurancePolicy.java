package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Entity
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyId;

    private Date startingDate;

    public InsurancePolicy(int policyId, Date startingDate) {
        this.policyId = policyId;
        this.startingDate = startingDate;
    }
}
