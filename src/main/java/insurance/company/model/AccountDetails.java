package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
public class AccountDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accDetailsId;
    private String accountName;
    private String phone;
    private int accountNumber;
    private String type;
    private String billingCity;

    public AccountDetails(int accDetailsId, String accountName, String phone, int accountNumber, String type, String billingCity) {
        this.accDetailsId = accDetailsId;
        this.accountName = accountName;
        this.phone = phone;
        this.accountNumber = accountNumber;
        this.type = type;
        this.billingCity = billingCity;
    }

    public int getAccDetailsId() {
        return accDetailsId;
    }

    public void setAccDetailsId(int accDetailsId) {
        this.accDetailsId = accDetailsId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
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
}
