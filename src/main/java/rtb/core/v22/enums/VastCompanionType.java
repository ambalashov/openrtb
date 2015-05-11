package rtb.core.v22.enums;

/**
 * The following table lists the options to indicate markup types allowed for video companion ads. This table is derived
 * from IAB VAST 2.0+. See www.iab.net/vast/ for more information.
 */
public enum VastCompanionType {
    STATIC_RESOURCE(1),
    HTML_RESOURCE(2),
    IFRAME_RESOURCE(3);

    private final int id;

    VastCompanionType(int id) {
        this.id = id;
    }
}
