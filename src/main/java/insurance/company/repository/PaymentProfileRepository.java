package insurance.company.repository;

import insurance.company.model.PaymentProfile;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface PaymentProfileRepository extends JpaRepository<PaymentProfile, Integer> {
    void deletePaymentProfileByPaymentProfileId(int paymentProfileId);

    Optional<PaymentProfile> findPaymentProfileByPaymentProfileId(int paymentProfileId);
}
