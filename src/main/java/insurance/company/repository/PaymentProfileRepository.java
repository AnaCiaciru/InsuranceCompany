package insurance.company.repository;

import insurance.company.model.PaymentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentProfileRepository extends JpaRepository<PaymentProfile, Integer> {
}
