package rtb.core.v22;

import rtb.core.Optional;

import java.util.List;

/**
 * The producer is useful when content where the ad is shown is syndicated, and may appear on a
 * completely different publisher. The producer object itself and all of its parameters are optional,
 * so default values are not provided. If an optional parameter is not specified, it should be
 * considered unknown. This object is optional, but useful if the content producer is different
 * from the site publisher.
 */
public class Producer {

    /**
     * Content producer or originator ID. Useful if content is syndicated, and may be posted on a site using embed tags.
     */
    @Optional
    private String id;
    /**
     * Content producer or originator name (e.g., “Warner Bros”).
     */
    @Optional
    private String name;
    /**
     * Array of IAB content categories for the content producer. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> cat;
    /**
     * URL of the content producer.
     */
    @Optional
    private String domain;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
