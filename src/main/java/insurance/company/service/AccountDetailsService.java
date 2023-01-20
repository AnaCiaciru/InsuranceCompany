package insurance.company.service;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.repository.AccountDetailsRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountDetailsService {
    private final AccountDetailsRepository accountDetailsRepository;

    public AccountDetailsService(AccountDetailsRepository accountDetailsRepository) {
        this.accountDetailsRepository = accountDetailsRepository;
    }

    public AccountDetails addAccountDetails(AccountDetails accountDetails){
        System.out.println(accountDetails);
        return accountDetailsRepository.save(accountDetails);
    }

    public AccountDetails updateAccountDetails(AccountDetails accountDetails){
        System.out.println(accountDetails);
        return accountDetailsRepository.save(accountDetails);
    }

    /// because the delete method is
    @Transactional
    public void deleteAccountDetails(int accountDetailsId){
        accountDetailsRepository.deleteAccountDetailsByAccountDetailsId(accountDetailsId);
    }


    public List<AccountDetails> getAllAccountDetails(){
        return accountDetailsRepository.findAll();
    }

    public Optional<AccountDetails> getAccountDetailsById(int accountDetailsId){
        return accountDetailsRepository.findAccountDetailsByAccountDetailsId(accountDetailsId);
    }
}
