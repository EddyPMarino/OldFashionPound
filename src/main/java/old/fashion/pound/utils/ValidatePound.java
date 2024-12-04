package old.fashion.pound.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static old.fashion.pound.utils.Constants.POUND_REGEX;

/**
 * Utility class for validating old-fashioned pound values.
 */
public class ValidatePound {

    ValidatePound() {
    }

    /**
     * Validates an old-fashioned pound value.
     *
     * @param pound the old-fashioned pound value in the format "Xp Ys Zd"
     * @return true if the pound value is valid, false otherwise
     */
    public static boolean isValid(String pound) {
        Pattern pattern = Pattern.compile(POUND_REGEX);
        Matcher matcher = pattern.matcher(pound);
        return matcher.matches();
    }
}