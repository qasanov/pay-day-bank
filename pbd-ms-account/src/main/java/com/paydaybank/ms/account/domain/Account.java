package com.paydaybank.ms.account.domain;

import com.paydaybank.ms.account.constants.AccountStatus;
import com.paydaybank.ms.account.constants.AccountType;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Account {
    @Id
    private String number;
    private String userName;
    private AccountType type;
    private AccountStatus status;
    private BigDecimal balance;
    private Date insertDate;
}
