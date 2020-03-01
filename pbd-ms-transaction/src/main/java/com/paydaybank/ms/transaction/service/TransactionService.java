package com.paydaybank.ms.transaction.service;

import com.paydaybank.ms.transaction.domain.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> getAll(String username);
}
