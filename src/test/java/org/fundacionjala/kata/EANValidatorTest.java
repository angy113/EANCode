package org.fundacionjala.kata;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by AngelaValdez on 8/26/2016.
 */
public class EANValidatorTest {
    @Test
    public void test_EANCodeIsValid() {
        assertTrue(EANValidator.validate("9783815820865"));
    }

    @Test
    public void test_EANCodeIsInvalid() {
        assertFalse(EANValidator.validate("9783815820864"));
    }

    @Test
    public void test_EANCodeIsValidWhenSendTheSumIsDivisibleByTen() {
        assertTrue(EANValidator.validate("9783827317100"));
    }


}
