package com.paydaybank.ms.account.domain;

import com.paydaybank.ms.account.constants.AccountType;

public class AccountDTO {

    private AccountType type;

    public AccountType getType() {
        return type;
    }

    public void setType(AccountType type) {
        this.type = type;
    }
}
