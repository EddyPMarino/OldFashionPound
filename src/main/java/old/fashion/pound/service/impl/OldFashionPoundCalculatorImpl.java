package old.fashion.pound.service.impl;

import old.fashion.pound.service.OldFashionPoundCalculator;
import old.fashion.pound.utils.ConvertPound;
import old.fashion.pound.utils.ValidatePound;
import org.springframework.stereotype.Service;

/**
 * Implementation of the OldFashionPoundCalculator interface.
 */
@Service
public class OldFashionPoundCalculatorImpl implements OldFashionPoundCalculator {

    /**
     * Adds two pound values.
     *
     * @param addend1 the first addend in pound format
     * @param addend2 the second addend in pound format
     * @return the sum of the two addends in pound format
     * @throws IllegalArgumentException if any of the addends are invalid
     */
    @Override
    public String add(String addend1, String addend2) {
        validate(addend1);
        validate(addend2);
        int add1 = ConvertPound.toPennies(addend1);
        int add2 = ConvertPound.toPennies(addend2);
        int sum = add1 + add2;
        String poundSum = ConvertPound.toPoundString(sum);
        return poundSum;
    }

    /**
     * Subtracts the second pound value from the first.
     *
     * @param subtrahend1 the value to be subtracted from in pound format
     * @param subtrahend2 the value to subtract in pound format
     * @return the difference in pound format
     * @throws IllegalArgumentException if any of the subtrahends are invalid
     */
    @Override
    public String subtract(String subtrahend1, String subtrahend2) {
        validate(subtrahend1);
        validate(subtrahend2);
        int sub1 = ConvertPound.toPennies(subtrahend1);
        int sub2 = ConvertPound.toPennies(subtrahend2);
        int diff = sub1 - sub2;
        String poundDiff = ConvertPound.toPoundString(diff);
        return poundDiff;
    }

    /**
     * Multiplies a pound value by an integer.
     *
     * @param multiplicand1 the pound value to be multiplied
     * @param multiplicand2 the integer multiplier
     * @return the product in pound format
     * @throws IllegalArgumentException if the multiplicand is invalid
     */
    @Override
    public String multiply(String multiplicand1, Integer multiplicand2) {
        validate(multiplicand1);
        int multi1 = ConvertPound.toPennies(multiplicand1);
        int mult = multi1 * multiplicand2;
        String poundMult = ConvertPound.toPoundString(mult);
        return poundMult;
    }

    /**
     * Divides a pound value by an integer.
     *
     * @param dividend1 the pound value to be divided
     * @param dividend2 the integer divisor
     * @return the quotient and remainder in pound format
     * @throws IllegalArgumentException if the dividend is invalid
     */
    @Override
    public String divide(String dividend1, Integer dividend2) {
        validate(dividend1);
        int div1 = ConvertPound.toPennies(dividend1);
        int div = div1 / dividend2;
        int remaining = div1 % dividend2;
        String divPound = ConvertPound.toPoundString(div);
        String remainingPound = ConvertPound.toRemainingsString(remaining);
        return divPound + remainingPound;
    }

    /**
     * Validates the pound value.
     *
     * @param pound the pound value to be validated
     * @throws IllegalArgumentException if the pound value is invalid
     */
    private void validate(String pound) {
        if (!ValidatePound.isValid(pound)) {
            throw new IllegalArgumentException("Invalid pound");
        }
    }
}
