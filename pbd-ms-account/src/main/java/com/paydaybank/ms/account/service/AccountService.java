package com.paydaybank.ms.account.service;

import com.paydaybank.ms.account.domain.Account;
import com.paydaybank.ms.account.domain.AccountDTO;

import java.util.List;

public interface AccountService {

    Account create(String username, AccountDTO dto);
    List<Account> getActiveAccountList(String username);

}
