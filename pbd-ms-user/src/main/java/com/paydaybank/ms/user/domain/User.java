package com.paydaybank.ms.user.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.paydaybank.ms.user.constants.Gender;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class User {
    @Id
    private String emailAddress;
    private String password;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date dateOfBirth;
}
