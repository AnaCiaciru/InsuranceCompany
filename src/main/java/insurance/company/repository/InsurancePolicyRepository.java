package insurance.company.repository;

import insurance.company.model.Account;
import insurance.company.model.InsurancePolicy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface InsurancePolicyRepository extends JpaRepository<InsurancePolicy, Integer> {
    List<InsurancePolicy> findAllByAccount_AccountId(int accountId);

    void deleteInsurancePolicyByPolicyId(int policyId);

    Optional<InsurancePolicy> findInsurancePolicyByPolicyId(int policyId);

    Optional<InsurancePolicy> findByPolicyCode(String policyCode);
}
