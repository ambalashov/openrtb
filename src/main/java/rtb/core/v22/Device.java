package rtb.core.v22;

import rtb.core.Optional;
import rtb.core.Recommended;

/**
 * The “device” object provides information pertaining to the device including its hardware,
 * platform, location, and carrier. This device can refer to a mobile handset, a desktop computer,
 * set top box or other digital device.
 * The device object itself and all of its parameters are optional, so default values are not provided.
 * If an optional parameter is not specified, it should be considered unknown.
 * In general, the most essential fields are either the IP address (to enable geo-lookup for the
 * bidder), or providing geo information directly in the geo object.
 */
public class Device {
    /**
     * If “0”, then do not track Is set to false, if “1”, then do no track is set to true in browser.
     */
    @Recommended
    private Integer dnt;
    /**
     * Browser user agent string.
     */
    @Recommended
    private String ua;
    /**
     * if geo object is not supplied string IPv4 address closest to device.
     */
    @Recommended
    private String ip;
    /**
     * if IP is not supplied object Geography as derived from the device’s location services (e.g., cell tower
     * triangulation, GPS) or IP address. See Geo ObjectError! Reference source not found..
     */
    @Recommended
    private Geo geo;
    /**
     * SHA1 hashed device ID; IMEI when available, else MEID or ESN. OpenRTB’s preferred method for device ID hashing is SHA1.
     */
    @Optional
    private String didsha1;
    /**
     * MD5 hashed device ID; IMEI when available, else MEID or ESN. Should be interpreted as case insensitive.
     */
    @Optional
    private String didmd5;
    /**
     * SHA1 hashed platform-specific ID (e.g., Android ID or UDID for iOS). OpenRTB’s preferred method for device ID hash is SHA1.
     */
    @Optional
    private String dpidsha1;
    /**
     * MD5 hashed platform-specific ID (e.g., Android ID or UDID for iOS). Should be interpreted as case insensitive.
     */
    @Optional
    private String dpidmd5;
    /**
     * SHA1 hashed MAC address of the device. macmd5 optional string MD5 hashed MAC address of the device.
     */
    @Optional
    private String macsha1;
    /**
     * IP address in IPv6. carrier optional string Carrier or ISP derived from the IP address. Should be specified using
     * Mobile Network Code (MNC) http://en.wikipedia.org/wiki/Mobile_Network_ Code
     */
    @Optional
    private String ipv6;
    /**
     * Browser language; use alpha-2/ISO 639-1 codes.
     */
    @Optional
    private String language;
    /**
     * Device make (e.g., “Apple”).
     */
    @Optional
    private String make;
    /**
     * Device model (e.g., “iPhone”).
     */
    @Optional
    private String model;
    /**
     * Device operating system (e.g., “iOS”).
     */
    @Optional
    private String os;
    /**
     * Device operating system version (e.g., “3.1.2”).
     */
    @Optional
    private String osv;
    /**
     * “1” if the device supports JavaScript; else “0”.
     */
    @Optional
    private Integer js;
    /**
     * Return the detected data connection type for the device. See Table 6.10 Connection Type.
     */
    @Optional
    private Integer connectiontype;
    /**
     * Return the device type being used. See Table 6.16 Device Type.
     */
    @Optional
    private Integer devicetype;
    /**
     * Return the Flash version detected.
     */
    @Optional
    private String flashver;
    /**
     * Native identifier for advertisers; an opaque ID assigned by the device or browser for use as an advertising
     * identifier. (e.g. Apple's IFA, Android's Advertising ID, etc)
     */
    @Optional
    private String ifa;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
