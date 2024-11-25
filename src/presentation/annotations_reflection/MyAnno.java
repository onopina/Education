package presentation.annotations_reflection;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface MyAnno {
    double[] value();
    String text() default "Example";
}
