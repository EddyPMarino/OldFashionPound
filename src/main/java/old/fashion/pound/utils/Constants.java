package old.fashion.pound.utils;

/**
 * Utility class for defining constants related to old-fashioned pound values.
 */
public class Constants {

    private Constants() {
    }

    /**
     * Regular expression pattern for matching old-fashioned pound values.
     */
    public static final String POUND_REGEX = "(\\d+p)? ?(\\d+s)? ?(\\d+d)?";

    /**
     * Number of pennies in a shilling.
     */
    public static final Integer PENNIES_IN_SHILLING = 12;

    /**
     * Number of shillings in a pound.
     */
    public static final Integer SHILLINGS_IN_POUND = 20;

    /**
     * Prefix for remaining values in old-fashioned pound format.
     */
    public static final String PREFIX_REMAININGS = " (";

    /**
     * Suffix for remaining values in old-fashioned pound format.
     */
    public static final String SUFFIX_REMAININGS = ")";

    /**
     * Symbol for pounds.
     */
    public static final String POUND_SYMBOL = "p";

    /**
     * Symbol for shillings.
     */
    public static final String SHILLING_SYMBOL = "s";

    /**
     * Symbol for pennies.
     */
    public static final String PENNY_SYMBOL = "d";
}