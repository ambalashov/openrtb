package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

import java.util.List;

/**
 * The publisher object itself and all of its parameters are optional, so default values are not
 * provided. If an optional parameter is not specified, it should be considered unknown.
 */
public class Publisher {
    /**
     * Publisher ID on the exchange.
     */
    @Recommended
    private String id;
    /**
     * Publisher name (may be masked at publisher’s request).
     */
    @Optional
    private String name;
    /**
     * Array of IAB content categories for the publisher. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> cat;
    /**
     * Publisher’s highest level domain name, for example “foopub.com”.
     */
    @Optional
    private String domain;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB
     * transaction to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
