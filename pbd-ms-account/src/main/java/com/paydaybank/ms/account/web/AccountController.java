package com.paydaybank.ms.account.web;


import com.paydaybank.ms.account.domain.Account;
import com.paydaybank.ms.account.domain.AccountDTO;
import com.paydaybank.ms.account.service.AccountService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/account")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/create")
    public ResponseEntity<?> createUser(@RequestBody AccountDTO accountDTO){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        accountService.create(authentication.getName() , accountDTO);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/summary")
    public ResponseEntity<List<Account>> summary(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Account> accountList = accountService.getActiveAccountList(authentication.getName());
        return ResponseEntity.ok(accountList);
    }

}
