package rtb.core.v22;

import rtb.core.Optional;

import java.util.List;

/**
 * The “pmp” object contains a parent object for usage within the context of private marketplaces and the use of the
 * RTB protocol to execute Direct Deals.
 */
public class Pmp {
    /**
     * An integer flag indicating that this impression is a private auction eligible only to seats named in the Direct
     * Deals object. (e.g., 1 = bids for this impression are restricted to the deals specified and the terms thereof;
     * 0 = all bids are accepted)
     */
    @Optional
    private Integer privateAuction;
    /**
     * A collection of “deal” objects encapsulating a list of direct deals eligible for this impression.
     */
    @Optional
    private List<DirectDeals> deals;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;
}
