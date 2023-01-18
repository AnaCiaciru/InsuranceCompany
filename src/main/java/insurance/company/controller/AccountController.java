package insurance.company.controller;

import insurance.company.model.Account;
import insurance.company.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/getAccounts")
    public ResponseEntity<List<Account>> getAccounts(){
        List<Account> accounts = accountService.getAccounts();
        return new ResponseEntity<>(accounts, HttpStatus.OK);
        //return ResponseEntity.ok().body(accountService.getAccounts());
    }

    @PostMapping("/addAccount")
    public ResponseEntity<Account> addAccount(@RequestParam Account account){
        Account newAccount = accountService.addAccount(account);
        return new ResponseEntity<>(newAccount, HttpStatus.CREATED);
    }
}
