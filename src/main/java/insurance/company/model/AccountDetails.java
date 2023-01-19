package insurance.company.model;

import jakarta.persistence.*;

/**
Account Name: Get Cloudy
Phone: 775-555-5309
Account Number: 117
Account Site: Single Location
Type: Customer - Direct
Industry: Consulting
Billing City: Reno
Billing State/Province: NV
 */

@Entity
@Table(name = "account_details")
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountDetailsId;
    private String phone;
    private int accountNumber;
    private String type;
    private String billingCity;

    public AccountDetails(int accountDetailsId, String phone, int accountNumber, String type, String billingCity) {
        this.accountDetailsId = accountDetailsId;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.type = type;
        this.billingCity = billingCity;
    }

    public AccountDetails() {

    }

    public int getAccountDetailsId() {
        return accountDetailsId;
    }

    public void setAccountDetailsId(int accountDetailsId) {
        this.accountDetailsId = accountDetailsId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBillingCity() {
        return billingCity;
    }

    public void setBillingCity(String billingCity) {
        this.billingCity = billingCity;
    }

    @Override
    public String toString() {
        return "AccountDetails{" +
                "accountDetailsId=" + accountDetailsId +
                ", phone='" + phone + '\'' +
                ", accountNumber=" + accountNumber +
                ", type='" + type + '\'' +
                ", billingCity='" + billingCity + '\'' +
                '}';
    }
}
