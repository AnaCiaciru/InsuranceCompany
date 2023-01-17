package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
First name: Alan
Last name: Johnson
Title: Sales Manager
Phone: (720) 444-1229
Email: alan@gogetcloudy.com
 */

@Entity
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contDetailsId;
    private String firstName;
    private String lastName;
    private String title;
    private String phone;
    private String email;

    public ContactDetails(int contDetailsId, String firstName, String lastName, String title, String phone, String email) {
        this.contDetailsId = contDetailsId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.title = title;
        this.phone = phone;
        this.email = email;
    }

    public ContactDetails() {

    }

    public int getContDetailsId() {
        return contDetailsId;
    }

    public void setContDetailsId(int contDetailsId) {
        this.contDetailsId = contDetailsId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
