package com.paydaybank.ms.transaction.domain;


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
public class Transaction {

    @Id
    private Long id;
    private String userName;
    private String accountNumber;
    private BigDecimal amount;
    private String description;
    private Date insertDate;

}
