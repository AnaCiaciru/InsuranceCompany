package insurance.company.service;

import insurance.company.exception.DuplicatePolicyCodeException;
import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.model.InsurancePolicy;
import insurance.company.model.InsurancePolicy;
import insurance.company.repository.AccountRepository;
import insurance.company.repository.InsurancePolicyRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InsurancePolicyService {

    private final AccountRepository accountRepository;
    private final InsurancePolicyRepository insurancePolicyRepository;

    public InsurancePolicyService(AccountRepository accountRepository, InsurancePolicyRepository insurancePolicyRepository) {
        this.accountRepository = accountRepository;
        this.insurancePolicyRepository = insurancePolicyRepository;
    }

    public InsurancePolicy addPolicy(InsurancePolicy policy, int accountId){
        Account account = (accountRepository.findById(accountId)
                .orElseThrow(() -> new RuntimeException("Account with this Id not found!")));
        Optional<InsurancePolicy> existingInsurancePlicy = insurancePolicyRepository.findByPolicyCode(policy.getPolicyCode());
        existingInsurancePlicy.ifPresent(e -> {
            throw new DuplicatePolicyCodeException();
        });
        policy.setAccount(account);
        return insurancePolicyRepository.save(policy);
    }

    public List<InsurancePolicy> getPoliciesById(int accountId){
        return insurancePolicyRepository.findAllByAccount_AccountId(accountId);
    }

    public InsurancePolicy updateInsurancePolicy(InsurancePolicy insurancePolicy){
        return insurancePolicyRepository.save(insurancePolicy);
    }

    /// because the delete method is
    @Transactional
    public void deleteInsurancePolicy(int insurancePolicyId){
        insurancePolicyRepository.deleteInsurancePolicyByPolicyId(insurancePolicyId);
    }


    public List<InsurancePolicy> getInsurancePolicies(){
        return insurancePolicyRepository.findAll();
    }

    public Optional<InsurancePolicy> getInsurancePolicyById(int insurancePolicyId){
        return insurancePolicyRepository.findInsurancePolicyByPolicyId(insurancePolicyId);
    }
}
