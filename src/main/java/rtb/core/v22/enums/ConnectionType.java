package rtb.core.v22.enums;

public enum ConnectionType {
    UNKNOWN(0),
    ETHERNET(1),
    WIFI(2),
    CELLULAR_DATA_UNKNOWN_GENERATION(3),
    CELLULAR_DATA_2G(4),
    CELLULAR_DATA_3G(5),
    CELLULAR_DATA_4G(6);

    private final int id;

    ConnectionType(int id) {
        this.id = id;
    }
}
