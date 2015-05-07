package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Required;

import java.util.List;

/**
 * A bid response can contain multiple “seatbid” objects, each on behalf of a different bidder seat.
 * Since a bid request can include multiple impressions, each “seatbid” object can contain multiple
 * bids each pertaining to a different impression on behalf of a seat. Thus, each “bid” object must
 * include the impression ID to which it pertains as well as the bid price. The “group” attribute can
 * be used to specify if a seat is willing to accept any impressions that it can win (default) or if it is
 * only interested in winning any if it can win them all (i.e., all or nothing).
 */
public class SeatBid extends BaseRtbObject {
    /**
     * Array of bid objects; each bid object relates to an imp object in the bid request. Note that, if supported
     * by an exchange, one imp object can have many bid objects.
     */
    @Required
    private List<Bid> bid;
    /**
     * ID of the bidder seat on whose behalf this bid is made.
     */
    @Optional
    private String seat;
    /**
     * “1” means impressions must be won- lost as a group; default is “0”.
     */
    @Optional
    private Integer group;

}
