package insurance.company.repository;

import insurance.company.model.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer> {
}
