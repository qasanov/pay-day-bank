package com.paydaybank.ms.transaction.repository;

import com.paydaybank.ms.transaction.domain.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findAllByUserNameOrderByInsertDate(String username);

}
