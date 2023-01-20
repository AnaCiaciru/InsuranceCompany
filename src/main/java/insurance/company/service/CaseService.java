package insurance.company.service;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.model.Case;
import insurance.company.repository.CaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CaseService {
    private final CaseRepository caseRepository;

    public CaseService(CaseRepository caseRepository) {
        this.caseRepository = caseRepository;
    }

    public Case addCase(Case vcase){
        return caseRepository.save(vcase);
    }

    public Case updateCase(Case vcase){
        return caseRepository.save(vcase);
    }

    /// because the delete method is
    @Transactional
    public void deleteCase(int caseId){
        caseRepository.deleteCaseByCaseId(caseId);
    }


    public List<Case> getCases(){
        return caseRepository.findAll();
    }

    public Optional<Case> getCaseById(int caseId){
        return caseRepository.findCaseByCaseId(caseId);
    }
}
