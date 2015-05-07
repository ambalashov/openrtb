package rtb.core.v22;

import rtb.core.Optional;

/**
 * Contain common functionality for all rtb objects
 */
public class BaseRtbObject {
    /**
     * This object is a placeholder that may contain custom JSON agreed to by the parties in an OpenRTB transaction to
     * support flexibility beyond the standard defined in this specification.
     */
    @Optional
    private Object ext;

    public Object getExt() {
        return ext;
    }

    public void setExt(Object ext) {
        this.ext = ext;
    }
}
