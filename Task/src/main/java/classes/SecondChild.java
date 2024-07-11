package classes;

import annotations.MyAnnotation;
import annotations.TaskAnnotation;
import lombok.NonNull;

@MyAnnotation(what = "ВЕСЬ В МАТЬ")
public class SecondChild extends Parent{
    @TaskAnnotation(hours = 1, priority = 2, description = "ПОЛУЧАЕМ ИМЯ")
    @TaskAnnotation(hours = 2, priority = 1, description = "ПОЛУЧАЕМ ВОЗРАСТ")
    public String getNameAndAge (@NonNull DataConteiner dc){
        return dc.getName() + " " + dc.getAge();
    }
}
