package rtb.core.v22.enums;

/**
 * <p>The following table lists the various options for the content context; what type of content is it.</p>
 * <p>Note to the reader: This OpenRTB table has values derived from the IAB Quality Assurance Guidelines (QAG). Users of OpenRTB should keep in synch with updates to the QAG values as published on IAB.net</p>
 */
public enum ContentContext {
    /**
     * a video file or stream that is being watched by the user, including (Internet) television broadcasts
     */
    VIDEO(1),
    /**
     * an interactive software game that is being played by the user
     */
    GAME(2),
    /**
     * an audio file or stream that is being listened to by the user, including (Internet) radio broadcasts
     */
    MUSIC(3),
    /**
     * an interactive software application that is being used by the user
     */
    APPLICATION(4),
    /**
     * a document that is primarily textual in nature that is being read or viewed by the user, including web page, ebook, or news article
     */
    TEXT(5),
    /**
     * content type unknown or the user is consuming content which does not fit into one of the categories above
     */
    OTHER(6),
    UNKNOWN(7);

    private final int id;

    ContentContext(int id) {
        this.id = id;
    }
}
