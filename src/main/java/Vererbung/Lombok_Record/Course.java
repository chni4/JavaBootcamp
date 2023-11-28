package Vererbung.Lombok_Record;


import lombok.Builder;
import lombok.Value;
import lombok.With;

@Value
@Builder
class Course {
    @With String name;
    String code;
}




