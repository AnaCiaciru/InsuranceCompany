package insurance.company.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Commission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commissionId;
    @Min(0)
    @NotNull
    private int transactionAmount;

    private int taxAmount;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private InsurancePolicy insurancePolicy;

    public Commission() {}

    public Commission(int commissionId, int transactionAmount, InsurancePolicy insurancePolicy) {
        this.commissionId = commissionId;
        this.transactionAmount = transactionAmount;
        this.taxAmount = insurancePolicy.getTax() * transactionAmount;
        this.insurancePolicy = insurancePolicy;
    }

    public int getCommissionId() {
        return commissionId;
    }

    public void setCommissionId(int commissionId) {
        this.commissionId = commissionId;
    }

    public int getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(int transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public int getTaxAmount() {
        return taxAmount;
    }

    public void setTaxAmount(int taxAmount) {
        this.taxAmount = taxAmount;
    }

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    @Override
    public String toString() {
        return "Commission{" +
                "commissionId=" + commissionId +
                ", transactionAmount=" + transactionAmount +
                ", taxAmount=" + taxAmount +
                '}';
    }
}
