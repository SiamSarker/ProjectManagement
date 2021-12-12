package LinkedList;

import java.util.LinkedList;

public class StudentListDemo {
    public static void main(String[] args) {
        LinkedList<Student> list = new LinkedList<Student>();

        Student s1 = new Student(101, "Siam", "Eleven");
        Student s2 = new Student(102, "Rahim", "Eleven");
        Student s3 = new Student(103, "Karim", "Eleven");
        Student s4 = new Student(104, "Jamal", "Eleven");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        for (Student s : list){
            System.out.println(s.id+" "+s.name+" "+s.className+" ");
        }


    }
}
