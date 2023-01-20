package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class PaymentProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int paymentProfileId;
    private String IBAN;
    private Date expirationDate;
    private boolean active;

    public PaymentProfile() {}

    @Override
    public String toString() {
        return "PaymentProfile{" +
                "paymentProfileId=" + paymentProfileId +
                ", IBAN='" + IBAN + '\'' +
                ", expirationDate=" + expirationDate +
                ", active=" + active +
                '}';
    }

    public PaymentProfile(int paymentProfileId, String IBAN) {
        this.paymentProfileId = paymentProfileId;
        this.IBAN = IBAN;
    }

    public PaymentProfile(int paymentProfileId, String IBAN, Date expirationDate, boolean active) {
        this.paymentProfileId = paymentProfileId;
        this.IBAN = IBAN;
        this.expirationDate = expirationDate;
        this.active = active;
    }

    public int getPaymentProfileId() {
        return paymentProfileId;
    }

    public void setPaymentProfileId(int paymentProfileId) {
        this.paymentProfileId = paymentProfileId;
    }

    public String getIBAN() {
        return IBAN;
    }

    public void setIBAN(String IBAN) {
        this.IBAN = IBAN;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
