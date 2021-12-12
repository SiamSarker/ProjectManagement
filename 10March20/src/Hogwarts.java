
public class Hogwarts{

    public static void main(String[] args) {
        House Slytherin=new House(100, "Snape");
        Slytherin.updateStudentCount(50);
        Slytherin.printinfo();
    }
}
class House{

    int studentCount;
    String headTeacher;

    public House(int studentCount, String headTeacher) {
        this.studentCount = studentCount;
        this.headTeacher = headTeacher;
    }

    void updateStudentCount(int newlyAdmittedStudents){
        studentCount+=newlyAdmittedStudents;
    }

    void printinfo(){
        System.out.println("Total student are "+studentCount);
        System.out.println("Headteacher of  Slytherin is "+headTeacher);
    }

}