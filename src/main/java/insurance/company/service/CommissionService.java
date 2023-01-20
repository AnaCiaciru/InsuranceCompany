package insurance.company.service;

import insurance.company.model.Commission;
import insurance.company.repository.CommissionRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CommissionService {
    private final CommissionRepository commissionRepository;

    public CommissionService(CommissionRepository commissionRepository) {
        this.commissionRepository = commissionRepository;
    }

    public Commission addCommission(Commission commission){
        return commissionRepository.save(commission);
    }

    public Commission updateCommission(Commission commission){
        return commissionRepository.save(commission);
    }

    /// because the delete method is
    @Transactional
    public void deleteCommission(int commissionId){
        commissionRepository.deleteCommissionByCommissionId(commissionId);
    }


    public List<Commission> getCommissions(){
        return commissionRepository.findAll();
    }

    public Optional<Commission> getCommissionById(int commissionId){
        return commissionRepository.findCommissionByCommissionId(commissionId);
    }
}
