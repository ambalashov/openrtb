package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Required;

import java.util.List;

/**
 * <p>For each bid, the “nurl” attribute contains the win notice URL. If the bidder wins the impression,
 * the exchange calls this notice URL a) to inform the bidder of the win and b) to convey certain
 * information using substitution macros (see Section 4.6 Substitution Macros).</p>
 * <p>The “adomain” attribute can be used to check advertiser block list compliance. The “iurl”
 * attribute can provide a link to an image that is representative of the campaign’s content
 * (irrespective of whether the campaign may have multiple creatives). This enables human review
 * for spotting inappropriate content. The “cid” attribute can be used to block ads that were
 * previously identified as inappropriate; essentially a safety net beyond the block lists. The “crid”
 * attribute can be helpful in reporting creative issues back to bidders. Finally, the “attr” array
 * indicates the creative attributes that describe the ad to be served.</p>
 */
public class Bid extends BaseRtbObject {
    /**
     * ID for the bid object chosen by the bidder for tracking and debugging purposes. Useful when multiple bids are
     * submitted for a single impression for a given seat.
     */
    @Required
    private String id;
    /**
     * ID of the impression object to which this bid applies.
     */
    @Required
    private String impid;
    /**
     * Bid price in CPM. WARNING/Best Practice Note: Although this value is a float, OpenRTB strongly suggests using
     * integer math for accounting to avoid rounding errors.
     */
    @Required
    private float price;
    /**
     * ID that references the ad to be served if the bid wins.
     */
    @Optional
    private String adid;
    /**
     * Win notice URL. Note that ad markup is also typically, but not necessarily, returned via this URL.
     */
    @Optional
    private String nurl;
    /**
     * Actual ad markup. XHTML if a response to a banner object, or VAST XML if a response to a video object.
     */
    @Optional
    private String adm;
    /**
     * Advertiser’s primary or top-level domain for advertiser checking. This can be a list of domains if there is a
     * rotating creative. However, exchanges may mandate that only one landing domain is allowed.
     */
    @Optional
    private List<String> adomain;
    /**
     * Sample image URL (without cache busting) for content checking
     */
    @Optional
    private String iurl;
    /**
     * Campaign ID or similar that appears within the ad markup
     */
    @Optional
    private String cid;
    /**
     * Creative ID for reporting content issues or defects. This could also be used as a reference to a creative ID
     * that is posted with an exchange.
     */
    @Optional
    private String crid;
    /**
     * Array of creative attributes. See Table 6.3 Creative Attributes. dealid optional string A unique identifier
     * for the direct deal associated with the bid. If the bid is associated and in response to a dealid in the request
     * object it is required in the response object.
     */
    @Optional
    private List<Integer> attr;
    /**
     * Width of the ad in pixels. If the bid request contained the wmax/hmax and wmin/hmin optional fields it
     * is recommended that the response bid contains this field to signal the size of ad chosen.
     */
    @Optional
    private Integer h;
    /**
     * Height of the ad in pixels. If the bid request contained the wmax/hmax and wmin/hmin optional fields it
     * is recommended that the response bid contains this field to signal the size of ad chosen.
     */
    @Optional
    private Integer w;

}
