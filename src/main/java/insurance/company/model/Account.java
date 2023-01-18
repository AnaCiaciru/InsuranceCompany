package insurance.company.model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;

    private String accountName;
    @OneToOne
    private AccountDetails accountDetails;

//    @ManyToMany
//    @JoinTable(name = )
//    private List<Contact> contacts = new ArrayList<>();

    public Account() {

    }
}
