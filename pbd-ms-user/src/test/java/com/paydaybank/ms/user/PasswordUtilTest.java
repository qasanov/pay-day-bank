package com.paydaybank.ms.user;

import com.paydaybank.ms.user.util.PasswordUtil;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PasswordUtilTest {

    @Test
    void strongPassword() {
        String password = "Aa123456+";
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isTrue();
    }

    @Test
    void passwordIsEmpty() {
        String password = "";
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isFalse();
    }

    @Test
    void passwordIsNull() {
        String password = null;
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isFalse();
    }



    @Test
    void passwordNotMeetsMinimumLength() {
        String password = "12345";
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isFalse();
    }

    @Test
    void passwordOnlyNumeric() {
        String password = "1234567";
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isFalse();
    }

    @Test
    void passwordOnlyAlphabetic() {
        String password = "abcdefg";
        boolean isAlphanumeric = PasswordUtil.isAlphanumeric(password);
        assertThat(isAlphanumeric).isFalse();
    }

}
