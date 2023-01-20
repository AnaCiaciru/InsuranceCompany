package insurance.company;

import insurance.company.model.Case;
import insurance.company.repository.CaseRepository;
import insurance.company.service.CaseService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import java.util.Optional;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class CaseServiceTest {
    @Mock
    private CaseRepository caseRepository;
    @InjectMocks
    private CaseService caseService;

    @Test
    public void testAddCase() {
        Case vcase = new Case();
        when(caseRepository.save(vcase)).thenReturn(vcase);
        Case result = caseService.addCase(vcase);
        assertEquals(vcase, result);
    }

    @Test
    public void testUpdateCase() {
        Case vcase = new Case();
        when(caseRepository.save(vcase)).thenReturn(vcase);
        Case result = caseService.updateCase(vcase);
        assertEquals(vcase, result);
    }

    @Test
    public void testDeleteCase() {
        int caseId = 1;
        caseService.deleteCase(caseId);
        verify(caseRepository).deleteCaseByCaseId(caseId);
    }

    @Test
    public void testGetCases() {
        List<Case> cases = List.of(new Case());
        when(caseRepository.findAll()).thenReturn(cases);
        List<Case> result = caseService.getCases();
        assertEquals(cases, result);
    }

    @Test
    public void testGetCaseById() {
        int caseId = 1;
        Optional<Case> vcase = Optional.of(new Case());
        when(caseRepository.findCaseByCaseId(caseId)).thenReturn(vcase);
        Optional<Case> result = caseService.getCaseById(caseId);
        assertTrue(result.isPresent());
        assertEquals(vcase.get(), result.get());
    }
}
