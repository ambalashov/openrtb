package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;
import rtb.core.Required;

import java.util.List;

/**
 * The “imp” object describes the ad position or impression being auctioned. A single bid request can include multiple
 * “imp” objects, a use case for which might be an exchange that supports selling all ad positions on a given page as a
 * bundle. Each “imp” object has a required ID so that bids can reference them individually. An exchange can also
 * conduct private auctions by restricting involvement to specific subsets of seats within bidders.
 */
public class Impression {

    /**
     * A unique identifier for this impression within the context of the bid request (typically, value starts with 1,
     * and increments up to n for n
     */
    @Required
    private String id;

    /**
     * A reference to a banner object. Either a banner or video object (or both if the impression could be either) must
     * be included in an impression object.
     * @see Banner Object.
     */
    @Required("for banner impressions")
    private Banner banner;

    /**
     * A reference to a video object. Either a banner or video object (or both if the impression could be either) must
     * be included in an impression object.
     * @see Video Object.
     */
    @Required("for video impressions")
    private Video video;

    /**
     * Name of ad mediation partner, SDK technology, or native player responsible for rendering ad (typically video or
     * mobile). Used by some ad servers to customize ad code by partner.
     */
    @Recommended("for video and native apps")
    private String displaymanager;

    /**
     * Version of ad mediation partner, SDK technology, or native player responsible for rendering ad (typically video
     * or mobile). Used by some ad servers to customize ad code by partner
     */
    @Recommended("for video and native apps")
    private String displaymanagerver;

    /**
     * 1 if the ad is interstitial or full screen; else 0 (i.e., no).
     */
    @Optional
    private Integer instl;

    /**
     * Identifier for specific ad placement or ad tag that was used to initiate the auction. This can be useful for
     * debugging of any issues, or for optimization by the buyer.
     */
    @Optional
    private String tagid;

    /**
     * Bid floor for this impression (in CPM of bidfloorcur).
     */
    @Optional
    private Float bidfloor = 0f;

    /**
     * If bid floor is specified and multiple currencies supported per bid request, then currency should be specified
     * here using ISO-4217 alphabetic codes. Note, this may be different from bid currency returned by bidder, if this
     * is allowed on an exchange.
     */
    @Optional
    private String bidfloorcur = "USD";

    /**
     * Flag to indicate whether the impression requires secure HTTPS URL creative assets and markup. A value of “1”
     * means that the impression requires secure assets. A value of "0" means non-secure assets. If this field is
     * omitted the bidder should interpret the secure state is unknown and assume HTTP is supported.
     */
    @Optional
    private Integer secure;

    /**
     * Array of names for supported iframe busters. Exchange specific.
     */
    @Optional
    private List<String> iframebuster;

    /**
     * A reference to the PMP object containing any Deals eligible for the impression object.
     * See the PMP Object definition.
     */
    @Optional
    private Pmp pmp;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
