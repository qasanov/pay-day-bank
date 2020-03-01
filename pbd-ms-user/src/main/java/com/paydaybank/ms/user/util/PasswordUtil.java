package com.paydaybank.ms.user.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordUtil {

    private static Pattern pattern =  Pattern.compile("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%+]).{6,20})");

    public static boolean isAlphanumeric(final String password) {
        if(password == null) return false;
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }
}