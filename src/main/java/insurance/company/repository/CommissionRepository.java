package insurance.company.repository;

import insurance.company.model.Commission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CommissionRepository extends JpaRepository<Commission, Integer> {
    Optional<Commission> findCommissionByCommissionId(int commissionId);
    void deleteCommissionByCommissionId(int commissionId);
}
