package classes;

import annotations.MyAnnotation;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Calendar;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@MyAnnotation(birthday = Calendar.SUNDAY)
public class Parent {
    protected DataConteiner info;
}
