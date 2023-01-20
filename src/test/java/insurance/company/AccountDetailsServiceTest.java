package insurance.company;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.repository.AccountDetailsRepository;
import insurance.company.service.AccountDetailsService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountDetailsServiceTest {

    @InjectMocks
    private AccountDetailsService accountDetailsService;

    @Mock
    private AccountDetailsRepository accountDetailsRepository;

    @Test
    void addAccountDetailsHappyFlow(){
        // Arrange
        AccountDetails accountDetails = new AccountDetails(21,"0768911696", 123, "Consulting", "Bucharest");
        when(accountDetailsRepository.save(accountDetails)).thenReturn(accountDetails);

        // Act
        AccountDetails result = accountDetailsService.addAccountDetails(accountDetails);

        // Assert
        assertEquals(accountDetails.getAccountNumber(), result.getAccountNumber());

    }
}

