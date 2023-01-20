package insurance.company.repository;

import insurance.company.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CaseRepository extends JpaRepository<Case, Integer> {
    void deleteCaseByCaseId(int caseId);

    Optional<Case> findCaseByCaseId(int caseId);
}
