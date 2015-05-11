package rtb.core.v22.enums;

/**
 * The following table lists the directions in which an expandable ad may expand, given the positioning of the ad unit
 * on the page and constraints imposed by the content.
 */
public enum ExpandableDirection {
    LEFT(1),
    RIGHT(2),
    UP(3),
    DOWN(4),
    FULLSCREEN(5);

    private final int id;

    ExpandableDirection(int id) {
        this.id = id;
    }
}
