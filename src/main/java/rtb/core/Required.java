package rtb.core;

import java.lang.annotation.*;

/**
 * Created by abal on 5/4/15.
 */

@Documented
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.FIELD)
public @interface Required {
    String value() default "";
}
