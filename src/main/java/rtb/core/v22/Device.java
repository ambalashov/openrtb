package rtb.core.v22;

import javax.validation.constraints.NotNull;

/**
 * Created by abal on 5/4/15.
 */
public class Device {
    @NotNull
    private String id;
    private Object ext;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getExt() {
        return ext;
    }

    public void setExt(String ext) {
        this.ext = ext;
    }

    @Override
    public String toString() {
        return "BaseDevice{" +
                "id='" + id + '\'' +
                ", ext='" + ext + '\'' +
                '}';
    }
}
