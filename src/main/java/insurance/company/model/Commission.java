package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commissionId;
    private int amount;

    public Commission(int commissionId, int amount) {
        this.commissionId = commissionId;
        this.amount = amount;
    }

    public Commission() {

    }
}
