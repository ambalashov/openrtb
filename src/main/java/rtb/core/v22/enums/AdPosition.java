package rtb.core.v22.enums;

/**
 * The following table specifies the position of the ad as a relative measure of visibility orprominence.
 * Note to the reader: This OpenRTB table has values derived from the IAB QualityAssurance Guidelines (QAG).
 * Users of OpenRTB should keep in sync with updates to the QAGvalues as published on IAB.net. Values 3‐6
 * apply to native apps per the mobile addendum to the version 1.5 of the QAG.
 */
public enum AdPosition {
    UNKNOWN(0),
    ABOVE_THE_FOLD(1),
    /**
     * DEPRECATED  -­‐  May  or  may  not  be  immediately  visible  depending  on  screen  size  and  resolution
     */
    @Deprecated
    VISIBILITY(2),
    BELOW_THE_FOLD(3),
    HEADER(4),
    FOOTER(5),
    SIDEBAR(6),
    FULLSCREEN(7);

    private final int id;

    AdPosition(int id) {
        this.id = id;
    }
}
