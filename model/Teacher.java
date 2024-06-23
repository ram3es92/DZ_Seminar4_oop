package seminar4.model;

public class Teacher extends User {

    private String subject;

    public Teacher(int id, String name, String lastName, String subject) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    @Override
    public String toString() {
        return String.format("Teacher{id=%d, name='%s', lastName='%s'}", id, name, lastName);
    }
}