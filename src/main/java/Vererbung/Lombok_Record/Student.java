package Vererbung.Lombok_Record;

import lombok.Data;
import lombok.Builder;
import lombok.With;

@Data
@Builder
public class Student {
    @With private String name;
    @With private int age;
    private String id;
}


