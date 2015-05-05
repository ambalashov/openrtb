package rtb;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import rtb.mopub.Device;

import java.io.IOException;
import java.net.URL;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * Created by abal on 5/4/15.
 */
public class ParserTest {

    private ObjectMapper objectMapper;
    private URL baseDeviceFile;
    private URL mopubDeviceFile;

    @BeforeMethod
    public void setup() {
        objectMapper = new ObjectMapper();
        baseDeviceFile = this.getClass().getResource("/base_device.json");
        mopubDeviceFile = this.getClass().getResource("/mopub_device.json");
    }

    @Test
    public void testBaseDevice() throws IOException {
        rtb.core.v22.Device device = objectMapper.readValue(baseDeviceFile, rtb.core.v22.Device.class);
        assertThat(device.getId(), is("test_id"));
        assertThat(device.getExt(), is("test_ext"));
    }

    @Test
    public void testMopubDevice() throws IOException {
        Device device = objectMapper.readValue(mopubDeviceFile, Device.class);
        assertThat(device.getId(), is("test_id"));
        assertThat(device.getExt().getIdfa(), is("idfa"));
    }
}
