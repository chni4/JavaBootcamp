package Vererbung.Student_Info;

import Vererbung.Lombok_Record.Student;

public class Main {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("kuan ermann")
                .id("123")
                .build();


        System.out.println("Student: " + student);
    }
}