package rtb.core.v22.enums;

/**
 * The following table lists the media ratings using the QAG categorization. See http://www.iab.net/ne_guidelines for more information
 */
public enum QagMediaRating {
    ALL_AUDIENCES(1),
    EVERYONE_OVER_12(2),
    MATURE_AUDIENCE(3);

    private final int id;

    QagMediaRating(int id) {
        this.id = id;
    }
}
