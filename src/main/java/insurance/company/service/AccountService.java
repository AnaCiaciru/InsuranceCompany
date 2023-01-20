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



    public AccountService(AccountRepository accountRepository, AccountDetailsRepository accountDetailsRepository) {
        this.accountRepository = accountRepository;
        this.accountDetailsRepository = accountDetailsRepository;
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


    public List<Account> getAccounts(){
        return accountRepository.findAll();
    }

    public Optional<Account> getAccountById(int accountId){
        return accountRepository.findAccountByAccountId(accountId);
    }

}
