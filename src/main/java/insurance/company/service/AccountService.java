package insurance.company.service;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.repository.*;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public AccountDetails addAccountDetails(AccountDetails accountDetails){
        System.out.println(accountDetails);
        return accountDetailsRepository.save(accountDetails);
    }
    public Account addAccount(Account account, int accountDetailsId){
        AccountDetails accountDetails = (accountDetailsRepository.findById(accountDetailsId)
                .orElseThrow(() -> new RuntimeException("Account Details with this Id not found!")));
        account.setAccountDetails(accountDetails);
        return accountRepository.save(account);
    }

    public Account updateAccount(Account account, int accountDetailsId){
        AccountDetails accountDetails = (accountDetailsRepository.findById(accountDetailsId)
                .orElseThrow(() -> new RuntimeException("Account Details with this Id not found!")));
        account.setAccountDetails(accountDetails);
        return accountRepository.save(account);
    }

    /// because the delete method is
    @Transactional
    public void deleteAccount(int accountId){
        accountRepository.deleteAccountByAccountId(accountId);
    }

    public Account saveAccount(Account account, AccountDetails accountDetails){
        account.setAccountDetails(accountDetails);
        return accountRepository.save(account);
    }

    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(int accountId){
        return accountRepository.findAccountByAccountId(accountId);
    }

}
