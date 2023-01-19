package insurance.company;

import insurance.company.repository.AccountRepository;
import insurance.company.service.AccountService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @InjectMocks
    private AccountService accountService;

    @Mock
    private AccountRepository accountRepository;

    @Test
    void whenAccountAlreadyExists_create_throwsDuplicateAccountException(){
        // Arrange

        // Act


        // Assert


        //        !!! here I cannot check with verifyNoInteractions(), because the execution has one interaction
        //        with destinationRepository, when calling the findByName() method. so I have to be specific,
        //        and check only that the execution didn't call the save() method
    }
}
