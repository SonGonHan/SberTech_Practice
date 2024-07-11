package annotations;


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(TaskAnnotations.class)
public @interface TaskAnnotation {
    int hours() default 0;
    int priority() default 0;
    String description() default "none description";
}
