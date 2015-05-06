package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

import java.util.List;

/**
 * An “app” object should be included if the ad supported content is part of a mobile application (as opposed to a
 * mobile website). A bid request must not contain both an “app” object and a “site” object.
 */
public class App {
    /**
     * Application ID on the exchange.
     */
    @Recommended
    private String id;
    /**
     * Application name (may be masked at publisher’s request).
     */
    @Optional
    private String name;
    /**
     * Domain of the application (e.g., “mygame.foo.com”).
     */
    @Optional
    private String domain;
    /**
     * Array of IAB content categories for the overall application. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> cat;
    /**
     * Array of IAB content categories for the current subsection of the app. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> sectioncat;
    /**
     * Array of IAB content categories for the current page/view of the app. See Table 6.1 Content Categories.
     */
    @Optional
    private List<String> pagecat;
    /**
     * Application version.
     */
    @Optional
    private String ver;
    /**
     * Application bundle or package name (e.g., com.foo.mygame). This is intended to be a unique ID across multiple exchanges.
     */
    @Recommended
    private String bundle;
    /**
     * Specifies whether the app has a privacy policy. “1” means there is a policy and “0” means there is not.
     */
    @Optional
    private Integer privacypolicy;
    /**
     * “1” if the application is a paid version; else “0” (i.e., free).
     */
    @Optional
    private Integer paid;
    /**
     * @see Publisher
     */
    @Optional
    private Publisher publisher;
    /**
     * @see Content
     */
    @Optional
    private Content content;
    /**
     * List of keywords describing this app in a comma separated string. ALTERNATE Representation: Array of strings.
     */
    @Optional
    private String keywords;
    /**
     * For QAG 1.5 compliance, an app store URL for an installed app should be passed in the bid request.
     */
    @Optional
    private String storeurl;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to support flexibility beyond the standard defined in the specification.
     */
    @Optional
    private Object ext;

}
