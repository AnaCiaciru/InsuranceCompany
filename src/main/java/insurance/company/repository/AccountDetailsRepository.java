package insurance.company.repository;

import insurance.company.model.AccountDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountDetailsRepository extends JpaRepository<AccountDetails, Integer> {
}
