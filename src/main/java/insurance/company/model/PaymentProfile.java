package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class PaymentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentProfileId;
    private String IBAN;

    public PaymentProfile(int paymentProfileId, String IBAN) {
        this.paymentProfileId = paymentProfileId;
        this.IBAN = IBAN;
    }

    public PaymentProfile() {

    }
}
