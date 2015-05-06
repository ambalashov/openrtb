package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

import java.util.List;

/**
 * A site object should be included if the ad supported content is part of a website (as opposed to an application).
 * A bid request must not contain both a site object and an app object.
 */
public class Site {

    /**
     * Site ID on the exchange. name optional string Site name (may be masked at publisher’s request).
     */
    @Recommended
    private String id;
    /**
     * Domain of the site, used for advertiser side blocking. For example, “foo.com”.
     */
    @Optional
    private String domain;
    /**
     * Array of IAB content categories for the overall site. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> cat;
    /**
     * Array of IAB content categories for the current subsection of the site. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> sectioncat;
    /**
     * Array of IAB content categories for the current page. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> pagecat;
    /**
     * URL of the page where the impression will be shown.
     */
    @Recommended
    private String page;
    /**
     * Specifies whether the site has a privacy policy. “1” means there is a policy. “0” means there is not.
     */
    @Optional
    private Integer privacypolicy;
    /**
     * Referrer URL that caused navigation to the current page.
     */
    @Optional
    private String ref;
    /**
     * Search string that caused navigation to the current page.
     */
    @Optional
    private String search;
    /**
     * @see Publisher Object
     */
    @Optional
    private Publisher publisher;
    /**
     * @see Content Object
     */
    @Optional
    private Content content;
    /**
     * List of keywords describing this site in a comma separated string. ALTERNATE Representation: Array of strings.
     */
    @Optional
    private String keywords;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined
     */
    @Optional
    private Object ext;

}
