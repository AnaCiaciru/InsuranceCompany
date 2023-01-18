package insurance.company.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caseId;
    private String description, subject;

    public Case(int caseId, String description, String subject) {
        this.caseId = caseId;
        this.description = description;
        this.subject = subject;
    }

    public Case() {

    }
}
