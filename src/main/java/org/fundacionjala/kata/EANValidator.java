package org.fundacionjala.kata;

/**
 * Created by AngelaValdez on 8/26/2016.
 */
public class EANValidator {

    public static boolean validate(String number) {
        final int checkSumPosition = 12;
        final int correctCheckSum = obtainCheckSum(number);
        return number.charAt(checkSumPosition) == correctCheckSum ? true : false;
    }

    private static int calculateSum(String number) {
        final int limit = 12;
        return (int) number.chars()
                .limit(limit)
                .mapToDouble(character -> number.indexOf(character) % 2 == 0 ? character * 3 : character * 1)
                .sum();
    }

    private static int obtainCheckSum(String number) {
        final int digitsSum = calculateSum(number);
        return digitsSum % 10 == 0 ? 0 : 10 - (digitsSum % 10);
    }


}
