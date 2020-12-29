import java.io.Serializable;

public class StudentAccount implements Serializable {
    int id;
    String name;
    double marks;
    double cgpa;

    public StudentAccount(int id, String name, double marks, double cgpa) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.cgpa = cgpa;
    }
}
