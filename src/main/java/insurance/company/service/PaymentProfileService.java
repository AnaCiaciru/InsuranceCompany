package insurance.company.service;

import insurance.company.model.PaymentProfile;
import insurance.company.repository.PaymentProfileRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentProfileService {
    private final PaymentProfileRepository paymentProfileRepository;

    public PaymentProfileService(PaymentProfileRepository paymentProfileRepository) {
        this.paymentProfileRepository = paymentProfileRepository;
    }

    public PaymentProfile addPaymentProfile(PaymentProfile paymentProfile){
        return paymentProfileRepository.save(paymentProfile);
    }

    public PaymentProfile updatePaymentProfile(PaymentProfile paymentProfile){
        return paymentProfileRepository.save(paymentProfile);
    }

    /// because the delete method is
    @Transactional
    public void deletePaymentProfile(int paymentProfileId){
        paymentProfileRepository.deletePaymentProfileByPaymentProfileId(paymentProfileId);
    }


    public List<PaymentProfile> getPaymentProfiles(){
        return paymentProfileRepository.findAll();
    }

    public Optional<PaymentProfile> getPaymentProfileById(int paymentProfileId){
        return paymentProfileRepository.findPaymentProfileByPaymentProfileId(paymentProfileId);
    }
}
