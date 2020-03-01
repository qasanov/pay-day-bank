package com.paydaybank.ms.transaction.web;


import com.paydaybank.ms.transaction.domain.Transaction;
import com.paydaybank.ms.transaction.service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tx")
public class TransactionController {

    private final TransactionService transactionService;

    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Transaction>> summary(){
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        List<Transaction> accountList = transactionService.getAll(authentication.getName());
        return ResponseEntity.ok(accountList);
    }

}
