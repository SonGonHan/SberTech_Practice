package classes;

import annotations.TaskAnnotation;
import lombok.*;

@Setter
@Getter
public class FirstChild extends Parent {

    public FirstChild(DataConteiner dc){
        super(dc);
    }

    @TaskAnnotation(hours = 1, priority = 2, description = "ИЗМЕНЯЕМ ИМЯ")
    public void setName (){
        info.setName("Вова");
    }

    @TaskAnnotation(hours = 2, priority = 1, description = "ИЗМЕНЯЕМ ВОЗРАСТ")
    public void setAge (){
        info.setAge(3);
    }

}
