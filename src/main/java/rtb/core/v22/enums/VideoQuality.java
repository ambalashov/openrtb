package rtb.core.v22.enums;

/**
 * The following table lists the options for the video quality (as defined by the IAB – http://www.iab.net/media/file/long‐form‐video‐final.pdf)
 */
public enum VideoQuality {
    UNKNOWN(0),
    PROFESSIONALLY_PRODUCED(1),
    PROSUMER(2),
    USER_GENERATED(3);

    private final int id;

    VideoQuality(int id) {
        this.id = id;
    }
}
