package rtb.mopub;

/**
 * Created by abal on 5/4/15.
 */
public class Device extends rtb.core.v22.Device {
    private Ext ext;

    @Override
    public Ext getExt() {
        return ext;
    }

    public void setExt(Ext ext) {
        this.ext = ext;
    }

    public class Ext {
        private String idfa;

        public String getIdfa() {
            return idfa;
        }

        public void setIdfa(String idfa) {
            this.idfa = idfa;
        }
    }
}
