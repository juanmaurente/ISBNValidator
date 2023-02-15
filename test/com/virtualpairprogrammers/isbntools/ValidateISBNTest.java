package com.virtualpairprogrammers.isbntools;

import org.junit.Test;

import static org.junit.Assert.*;


public class ValidateISBNTest {
    ValidateISBN validator = new ValidateISBN();

    @Test
    public void checkAValid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449116");
        assertTrue("first value", result);
        result = validator.checkISBN("0140177396");
        assertTrue("second value", result);
    }

    @Test
    public void checkAValid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260087");
        assertTrue("first value", result);
        result = validator.checkISBN("9781853267338");
        assertTrue("second value", result);
    }

    @Test
    public void tenDigitISBNNumberEndingInAnXValid() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("012000030X");
        assertTrue(result);
    }

    @Test
    public void checkAnInvalid10DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("0140449117");
        assertFalse(result);
    }


    @Test
    public void checkAnInvalid13DigitISBN() {
        ValidateISBN validator = new ValidateISBN();
        boolean result = validator.checkISBN("9781853260084");
        assertFalse(result);
    }

    @Test(expected = NumberFormatException.class)
    public void checkAnInvalidLengthOfAnISBN() {
        validator.checkISBN("12345671189");
    }

    @Test(expected = NumberFormatException.class)
    public void nonNumericISBNAreNotAllowed() {
        validator.checkISBN("helloworld");
    }


    //Other Assertions
    // assertNotNull ( value )
    // assertEquals( myExpectedResult , myResult)
    // assertThat ( myResult, condition);

    /* For example:
    * @Test
    * public void valueIsNotNull(){
    * MySystem mySystem = new MySystem();
    * String value = mySystem.getValue();
    * assertNotNull(value)
    *
    *
    * @Test
    * public void isAValidEmailAddress(){
    *   MySystem mySystem = new MySystem();
    *   String email = mySystem.getEmail();
    *   assertThat ( email, StringContains.containsString("@"));
    * }
    *
    * // note that we could do assertTrue ( email.indexOf("@") > -1);
    *
    *
    *
    * */
}

