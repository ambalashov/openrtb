package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

import java.util.List;

/**
 * <p>The “user” object contains information known or derived about the human user of the device.</p>
 * <p>Note that the user ID is an exchange artifact (refer to the “device” object for hardware or
 * platform derived IDs) and may be subject to rotation policies. However, this user ID must be
 * stable long enough to serve reasonably as the basis for frequency capping.</p>
 * <p>The user object itself and all of its parameters are optional, so default values are not provided.
 * If an optional parameter is not specified, it should be considered unknown.
 * If device ID is used as a proxy for unique user ID, use the device object.</p>
 */
public class User {

    /**
     * Unique consumer ID of this user on the  exchange.
     */
    @Recommended
    private String id;

    /**
     * Buyer’s user ID  for this user as mapped by  exchange for the buyer.
     */
    @Recommended
    private String buyeruid;

    /**
     * Year of birth as a 4 - digit integer.
     */
    @Optional
    private Integer yob;

    /**
     * Gender as “M” male, “F” female, “O” Other. (Null indicates unknown).
     */
    @Optional
    private String gender;

    /**
     * Comma separated list of keywords of consumer interests or intent.
     * ALTERNATE Representation: Array of strings.
     */
    @Optional
    private String keywords;

    /**
     * If supported by the exchange, this is custom data that the bidder had stored in the exchange’s cookie.
     * The string may be in base85 cookie safe characters, and be in any format. This may useful for storing
     * user features. Note: Proper JSON encoding must be used to include “escaped” quotation marks.
     */
    @Optional
    private String customdata;

    /**
     * Home geo for the user (e.g., based off of registration data); this is different from the current
     * location of the access device (that is defined by the geo object embedded in the Device Object);
     * see Geo Object.Error! Reference source not found.
     */
    @Optional
    private Geo geo;

    /**
     * See Data Object.
     */
    @Optional
    private List<Data> data;

    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
