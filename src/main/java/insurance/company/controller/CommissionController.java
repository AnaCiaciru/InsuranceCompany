package insurance.company.controller;

import insurance.company.model.Commission;
import insurance.company.service.CommissionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CommissionController {
    private final CommissionService commissionService;

    public CommissionController(CommissionService commissionService) {
        this.commissionService = commissionService;
    }
    @GetMapping("/getCommissionById/{CommissionId}")
    public ResponseEntity<Optional<Commission>> getCommissionById(@PathVariable("CommissionId") int CommissionId) {
        return ResponseEntity.ok().body(commissionService.getCommissionById(CommissionId));
    }

    @GetMapping("/getCommissions")
    public ResponseEntity<List<Commission>> getCommissions() {
        List<Commission> Commissions = commissionService.getCommissions();
        return new ResponseEntity<>(Commissions, HttpStatus.OK);
    }

    @PostMapping("/addCommission")
    public ResponseEntity<Commission> addCommission(@RequestBody Commission Commission) {
        Commission newCommission = commissionService.addCommission(Commission);
        return new ResponseEntity<>(newCommission, HttpStatus.CREATED);
    }

    @PutMapping("/updateCommission")
    public ResponseEntity<Commission> updateCommission(@RequestBody Commission Commission){
        Commission updatedCommission = commissionService.updateCommission(Commission);
        return new ResponseEntity<>(updatedCommission, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCommission/{CommissionId}")
    public ResponseEntity<?> deleteCommission(@PathVariable("CommissionId") int CommissionId){
        commissionService.deleteCommission(CommissionId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
