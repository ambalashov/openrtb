package rtb.core.v22;

import rtb.core.Optional;

import java.util.List;

/**
 * <p>The content object itself and all of its parameters are optional, so default values are not
 * provided. If an optional parameter is not specified, it should be considered unknown. This
 * object describes the content in which the impression will appear (may be syndicated or non-
 * syndicated content).</p>
 * <p>This object may be useful in the situation where syndicated content contains impressions and
 * does not necessarily match the publisher’s general content. The exchange might or might not
 * have knowledge of the page where the content is running, as a result of the syndication
 * method. (For example, video impressions embedded in an iframe on an unknown web property
 * or device.)</p>
 */
public class Content {

    /**
     * ID uniquely identifying the content
     */
    @Optional
    private String id;
    /**
     * Content episode number (typically applies to video content).
     */
    @Optional
    private Integer episode;
    /**
     * Content title. Video examples: “Search Committee” (television) or “A New Hope” (movie) or “Endgame” (made for web) Non-video example: “Why an Antarctic Glacier Is Melting So Quickly” (Time magazine article)
     */
    @Optional
    private String title;
    /**
     * Content series. Video examples: “The Office” (television) or “Star Wars” (movie) or “Arby ‘N’ The Chief” (made for web) Non-video example: “Ecocentric” (Time magazine blog) season optional string Content season. E.g., “Season 3” (typically applies to video content). url optional string Original URL of the content, for buy-side contextualization or review
     */
    @Optional
    private String series;
    /**
     * Array of IAB content categories for the content. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> cat;
    /**
     * Content rating (e.g., MPAA) userrating optional String User rating of the content (e.g., number of stars, likes, etc.).
     */
    @Optional
    private Integer videoquality;
    /**
     * Video quality per the IAB’s classification. See Table 6.14 Video Quality. Comma separated list of keywords describing the content. ALTERNATE Representation: Array of strings.
     */
    @Optional
    private String keywords;
    /**
     * Content rating (e.g., MPAA) userrating optional string User rating of the content (e.g., number of stars, likes, etc.).
     */
    @Optional
    private String contentrating;
    /**
     * Specifies the type of content (game, video, text, etc.). See Table 6.13 Content Context.
     */
    @Optional
    private String context;
    /**
     * Is content live? E.g., live video stream, live blog. “1” means content is live. “0” means it is not live.
     */
    @Optional
    private Integer livestream;
    /**
     * 1 for “direct”; 0 for “indirect”
     */
    @Optional
    private Integer sourcerelationship;
    /**
     * See Producer Object len optional integer Length of content (appropriate for video or audio) in seconds.
     */
    @Optional
    private Producer producer;
    /**
     * Media rating of the content, per QAG guidelines. See Table 0 QAG Media Ratings for list of possible values
     */
    @Optional
    private Integer qagmediarating;
    /**
     * From QAG Video Addendum. If content can be embedded (such as an embeddable video player) this value should be set to “1”. If content cannot be embedded, then this should be set to “0”.
     */
    @Optional
    private Integer embeddable;
    /**
     * Language of the content. Use alpha-2/ISO 639-1 codes.
     */
    @Optional
    private String language;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
