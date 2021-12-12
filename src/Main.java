class Student {
    public String name;
    public int id; Student(String name,int id){
        this.name = name;
        this.id = id; }
    public Student getStudent(Student s1){ s1 = new Student("Rahim",101); return s1;
    } }
public class Main{
    public static void main(String[] args) {

    Student s1 = new Student("Karim",102);
        System.out.println("Name : " + s1.name + " ID : " + s1.id);
        Student s2 = s1.getStudent(s1);
        Student s3 = s2;
        System.out.println("Name : " + s3.name + " ID : " + s3.id);

        }

}