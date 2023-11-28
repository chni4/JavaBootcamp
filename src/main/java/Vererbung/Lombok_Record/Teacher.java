package Vererbung.Lombok_Record;

record Teacher(String name, String subject) {
    public Teacher withName(String newName) {
        return new Teacher(newName, this.subject);
    }

    public Teacher withSubject(String newSubject) {
        return new Teacher(this.name, newSubject);
    }
}


