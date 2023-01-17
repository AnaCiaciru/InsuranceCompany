package insurance.company.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contactId;

    @OneToOne
    private ContactDetails contactDetails;
    @ManyToMany(mappedBy = "accountList")
    private List<Account> accounts = new ArrayList<>();
}
