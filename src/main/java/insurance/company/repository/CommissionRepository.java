package insurance.company.repository;

import insurance.company.model.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommissionRepository extends JpaRepository<Commission, Integer> {
}
