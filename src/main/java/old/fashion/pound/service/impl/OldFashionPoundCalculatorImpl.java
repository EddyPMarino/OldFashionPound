package old.fashion.pound.service.impl;

import old.fashion.pound.service.OldFashionPoundCalculator;
import old.fashion.pound.utils.ConvertPound;
import old.fashion.pound.utils.ValidatePound;
import org.springframework.stereotype.Service;

@Service
public class OldFashionPoundCalculatorImpl implements OldFashionPoundCalculator {
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

    @Override
    public String multiply(String multiplicand1, Integer multiplicand2) {
        validate(multiplicand1);
        int multi1 = ConvertPound.toPennies(multiplicand1);
        int mult = multi1 * multiplicand2;
        String poundMult = ConvertPound.toPoundString(mult);
        return poundMult;
    }

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

    private void validate(String pound) {
        if (!ValidatePound.isValid(pound)) {
            throw new IllegalArgumentException("Invalid pound");
        }
    }
}
