package com.paydaybank.ms.account.service;

import com.paydaybank.ms.account.constants.AccountStatus;
import com.paydaybank.ms.account.constants.AccountType;
import com.paydaybank.ms.account.domain.Account;
import com.paydaybank.ms.account.domain.AccountDTO;
import com.paydaybank.ms.account.repository.AccountRepository;
import com.paydaybank.ms.account.util.AccountUtil;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Service
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;
    private final int DEFAULT_ACCOUNT_NUMBER_LENGTH = 10;

    public AccountServiceImpl(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @Override
    public Account create(String username, AccountDTO dto) {
        Account account = new Account();
        account.setType(dto.getType());
        account.setUserName(username);
        account.setStatus(AccountStatus.ACTIVE);
        account.setBalance(BigDecimal.ZERO);
        account.setInsertDate(new Date());
        account.setNumber(AccountUtil.generateAccountNumber(DEFAULT_ACCOUNT_NUMBER_LENGTH));
        return accountRepository.save(account);
    }

    @Override
    public List<Account> getActiveAccountList(String username) {
        return accountRepository.getAccountListByUserNameAndStatus(username, AccountStatus.ACTIVE);
    }
}
