package insurance.company.controller;

import insurance.company.model.InsurancePolicy;
import insurance.company.service.InsurancePolicyService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class InsurancePolicyController {

    private final InsurancePolicyService insurancePolicyService;

    public InsurancePolicyController(InsurancePolicyService insurancePolicyService) {
        this.insurancePolicyService = insurancePolicyService;
    }

    @PostMapping("/addPolicy")
    public ResponseEntity<InsurancePolicy> addPolicy(@RequestBody InsurancePolicy policy,
                                                     @RequestParam int accountId) {
        InsurancePolicy newPolicy = insurancePolicyService.addPolicy(policy, accountId);
        return new ResponseEntity<>(newPolicy, HttpStatus.CREATED);
    }

    @GetMapping("/getPoliciesById/{accountId}")
    public ResponseEntity<List<InsurancePolicy>> getPoliciesById(@PathVariable("accountId") int accountId) {
        return ResponseEntity.ok().body(insurancePolicyService.getPoliciesById(accountId));
    }

    @GetMapping("/getInsurancePolicyById/{InsurancePolicyId}")
    public ResponseEntity<Optional<InsurancePolicy>> getInsurancePolicyById(@PathVariable("InsurancePolicyId") int InsurancePolicyId) {
        return ResponseEntity.ok().body(insurancePolicyService.getInsurancePolicyById(InsurancePolicyId));
    }

    @GetMapping("/getInsurancePolicies")
    public ResponseEntity<List<InsurancePolicy>> getInsurancePolicies() {
        List<InsurancePolicy> InsurancePolicys = insurancePolicyService.getInsurancePolicies();
        return new ResponseEntity<>(InsurancePolicys, HttpStatus.OK);
    }

    @PutMapping("/updateInsurancePolicy")
    public ResponseEntity<InsurancePolicy> updateInsurancePolicy(@RequestBody InsurancePolicy insurancePolicy){
        InsurancePolicy updatedInsurancePolicy = insurancePolicyService.updateInsurancePolicy(insurancePolicy);
        return new ResponseEntity<>(updatedInsurancePolicy, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteInsurancePolicy/{InsurancePolicyId}")
    public ResponseEntity<?> deleteInsurancePolicy(@PathVariable("InsurancePolicyId") int InsurancePolicyId){
        insurancePolicyService.deleteInsurancePolicy(InsurancePolicyId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
