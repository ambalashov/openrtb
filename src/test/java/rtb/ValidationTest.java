package rtb;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import rtb.mopub.Device;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

/**
 * Created by abal on 5/4/15.
 */
public class ValidationTest {

    private Validator validator;

    @BeforeClass
    public void setup() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    @Test
    public void testNull() {
        Device device = new Device();
        Set<ConstraintViolation<Device>> constraintViolations = validator.validate(device);
        assertThat(constraintViolations, hasSize(1));
    }

}
