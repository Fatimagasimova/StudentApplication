package az.ingress.studentapplication.entity;

import lombok.Data;

@Data
public class Student {

    private long id;
    private String name;
    private String surname;
    private String pin;
}
