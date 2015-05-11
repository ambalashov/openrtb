package rtb.core.v22.enums;

public enum ContentDeliveryMethod {
    STREAMING(1),
    PROGRESSIVE(2);


    private final int id;

    ContentDeliveryMethod(int id) {
        this.id = id;
    }
}
