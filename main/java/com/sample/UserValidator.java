package com.sample;

import java.util.regex.Pattern;

@FunctionalInterface
interface Validate {
    public boolean check(String fName) throws UserException;
}

public class UserValidator {
    private static final String name = "^[A-Z]{1}[a-z]{2,}";
    private static final String e_mail = "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*+@[a-zA-Z0-9]+[.]([a-zA-z]{2,4})+(([.][a-z]{2,4})?)$";
    private static final String mobNumber = "^([9]{1}[1]{1})\\s{1}[0-9]{10}$";
    private static final String password = "^(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[a-z])(?=.*[#?!@$%^&*-]).{8,}$";


    Validate validateFirstName = (fName) -> {
        try {
            Pattern pattern = Pattern.compile(name);
            return pattern.matcher(fName).matches();
        } catch (NullPointerException e){
            throw new UserException("Enter Proper Name");
        }
    };

    Validate validateLastName = (lName) -> {
        try {
            Pattern pattern = Pattern.compile(name);
            return pattern.matcher(lName).matches();
        } catch (NullPointerException e){
            throw new UserException("Enter Proper Last Name");
        }
    };

    Validate validateEmail = (email) -> {
        try {
            Pattern pattern = Pattern.compile(e_mail);
            return pattern.matcher(email).matches();
        } catch (NullPointerException e){
            throw new UserException("Enter Proper Email");
        }
    };

    Validate validateMobileNumber = (mNumber) -> {
        try {
            Pattern pattern = Pattern.compile(mobNumber);
            return pattern.matcher(mNumber).matches();
        } catch (NullPointerException e){
            throw new UserException("Enter Proper Mobile Number");
        }
    };

    Validate validatePassword = (pass) -> {
        try {
            Pattern pattern = Pattern.compile(password);
            return pattern.matcher(pass).matches();
        } catch (NullPointerException e){
            throw new UserException("Enter valid Password");
        }
    };
}
