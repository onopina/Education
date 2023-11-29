package annotations_reflection.annotations.annotations_4;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
    int value() default 0;
    int year() default 0;
    String month() default "";
    int day() default 0;
}
