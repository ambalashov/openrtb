package rtb.core.v22;

import rtb.core.Optional;

import java.util.List;

/**
 * <p>The data and segment objects together allow data about the user to be passed to bidders in the
 * bid request. This data may be from multiple sources (e.g., the exchange itself, third party
 * providers) as specified by the data object ID field. A bid request can mix data objects from
 * multiple providers.</p>
 * <p>The data object itself and all of its parameters are optional, so default values are not provided.
 * If an optional parameter is not specified, it should be considered unknown.</p>
 */
public class Data {

    /**
     * Exchange specific ID for the data provider.
     */
    @Optional
    private String id;
    /**
     * Data provider name.
     */
    @Optional
    private String name;
    /**
     * Array of segment objects.
     */
    @Optional
    private List<Segment> segment;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

}
