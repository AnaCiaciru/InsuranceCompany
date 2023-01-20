package insurance.company.model;

import jakarta.persistence.*;

@Entity
public class Case {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int caseId;
    private String description, subject;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private InsurancePolicy insurancePolicy;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private Account account;

    public Case() {}
    public Case(int caseId, String description, String subject) {
        this.caseId = caseId;
        this.description = description;
        this.subject = subject;
    }

    public int getCaseId() {
        return caseId;
    }

    public void setCaseId(int caseId) {
        this.caseId = caseId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    @Override
    public String toString() {
        return "Case{" +
                "caseId=" + caseId +
                ", description='" + description + '\'' +
                ", subject='" + subject + '\''+
                '}';
    }
}
