package com.paydaybank.ms.transaction.service;

import com.paydaybank.ms.transaction.domain.Transaction;
import com.paydaybank.ms.transaction.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionServiceImpl implements TransactionService {

    private final TransactionRepository transactionRepository;


    public TransactionServiceImpl(TransactionRepository transactionRepository) {
        this.transactionRepository = transactionRepository;
    }


    @Override
    public List<Transaction> getAll(String username) {
        return transactionRepository.findAllByUserNameOrderByInsertDate(username);
    }
}
