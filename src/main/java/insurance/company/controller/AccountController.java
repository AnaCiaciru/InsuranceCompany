package insurance.company.controller;

import insurance.company.model.Account;
import insurance.company.model.AccountDetails;
import insurance.company.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping("/getAccountById/{accountId}")
    public ResponseEntity<Optional<Account>> getAccountById(@PathVariable("accountId") int accountId) {
        return ResponseEntity.ok().body(accountService.getAccountById(accountId));
    }

    @GetMapping("/getAccounts")
    public ResponseEntity<List<Account>> getAccounts() {
        List<Account> accounts = accountService.getAccounts();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
    }

    @PostMapping("/addAccountDetails")
    public ResponseEntity<AccountDetails> addAccount(@RequestBody AccountDetails accountDetails) {
        AccountDetails newAccountDetails = accountService.addAccountDetails(accountDetails);
        return new ResponseEntity<>(newAccountDetails, HttpStatus.CREATED);
    }
    @PostMapping("/addAccount")
    public ResponseEntity<Account> addAccount(@RequestBody Account account,
                                              @RequestParam int accountDetailsId) {
        Account newAccount = accountService.addAccount(account, accountDetailsId);
        return new ResponseEntity<>(newAccount, HttpStatus.CREATED);
    }

    @PutMapping("/updateAccount")
    public ResponseEntity<Account> updateAccount(@RequestBody Account account,
                                                 @RequestParam int accountDetailsId){
        Account updatedAccount = accountService.updateAccount(account, accountDetailsId);
        return new ResponseEntity<>(updatedAccount, HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteAccount/{accountId}")
    public ResponseEntity<?> deleteAccount(@PathVariable("accountId") int accountId){
        accountService.deleteAccount(accountId);
        return new ResponseEntity<>(HttpStatus.OK);
    }


//    @PostMapping("/saveAccount")
//    public ResponseEntity<Account> saveAccount(@RequestBody Account account,
//                                               @RequestParam AccountDetails accountDetails) {
//        Account newAccount = accountService.saveAccount(account, accountDetails);
//        return new ResponseEntity<>(newAccount, HttpStatus.CREATED);
//
//    }
}
