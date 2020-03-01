package com.paydaybank.ms.account.service;

import com.paydaybank.ms.account.domain.Account;
import com.paydaybank.ms.account.domain.AccountDTO;

public interface AccountService {

    Account create(String username, AccountDTO dto);

}
