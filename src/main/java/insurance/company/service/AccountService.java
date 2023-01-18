package insurance.company.service;

import insurance.company.model.Account;
import insurance.company.repository.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountDetailsRepository accountDetailsRepository;
    private final InsurancePolicyRepository insurancePolicyRepository;
    private final CommissionRepository commissionRepository;
    private final CaseRepository caseRepository;
    private final ContactRepository contactRepository;
    private final ContactDetailsRepository contactDetailsRepository;
    private final PaymentProfileRepository paymentProfileRepository;

    public AccountService(AccountRepository accountRepository, AccountDetailsRepository accountDetailsRepository, InsurancePolicyRepository insurancePolicyRepository, CommissionRepository commissionRepository, CaseRepository caseRepository, ContactRepository contactRepository, ContactDetailsRepository contactDetailsRepository, PaymentProfileRepository paymentProfileRepository) {
        this.accountRepository = accountRepository;
        this.accountDetailsRepository = accountDetailsRepository;
        this.insurancePolicyRepository = insurancePolicyRepository;
        this.commissionRepository = commissionRepository;
        this.caseRepository = caseRepository;
        this.contactRepository = contactRepository;
        this.contactDetailsRepository = contactDetailsRepository;
        this.paymentProfileRepository = paymentProfileRepository;
    }

    public Account addAccount(Account account){
        return accountRepository.save(account);
    }

    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }
}
