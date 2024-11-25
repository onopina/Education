package presentation.annotations_reflection;

import java.lang.annotation.Repeatable;

@Repeatable(Annos.class)
public @interface Anno {
    String value();
}
