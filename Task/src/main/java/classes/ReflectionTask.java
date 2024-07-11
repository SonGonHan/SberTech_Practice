package classes;

import annotations.MyAnnotation;
import annotations.TaskAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.List;
import java.util.stream.Stream;

public class ReflectionTask {

    public static Parent makeClass(Calendar date, String name, Integer age) {
        DataConteiner dc = new DataConteiner(name, age);
        Annotation[] annotations = FirstChild.class.getAnnotations();
        for (Annotation annotation : annotations) {
            if (annotation instanceof MyAnnotation) {
                int birthday = ((MyAnnotation) annotation).birthday();
                if (date.get(Calendar.DAY_OF_WEEK) == birthday) {
                    return new FirstChild(dc);
                }
            }
        }
        return new SecondChild(dc);
    }

    public static void callMethods(Parent child) throws InvocationTargetException, IllegalAccessException {
        List<Method> methods = Stream.of(child.getClass().getMethods()).toList();
        int priority = 1;
        while (priority < 5 && !methods.isEmpty()) {
            int i = 0;
            while (i < methods.size()) {
                Annotation[] annotations = methods.get(i).getAnnotations();
                for (Annotation annotation : annotations) {
                    if (annotation instanceof TaskAnnotation) {
                        if (((TaskAnnotation) annotation).priority() == priority) {
                            methods.get(i).setAccessible(true);
                            methods.get(i).invoke(child);
                            checkDC(child.getInfo());
                            break;
                        }
                    }
                }
                ++i;
            }
            ++priority;
        }
    }

    public static void checkDC(DataConteiner dc) throws IllegalAccessException {
        System.out.println("Check changes:");
        Field[] fields = dc.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(field.getName() + ": " + field.get(dc).toString());
        }
    }
}
