package com.sample;


import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    @Test
    public void GivenFirstName_WhenValid_ShouldReturnTrue(){
        UserValidator userValidator =new UserValidator();
        try {
            boolean result = userValidator.validateFirstName.check("Saud");
            Assert.assertTrue(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void GivenFirstName_WhenInvalid_ShouldReturnFalse(){
        UserValidator userValidator =new UserValidator();
        try {
            boolean result = userValidator.validateFirstName.check("saud");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenFirst_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateFirstName.check("sa");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }


    @Test
    public void givenLastName_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateLastName.check("Hasan");
            Assert.assertTrue(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateLastName.check("hasan");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenLastName_WhenShort_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateLastName.check("ha");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc@gmail.com");
            Assert.assertTrue(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotProper_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check(".abc@gmail.comdt.inin");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenNotContainsAtTheRateSymbol_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenTldStartWithDot_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc@.com.my");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenFirstCharacterStartWithDot_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check(".abc@gmail.co.in");
            Assert.assertFalse(result);
        } catch(UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenDoubleDots_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc..202@gmail.com");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenDoubleAtTheRate_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc@abc@gmail.com");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenTldHaveDigits_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc@gmail.co.1i");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmail_WhenHaveMultipleTld_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateEmail.check("abc@gmail.co.in.in");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateMobileNumber.check("91 8754692154");
            Assert.assertTrue(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateMobileNumber.check("91 87546921545");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenCountryCodeNotValid_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateMobileNumber.check("95 8754692154");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenMobileNumber_WhenNotSpaceAfterCountryCode_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validateMobileNumber.check("918754692154");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword.check("Saud@123");
            Assert.assertTrue(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword.check("saud@123");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNoNumericValue_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword.check("saud@hasan");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNotMinimumDigits_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword.check("hello12");
            Assert.assertFalse(result);
        }catch (UserException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenPassword_WhenNoSpecialCharacter_ShouldReturnFalse() {
        UserValidator userValidator = new UserValidator();
        try {
            boolean result = userValidator.validatePassword.check("hello12345");
            Assert.assertFalse(result);
        } catch (UserException e){
            e.printStackTrace();
        }
    }

}
