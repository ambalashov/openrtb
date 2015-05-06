package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;
import rtb.core.Required;

import java.util.List;

/**
 * The top-level bid request object contains a globally unique bid request or auction ID. This “id” attribute is
 * required as is at least one “imp” (i.e., impression) object. Other attributes are optional since an exchange may
 * establish default values.
 */
public class BidRequest {

    /**
     * Unique ID of the bid request, provided by the exchange.
     */
    @Required
    private String id;

    /**
     * Array of impression objects. Multiple impression auctions may be specified in a single bid request. At least one
     * impression is required for a valid bid request.
     */
    @Required
    private List<Impression> imp;

    /**
     * See Site Object
     */
    @Recommended("for websites")
    private Site site;

    /**
     * See App Object
     */
    @Recommended("for native apps")
    private App app;

    /**
     * See Device Object
     */
    @Recommended
    private Device device;

    /**
     * @see User
     */
    @Recommended
    private User user;

    /**
     * Auction Type. If “1”, then first price auction. If “2”, then second price auction. Additional auction types can
     * be defined as per the exchange’s business rules. Exchange specific rules should be numbered over 500.
     */
    @Optional
    private Integer at = 2;

    /**
     * Maximum amount of time in milliseconds to submit a bid (e.g., 120 means the bidder has 120ms to submit a bid
     * before the auction is complete). If this value never changes across an exchange, then the exchange can supply
     * this information offline.
     */
    @Optional
    private Integer tmax;

    /**
     * Array of buyer seats allowed to bid on this auction. Seats are an optional feature of exchange. For example,
     * [“4”,”34”,”82”,”A45”] indicates that only advertisers using these exchange seats are allowed to bid on the
     * impressions in this auction.
     */
    @Optional
    private List<String> wseat;

    /**
     * Flag to indicate whether Exchange can verify that all impressions offered represent all of the impressions
     * available in context (e.g., all impressions available on the web page; all impressions available for a video
     * [pre, mid and postroll spots], etc.) to support road-blocking. A true value should only be passed if the
     * exchange is aware of all impressions in context for the publisher. “0” means the exchange cannot verify,
     * and “1” means that all impressions represent all impressions available.
     */
    @Optional
    private Integer allimps = 0;

    /**
     * Array of allowed currencies for bids on this bid request using ISO-4217 alphabetic codes. If only one currency
     * is used by the exchange, this parameter is not required.
     */
    @Optional
    private List<String> cur;

    /**
     * Blocked Advertiser Categories. Note that there is no existing categorization / taxonomy of advertiser industries.
     * However, as a substitute exchanges may decide to use IAB categories as an approximation
     * (See Table 6.1 Content Categories)
     */
    @Optional
    private List<String> bcat;

    /**
     * Array of strings of blocked top- level domains of advertisers. For example, {“company1.com”, “company2.com”}.
     */
    @Optional
    private List<String> badv;

    /**
     * This object is a container for any legal, governmental or industry regulations in force for the request.
     */
    @Optional
    private Regulations regs;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;
}
