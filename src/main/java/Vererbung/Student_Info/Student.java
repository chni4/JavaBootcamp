package Vererbung.Student_Info;


import lombok.Data;
import lombok.Builder;
import lombok.With;

@Data
@Builder
class Student {
    @With private String name;
    private String id;
}