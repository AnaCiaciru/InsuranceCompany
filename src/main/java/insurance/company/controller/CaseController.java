package insurance.company.controller;

import insurance.company.model.Case;
import insurance.company.service.CaseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class CaseController {
    private final CaseService caseService;

    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }

    @GetMapping("/getCaseById/{CaseId}")
    public ResponseEntity<Optional<Case>> getCaseById(@PathVariable("CaseId") int CaseId) {
        return ResponseEntity.ok().body(caseService.getCaseById(CaseId));
    }

    @GetMapping("/getCases")
    public ResponseEntity<List<Case>> getCases() {
        List<Case> Cases = caseService.getCases();
        return new ResponseEntity<>(Cases, HttpStatus.OK);
    }

    @PostMapping("/addCase")
    public ResponseEntity<Case> addCase(@RequestBody Case vcase) {
        Case newCase = caseService.addCase(vcase);
        return new ResponseEntity<>(newCase, HttpStatus.CREATED);
    }

    @PutMapping("/updateCase")
    public ResponseEntity<Case> updateCase(@RequestBody Case vcase){
        Case updatedCase = caseService.updateCase(vcase);
        return new ResponseEntity<>(updatedCase, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCase/{CaseId}")
    public ResponseEntity<?> deleteCase(@PathVariable("CaseId") int CaseId){
        caseService.deleteCase(CaseId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
