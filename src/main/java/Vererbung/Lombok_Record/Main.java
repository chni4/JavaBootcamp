package Vererbung.Lombok_Record;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("kuan ermann")
                .age(3)
                .id("123")
                .build();


        student = student.withName("Kuan Kuan");

        Course course = Course.builder()
                .name("Informatik")
                .code("INF101")
                .build();

        Teacher teacher = new Teacher("Herr Kuan", "Informatik");
        teacher = teacher.withName("Frau Luthy");

        System.out.println("Student: " + student);
        System.out.println("Kurs: " + course);
        System.out.println("Lehrer: " + teacher);
    }
}