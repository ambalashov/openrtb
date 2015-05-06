package rtb.core.v22;

import rtb.core.Optional;

/**
 * <p>The data and segment objects together allow data about the user to be passed to bidders in the
 * bid request. Segment objects convey specific units of information from the provider identified
 * in the parent data object.</p>
 * <p>The segment object itself and all of its parameters are optional, so default values are not
 * provided; if an optional parameter is not specified, it should be considered unknown.</p>
 */
public class Segment {
    /**
     * ID of a data provider’s segment applicable to the user
     */
    @Optional
    private String id;
    /**
     * Name of a data provider’s segment applicable to the user
     */
    @Optional
    private String name;
    /**
     * String representing the value of the segment. The method for transmitting this data should be negotiated offline
     * with the data provider. For example for gender, “male”, or “female”, for age, “30-40”)
     */
    @Optional
    private String value;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
