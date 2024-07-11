package classes;

import annotations.MyAnnotation;
import annotations.TaskAnnotation;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.util.Calendar;

@Setter
@Getter
@MyAnnotation(birthday = Calendar.SATURDAY)
public class SecondChild extends Parent {

    public SecondChild(DataConteiner dc) {
        super(dc);
    }

    @TaskAnnotation(hours = 2, priority = 1, description = "ИЗМЕНЯЕМ ИМЯ И ВОЗРАСТ")
    public void setNameAndAge() {
        info.setName("Вова");
        info.setAge(3);
    }
}
