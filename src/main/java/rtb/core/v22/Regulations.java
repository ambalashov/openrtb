package rtb.core.v22;

import rtb.core.Optional;

/**
 * <p>The “regs” object contains any legal, governmental, or industry regulations that apply to the
 * request.</p>
 * <p>The first regulation added signal whether or not the request falls under the United States
 * Federal Trade Commission’s regulations for the United States Children’s Online Privacy
 * Protection Act (“COPPA”). See the COPPA appendix for details.</p>
 * <p>The regs object itself and all of its parameters are optional, so default values are not provided.
 * If an optional parameter is not specified, it should be considered unknown.</p>
 */
public class Regulations {
    /**
     * Flag indicating whether or not this request falls under the COPPA regulations established by the USA FTC,
     * where 0 = no, 1 = yes.
     */
    @Optional
    private Integer coppa;
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction
     * to support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;
}
