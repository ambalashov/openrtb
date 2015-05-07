package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Required;

import java.util.List;

/**
 * <p>The top-level bid response object is defined below. The “id” attribute is a reflection of the bid
 * request ID for logging purposes. Similarly, “bidid” is an optional response tracking ID for
 * bidders. If specified, it can be included in the subsequent win notice call if the bidder wins. At
 * least one “seatbid” object is required, which contains a bid on at least one impression. Other
 * attributes are optional since an exchange may establish default values.</p>
 * <p>No-Bids on all impressions should be indicated as a HTTP 204 response. For no-bids on specific
 * impressions, the bidder should omit these from the bid response.</p>
 */
public class BidResponse extends BaseRtbObject {

    /**
     * ID of the bid request.
     */
    @Required
    private String Id;
    /**
     * Array of seatbid objects.
     */
    @Required
    private List<SeatBid> seatbid;
    /**
     * Bid response ID to assist tracking for bidders. This value is chosen by the bidder for cross-reference.
     */
    @Optional
    private String bidid;
    /**
     * Bid currency using ISO-4217 alphabetic codes; default is “USD”.
     */
    @Optional
    private String cur = "USD";
    /**
     * This is an optional feature, which allows a bidder to set data in the exchange’s cookie. The string may be in
     * base85 cookie safe characters, and be in any format. This may be useful for storing user features.
     * Note: Proper JSON encoding must be used to include “escaped” quotation marks.
     */
    @Optional
    private String customdata;
    /**
     * Reason for not bidding. See Table 6.19 No-Bid Reason Codes.
     */
    @Optional
    private Integer nbr;

}
