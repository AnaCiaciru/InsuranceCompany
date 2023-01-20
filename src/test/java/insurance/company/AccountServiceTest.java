package insurance.company;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.repository.AccountDetailsRepository;
import insurance.company.repository.AccountRepository;
import insurance.company.service.AccountService;
import org.junit.jupiter.api.DisplayName;
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
    @Mock
    private AccountDetailsRepository accountDetailsRepository;

    @Test
    //@DisplayName("runing happy flow")
    void addAccountHappyFlow(){
//        // Arrange
//        AccountDetails accountDetails = new AccountDetails(21,"0768911696", 123, "Consulting", "Bucharest");
//        Account account = new Account(1, "Test 1", accountDetails);
//        when(accountRepository.save(account)).thenReturn(account);
//
//        // Act
//        Account result = accountService.addAccount(account, 21);
//
//        // Assert
//        assertEquals(account.getAccountName(), result.getAccountName());

    }
}
