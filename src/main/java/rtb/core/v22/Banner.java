package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

import java.util.List;

/**
 * The “banner” object must be included directly in the impression object if the impression offered
 * for auction is display or rich media, or it may be optionally embedded in the video object to
 * describe the companion banners available for the linear or non-linear video ad. The banner
 * object may include a unique identifier; this can be useful if these IDs can be leveraged in the
 * VAST response to dictate placement of the companion creatives when multiple companion ad
 * opportunities of the same size are available on a page
 */
public class Banner {

    /**
     * Width of the impression in pixels. Since some ad types are not restricted by size this field is not required,
     * but it’s highly recommended that this information be included when possible.
     */
    @Recommended
    private Integer w;

    /**
     * Height of the impression in pixels. Since some ad types are not restricted by size this field is not required,
     * but it’s highly recommended that this information be included when possible.
     */
    @Recommended
    private Integer h;

    /**
     * Maximum width of the impression in pixels. If included, it indicates that a range of sizes is allowed with this
     * maximum width and "w" is taken as recommended. If not included, then "w" should be considered an exact requirement
     */
    @Optional
    private Integer wmax;

    /**
     * Maximum height of the impression in pixels. If included, it indicates that a range of sizes is allowed with this
     * maximum height and "h" is taken as recommended. If not included, then "h" should be considered an exact requirement.
     */
    @Optional
    private Integer hmax;

    /**
     * Minimum width of the impression in pixels. If included, it indicates that a range of sizes is allowed with this
     * minimum width and "w" is taken as recommended. If not included, then "w" should be considered an exact requirement.
     */
    @Optional
    private Integer wmin;

    /**
     * Minimum height of the impression in pixels. If included, it indicates that a range of sizes is allowed with this
     * minimum height and "h" is taken as recommended. If not included, then "h" should be considered an exact requirement.
     */
    @Optional
    private Integer hmin;

    /**
     * Unique identifier for this banner object. Useful for tracking multiple banner objects (e.g., in companion banner
     * array). Usually starts with 1, increasing with each object. Combination of impression id banner object should be
     * unique.
     */
    @Recommended("when subordinate to a video object")
    private String id;

    /**
     * Ad Position. Use Table 6.5
     */
    @Optional
    private Integer pos;

    /**
     * Blocked creative types. See Table 6.2 Banner Ad Types. If blank, assume all types are allowed.
     */
    @Optional
    private List<Integer> btype;

    /**
     * Blocked creative attributes. See Table 6.3 Creative Attributes. If blank assume all types are allowed.
     */
    @Optional
    private List<Integer> battr;

    /**
     * Whitelist of content MIME types supported. Popular MIME types include, but are not limited to “image/jpg”,
     * “image/gif” and “application/x-shockwave-flash”.
     */
    @Optional
    private List<String> mimes;

    /**
     * Specify if the banner is delivered in the top frame or in an iframe. “0” means it is not in the top frame,
     * and “1” means that it is.
     */
    @Optional
    private Integer topframe;

    /**
     * Specify properties for an expandable ad. See Table 6.11 Expandable Direction for possible values
     */
    @Optional
    private List<Integer> expdir;

    /**
     * List of supported API frameworks for this banner. (See Table 6.4 API Frameworks). If an API is not explicitly
     * listed it is assumed not to be supported.
     */
    @Optional
    private List<Integer> api;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
