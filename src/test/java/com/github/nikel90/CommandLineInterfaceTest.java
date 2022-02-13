package com.github.nikel90;

import org.junit.Assert;
import org.junit.Test;

public class CommandLineInterfaceTest {

    /**
     * Checking the conversion of a string to the correct form.
     */
    @Test()
    public void checkingConversionSourceStringToCorrectForm() {
        String source = "horse 1231 @#!*&$^*()%^?/.{}[]";
        String result = "horse1231";

        String normalizeString = CommandLineInterface.normalize(source);

        Assert.assertEquals(result, normalizeString);
    }

    /**
     * Checking the conversion of the string to the correct length. Cropping to 50 characters.
     */
    @Test()
    public void checkingConversionSourceStringToCorrectLength() {
        String source = "aaaaaagfagdsgjhadshjashjahhadhadhdashjdsahjhadasddasdasdasdasddasdasdas";
        String result = "aaaaaagfagdsgjhadshjashjahhadhadhdashjdsahjhadasdd";

        String normalizeString = CommandLineInterface.normalize(source);

        Assert.assertEquals(result, normalizeString);
    }
}
