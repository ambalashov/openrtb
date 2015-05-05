package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;
import rtb.core.Required;

import java.util.List;

/**
 * The “video” object must be included directly in the impression object if the impression offered
 * for auction is an in-stream video ad opportunity.
 */
public class Video {
    /**
     * Content MIME types supported. Popular MIME types include, but are not limited to “video/x-ms- wmv” for Windows
     * Media, and “video/x-flv” for Flash Video.
     */
    @Required
    private List<String> mimes;
    /**
     * Minimum video ad duration in seconds
     */
    @Required
    private Integer minduration;
    /**
     * Maximum video ad duration in seconds
     */
    @Required
    private Integer maxduration;
    /**
     * Video bid response protocols. See Table 6.7 Video Bid Response Protocols for a list of possible values.
     * NOTE: Use “protocols” when multiple protocols are supported. Its use is also highly recommended even for one since this “protocol” attribute is likely to be deprecated in a future version. At least one supported protocol must be specified in either the “protocol” or “protocols” attribute.
     */
    @Optional
    private Integer protocol;
    /**
     * Video bid response protocols. See Table 6.7 Video Bid Response Protocols for a list of possible values.
     * At least one supported protocol must be specified in either the “protocol” or “protocols” attribute.
     */
    @Recommended
    private List<Integer> protocols;
    /**
     * Width of the player in pixels. This field is not required, but it’s highly recommended that this information
     * be included.
     */
    @Recommended
    private Integer w;
    /**
     * Height of the player in pixels. This field is not required, but it’s highly recommended that this information
     * be included.
     */
    @Recommended
    private Integer h;
    /**
     * Indicates the start delay in seconds for preroll, midroll, or postroll ad placement. See Table 6.9 Video Start
     * Delay for generic placement values.
     */
    @Recommended
    private Integer startdelay;
    /**
     * Indicates whether the ad impression must be linear, non- linear or can be of any type (field not set).
     * See Table 6.6 Video Linearity for a list of the possible values and recommended bidder interpretation.
     */
    @Optional
    private Integer linearity;
    /**
     * If multiple ad impressions are offered in the same bid request, the sequence number will allow for the
     * coordinated delivery of multiple creatives. battr optional array of integers Assume all types are allowed
     * Blocked creative attributes. See Table 6.3 Creative Attributes. If blank assume all types are allowed.
     */
    @Optional
    private Integer sequence = 1;
    /**
     * Extension not allowed Maximum extended video ad duration, if extension is allowed. If blank or 0, extension
     * is not allowed. If -1, extension is allowed, and there is no time limit imposed. If greater than 0, then the
     * value represents the number of seconds of extended play supported beyond the maxduration value.
     */
    @Optional
    private Integer maxextended;
    /**
     * Any bitrate accepted Minimum bit rate in Kbps. Exchange may set this dynamically, or universally across their
     * set of publishers.
     */
    @Optional
    private Integer minbitrate;
    /**
     * Any bitrate accepted Maximum bit rate in Kbps. Exchange may set this dynamically, or universally across their
     * set of publishers.
     */
    @Optional
    private Integer maxbitrate;
    /**
     * If exchange publisher has rules preventing letter boxing of 4x3 content to play in a 16x9 window, then this
     * should be set to false. Default setting is true, which assumes that boxing of content to fit into a window is
     * allowed. “1” indicates boxing is allowed. “0” indicates it is not allowed.
     */
    @Optional
    private Integer boxingallowed = 1;
    /**
     * All List of allowed playback methods. If blank, assume that all are allowed. See Table 6.8 Video Playback
     * Methods for a list of possible values.
     */
    @Optional
    private List<Integer> playbackmethod;
    /**
     * All List of supported delivery methods (streaming, progressive). If blank, assume all are supported.
     * See Table 6.12 Content Delivery Methods for a list of possible values.
     */
    @Optional
    private List<Integer> delivery;
    /**
     * Unknown Ad Position (see table 6.5)
     */
    @Optional
    private Integer pos;
    /**
     * Not available If companion ads are available, they can be listed as an array of banner objects.
     * See Banner Object.
     */
    @Optional
    private List<Object> companionad;
    /**
     * Assume None List of supported API frameworks for this impression. (See Table 6.4 API Frameworks).
     * If an API is not explicitly listed it is assumed not to be supported.
     */
    @Optional
    private List<Integer> api;
    /**
     * Recommended if companion objects are included. See Table 6.17 VAST Companion Types for a list of possible
     * values.
     */
    @Optional
    private List<Integer> companiontype;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
