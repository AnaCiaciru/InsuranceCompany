package insurance.company.repository;

import insurance.company.model.Case;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CaseRepository extends JpaRepository<Case, Integer> {
}
