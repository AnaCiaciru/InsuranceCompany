package insurance.company.controller;

import insurance.company.model.AccountDetails;
import insurance.company.service.AccountDetailsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountDetailsController {

    private final AccountDetailsService accountDetailsService;

    public AccountDetailsController(AccountDetailsService accountDetailsService) {
        this.accountDetailsService = accountDetailsService;
    }

    @PostMapping("/addAccountDetails")
    public ResponseEntity<AccountDetails> addAccountDetails(@RequestBody AccountDetails accountDetails) {
        AccountDetails newAccountDetails = accountDetailsService.addAccountDetails(accountDetails);
        return new ResponseEntity<>(newAccountDetails, HttpStatus.CREATED);
    }

    @GetMapping("/getAccountDetailsById/{accountDetailsId}")
    public ResponseEntity<Optional<AccountDetails>> getAccountDetailsById(@PathVariable("accountDetailsId") int accountDetailsId) {
        return ResponseEntity.ok().body(accountDetailsService.getAccountDetailsById(accountDetailsId));
    }

    @GetMapping("/getAllAccountDetails")
    public ResponseEntity<List<AccountDetails>> getAccountDetailss() {
        List<AccountDetails> accountDetailss = accountDetailsService.getAllAccountDetails();
        return new ResponseEntity<>(accountDetailss, HttpStatus.OK);
    }


    @PutMapping("/updateAccountDetails")
    public ResponseEntity<AccountDetails> updateAccountDetails(@RequestBody AccountDetails accountDetails){
        AccountDetails updatedAccountDetails = accountDetailsService.updateAccountDetails(accountDetails);
        return new ResponseEntity<>(updatedAccountDetails, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteAccountDetails/{accountDetailsId}")
    public ResponseEntity<?> deleteAccountDetails(@PathVariable("accountDetailsId") int accountDetailsId){
        accountDetailsService.deleteAccountDetails(accountDetailsId);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
