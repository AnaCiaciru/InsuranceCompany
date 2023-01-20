package insurance.company.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import net.minidev.json.annotate.JsonIgnore;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class InsurancePolicy {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int policyId;
    @NotBlank
    private Date startingDate;
    @NotBlank
    private String policyCode;
    @NotBlank
    private Date renewalDate;
    @NotBlank
    private int premiumFrequency;
    private int tax;

    @OneToOne
    @JoinColumn(name = "payment_profile_id")
    private PaymentProfile paymentProfile;
    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    @OneToMany
    @JsonIgnore
    private final List<Commission> commissionList = new ArrayList<>();

    @OneToMany
    @JsonIgnore
    private final List<Case> caseList = new ArrayList<>();

    public InsurancePolicy() {

    }
    public InsurancePolicy(int policyId, Date startingDate, String policyCode, Date renewalDate, int premiumFrequency, Account account, int tax) {
        this.policyId = policyId;
        this.startingDate = startingDate;
        this.policyCode = policyCode;
        this.renewalDate = renewalDate;
        this.premiumFrequency = premiumFrequency;
        this.account = account;
        this.tax = tax;
    }

    public int getTax() {
        return tax;
    }

    public void setTax(int tax) {
        this.tax = tax;
    }

    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    public Date getStartingDate() {
        return startingDate;
    }

    public void setStartingDate(Date startingDate) {
        this.startingDate = startingDate;
    }

    public String getPolicyCode() {
        return policyCode;
    }

    public void setPolicyCode(String policyCode) {
        this.policyCode = policyCode;
    }

    public Date getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(Date renewalDate) {
        this.renewalDate = renewalDate;
    }

    public int getPremiumFrequency() {
        return premiumFrequency;
    }

    public void setPremiumFrequency(int premiumFrequency) {
        this.premiumFrequency = premiumFrequency;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public PaymentProfile getPaymentProfile() {
        return paymentProfile;
    }

    @Override
    public String toString() {
        return "InsurancePolicy{" +
                "policyId=" + policyId +
                ", startingDate=" + startingDate +
                ", policyCode='" + policyCode + '\'' +
                ", renewalDate=" + renewalDate +
                ", premiumFrequency=" + premiumFrequency +
                '}';
    }


}
