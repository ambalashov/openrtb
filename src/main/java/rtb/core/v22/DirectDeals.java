package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Required;

import java.util.List;

/**
 * A “deal” object constitutes a deal struck a priori between a buyer and a seller and indicates that this impression
 * is available under the terms of that deal.
 */
public class DirectDeals {
    /**
     * A unique identifier for the direct deal.
     */
    @Required
    private String id;
    /**
     * Bid floor for this impression (in CPM of bidfloorcur).
     */
    @Optional
    private Float bidfloor;
    /**
     * USD If bid floor is specified and multiple currencies supported per bid request, then currency should be
     * specified here using ISO- 4217 alphabetic codes. Note, this may be different from bid currency returned by bidder,
     * if this is allowed on an exchange.
     */
    @Optional
    private String bidfloorcur;
    /**
     * Array of buyer seats allowed to bid on this Direct Deal. Seats are an optional feature of an exchange.
     * For example, [“4”,”34”,”82”,”45”] indicates that only advertisers using these exchange seats are allowed
     * to bid on this direct deal.
     */
    @Optional
    private List<String> wseat;
    /**
     * Array of advertiser domains allowed to bid on this Direct Deal. For example, [“advertiser1.com”,”advertiser2.com”]
     * indicates that only the listed advertisers are allowed to bid on this direct deal.
     */
    @Optional
    private List<String> wadomain;
    /**
     * Auction type. If “1”, then first price auction. If “2”, then second price auction. If “3”, the passed bidfloor
     * indicates the apriori agreed upon deal price. Additional auction types can be defined as per the exchange’s business rules.
     */
    @Optional
    private Integer at;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
