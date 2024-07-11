package classes;

import annotations.TaskAnnotation;
import lombok.NonNull;

public class FirstChild extends Parent {

    @TaskAnnotation(hours = 1, priority = 2, description = "ПОЛУЧАЕМ ИМЯ")
    public String getName (@NonNull DataConteiner dc){
        return dc.getName();
    }

    @TaskAnnotation(hours = 2, priority = 1, description = "ПОЛУЧАЕМ ВОЗРАСТ")
    public Integer getAge (@NonNull DataConteiner dc){
        return dc.getAge();
    }

}
