package com.paydaybank.ms.user.domain;
import com.paydaybank.ms.user.constants.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    @Id
    private String emailAddress;
    private String password;
/*    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Gender gender;
    private Date dateOfBirth;*/
}
