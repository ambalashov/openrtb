package rtb.core.v22.enums;

/**
 * The following table indicates the types of ads that can be accepted by the exchange unless
 * restricted by publisher site settings
 */
public enum BannerAdType {
    /**
     * XHTML text ad. (usually mobile)
     */
    XHTML_TEXT_AD(1),
    /**
     * XHTML banner ad. (usually mobile)
     */
    XHTML_BANNER_AD(2),
    /**
     * JavaScript ad; must be valid XHTML (i.e., script tags included).
     */
    JAVASCRIPT_AD(3),
    IFRAME(4);

    private final int id;

    BannerAdType(int id) {
        this.id = id;
    }
}
