package old.fashion.pound.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static old.fashion.pound.utils.Constants.*;

public class ConvertPound {
    private ConvertPound() {
    }

    public static int toPennies(String pound) {
        Pattern pattern = Pattern.compile(POUND_REGEX);
        Matcher matcher = pattern.matcher(pound);
        int totPennies = 0;
        if (matcher.matches()) {
            int pounds = 0;
            int shillings = 0;
            int pennies = 0;

            if (matcher.group(1) != null) {
                pounds = Integer.parseInt(matcher.group(1).replace("p", ""));
            }
            if (matcher.group(2) != null) {
                shillings = Integer.parseInt(matcher.group(2).replace("s", ""));
            }
            if (matcher.group(3) != null) {
                pennies = Integer.parseInt(matcher.group(3).replace("d", ""));
            }

            totPennies = pennies + shillings * PENNIES_IN_SHILLING + pounds * SHILLINGS_IN_POUND * PENNIES_IN_SHILLING;
        }
        return totPennies;
    }

    public static String toPoundString(int pennies) {
        int shillings = 0;
        int pounds = 0;
        StringBuilder result = new StringBuilder();

        if (pennies >= PENNIES_IN_SHILLING || pennies <= -PENNIES_IN_SHILLING) {
            shillings = pennies / PENNIES_IN_SHILLING;
            pennies = pennies % PENNIES_IN_SHILLING;
        }
        if (shillings >= SHILLINGS_IN_POUND || shillings <= -SHILLINGS_IN_POUND) {
            pounds = shillings / SHILLINGS_IN_POUND;
            shillings = shillings % SHILLINGS_IN_POUND;
        }

        if (pounds != 0) {
            result.append(pounds).append("p ");
        }
        if (shillings != 0) {
            result.append(shillings).append("s ");
        }
        if (pennies != 0 || result.isEmpty()) {
            result.append(pennies).append("d");
        } else {
            result.append("0d");
        }

        return result.toString().strip();
    }

    public static String toRemainingsString(int pennies) {
        StringBuilder result = new StringBuilder();
        if (pennies != 0) {
            String remainings = toPoundString(pennies);
            result.append(" (").append(remainings).append(")");
        }
        return result.toString();
    }
}
