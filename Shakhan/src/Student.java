class Student {
    private String name, id;
    private double cgpa;

    public Student() {

    }

    public Student(String id, String name, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    private static void swap(Student s1, Student s2) {
        Student temp = new Student();

        temp.name = s1.name;
        s1.name = s2.name;
        s2.name = temp.name;

        temp.id = s1.id;
        s1.id = s2.id;
        s2.id = temp.id;

        temp.cgpa = s1.cgpa;
        s1.cgpa = s2.cgpa;
        s2.cgpa = temp.cgpa;

    }

    public static void main(String[] args){
        Student s1 = new Student("011162101", "Kratos", 3.0);
        Student s2 = new Student("011162102", "Thanos", 4.0);
        System.out.println("Before swap");
        System.out.println(s1);
        System.out.println(s2);
        swap(s1,s2);
        System.out.println("After swap");
        System.out.println(s1.name);
        System.out.println(s2.name);
    }
}