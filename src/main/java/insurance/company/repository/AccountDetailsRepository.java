package insurance.company.repository;

import insurance.company.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {
    void deleteAccountDetailsByAccountDetailsId(int accountDetailsId);

    Optional<AccountDetails> findAccountDetailsByAccountDetailsId(int accountDetailsId);
}
