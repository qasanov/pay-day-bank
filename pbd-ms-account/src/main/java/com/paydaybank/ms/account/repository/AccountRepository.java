package com.paydaybank.ms.account.repository;

import com.paydaybank.ms.account.constants.AccountStatus;
import com.paydaybank.ms.account.domain.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountRepository  extends JpaRepository<Account,String> {

    List<Account> getAccountListByUserNameAndStatus(String username, AccountStatus status);
}
