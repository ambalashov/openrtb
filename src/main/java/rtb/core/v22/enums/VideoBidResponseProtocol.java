package rtb.core.v22.enums;

/**
 * The following table lists the options for video bid response protocols that could be supported by an exchange
 */
public enum VideoBidResponseProtocol {
    VAST_1_0(1),
    VAST_2_0(2),
    VAST_3_0(3),
    VAST_1_0_WRAPPER(4),
    VAST_2_0_WRAPPER(5),
    VAST_3_0_WRAPPER(6);

    private final int id;

    VideoBidResponseProtocol(int id) {
        this.id = id;
    }
}
