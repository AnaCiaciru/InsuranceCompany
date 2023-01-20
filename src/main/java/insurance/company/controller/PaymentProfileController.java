package insurance.company.controller;

import insurance.company.model.PaymentProfile;
import insurance.company.service.PaymentProfileService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class PaymentProfileController {
    private final PaymentProfileService paymentProfileService;

    public PaymentProfileController(PaymentProfileService paymentProfileService) {
        this.paymentProfileService = paymentProfileService;
    }
    @GetMapping("/getPaymentProfileById/{PaymentProfileId}")
    public ResponseEntity<Optional<PaymentProfile>> getPaymentProfileById(@PathVariable("PaymentProfileId") int PaymentProfileId) {
        return ResponseEntity.ok().body(paymentProfileService.getPaymentProfileById(PaymentProfileId));
    }

    @GetMapping("/getPaymentProfiles")
    public ResponseEntity<List<PaymentProfile>> getPaymentProfiles() {
        List<PaymentProfile> PaymentProfiles = paymentProfileService.getPaymentProfiles();
        return new ResponseEntity<>(PaymentProfiles, HttpStatus.OK);
    }

    @PostMapping("/addPaymentProfile")
    public ResponseEntity<PaymentProfile> addPaymentProfile(@RequestBody PaymentProfile paymentProfile) {
        PaymentProfile newPaymentProfile = paymentProfileService.addPaymentProfile(paymentProfile);
        return new ResponseEntity<>(newPaymentProfile, HttpStatus.CREATED);
    }

    @PutMapping("/updatePaymentProfile")
    public ResponseEntity<PaymentProfile> updatePaymentProfile(@RequestBody PaymentProfile paymentProfile){
        PaymentProfile updatedPaymentProfile = paymentProfileService.updatePaymentProfile(paymentProfile);
        return new ResponseEntity<>(updatedPaymentProfile, HttpStatus.CREATED);
    }

    @DeleteMapping("/deletePaymentProfile/{PaymentProfileId}")
    public ResponseEntity<?> deletePaymentProfile(@PathVariable("PaymentProfileId") int PaymentProfileId){
        paymentProfileService.deletePaymentProfile(PaymentProfileId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
