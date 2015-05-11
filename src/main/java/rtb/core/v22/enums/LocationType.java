package rtb.core.v22.enums;

/**
 * The following table lists the options to indicate how the geographic information was determined
 */
public enum LocationType {
    GPS_OR_LOCATION_SERVICE(1),
    IP_ADDRESS(2),
    USER_PROVIDED(3);

    private final int id;

    LocationType(int id) {
        this.id = id;
    }
}
