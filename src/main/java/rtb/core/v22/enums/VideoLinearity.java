package rtb.core.v22.enums;

/**
 * <p>The following table indicates the options for video linearity. \"In-­‐stream\" or \"linear\" video refers to
 * pre‐roll, post‐roll, or mid‐roll video ads where the user is forced to watch ad in order to see the video content.
 * “Overlay” or “non‐linear” refer to ads that are shown on top of the video content.  Note to the reader: This OpenRTB
 * table has values derived from the IAB Quality Assurance Guidelines (QAG). Users of OpenRTB should keep in synch with
 * updates to the QAG values as published on IAB.net</p>
 * <p>This field is optional. The following is the interpretation of the bidder based upon the presence or absence of
 * the field in the bid request:
 * <ul><li>If no value is set, any ad (linear or not) can be present in the response. </li>
 * <li>If a value is set, only ads of the corresponding type can be present in the response </li></ul></p>
 */
public enum VideoLinearity {
    /**
     * Linear/In‐stream
     */
    LINEAR(1),
    /**
     * Non-Linear/Overlay
     */
    NON_LINEAR(2);

    private final int id;

    VideoLinearity(int id) {
        this.id = id;
    }
}
