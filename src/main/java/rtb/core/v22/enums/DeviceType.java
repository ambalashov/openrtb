package rtb.core.v22.enums;

import rtb.core.Version;

/**
 * <p>The following table lists the options to indicate how the geographic information was determined. Notes to the reader:</p>
 * <ul>
 * <li>This OpenRTB table has values derived from the IAB Quality Assurance Guidelines (QAG). Users of OpenRTB should keep in synch with updates to the QAG values as published on IAB.net. </li>
 * <li>Version 2.2 of the spec added distinct values for Mobile and Tablet. Any implementing exchange and bidder should co‐ordinate dependencies on transmitting or receiving the new values. It is recommended that any bidder adding support for 2.2 treat a value of 1 as an acceptable alias of 4 & 5.</li>
 * </ul>
 */
public enum DeviceType {
    MOBILE_TABLET(1),
    PERSONAL_COMPUTER(2),
    CONNECTED_TV(3),
    @Version("2.2")
    PHONE(4),
    @Version("2.2")
    TABLET(5),
    @Version("2.2")
    CONNECTED_DEVICE(6),
    @Version("2.2")
    SET_TOP_BOX(7);

    private final int id;

    DeviceType(int id) {
        this.id = id;
    }
}
