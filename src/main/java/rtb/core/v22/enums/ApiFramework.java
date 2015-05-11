package rtb.core.v22.enums;

public enum ApiFramework {
    VPAID_1_0(0),
    VPAID_2_0(1),
    MRAID_1(3),
    ORMMA(4),
    MRAID_2(5);

    private final int id;

    ApiFramework(int id) {
        this.id = id;
    }
}
