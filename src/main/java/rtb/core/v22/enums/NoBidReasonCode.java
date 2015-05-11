package rtb.core.v22.enums;

/**
 * The following table lists the options to signal the exchange why the impression was not bid on
 */
public enum NoBidReasonCode {
    UNKNOWN(0),
    TECHNICAL_ERROR(1),
    INVALID_REQUEST(2),
    KNOWN_WEB_SPIDER(3),
    SUSPECTED_NON_HUMAN_TRAFFIC(4),
    CLOUD_OR_DATA_CENTER_OR_PROXY_IP(5),
    UNSUPPORTED_DEVICE(6),
    BLOCKED_PUBLISHER_OR_SITE(7),
    UNMATCHED_USER(8);

    private final int id;

    NoBidReasonCode(int id) {
        this.id = id;
    }
}
