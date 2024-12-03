package old.fashion.pound.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static old.fashion.pound.utils.Constants.POUND_REGEX;

public class ValidatePound {

    ValidatePound() {
    }

    public static boolean isValid(String pound) {
        Pattern pattern = Pattern.compile(POUND_REGEX);
        Matcher matcher = pattern.matcher(pound);
        return matcher.matches();
    }
}
