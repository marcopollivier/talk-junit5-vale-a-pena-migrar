package com.github.marcopollivier.talkjunit5valeapenamigrar.utils;

import java.util.regex.Pattern;

public class ValidationUtils {

    public static boolean isValidEmail(String email) {

        if (email != null && email.length() > 0) {

            String expression = "^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
            Pattern pattern = Pattern.compile(expression, Pattern.CASE_INSENSITIVE);

            return pattern.matcher(email).matches();
        }

        return false;
    }

}
