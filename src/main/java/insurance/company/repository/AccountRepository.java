package insurance.company.repository;

import insurance.company.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface AccountRepository extends JpaRepository<Account, Integer>{

    Optional<Account> findAccountByAccountId(int account_id);
    void deleteAccountByAccountId(int account_Id);
}
