import java.io.*;
import java.nio.Buffer;

public class Student {
    String name;
    int id;
    double cgpa;

    public Student(String name, int id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        try {
            Student [] student = new Student[30];

            FileReader fr = new FileReader("StudentData.txt");
            BufferedReader bufferedReader = new BufferedReader(fr);
            FileWriter fw = new FileWriter("newStudentData.txt");
            FileWriter cg = new FileWriter("HighestLowest.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            BufferedWriter wrcg = new BufferedWriter(cg);


            int i = 0;
            double maxcg = 0;
            double mincg = 10;
            int indexMax = 0;
            int indexMin = 0;

            String line;
            while ((line = bufferedReader.readLine()) != null) {

                String[] splits = line.split(" ");

                student[i] = new Student(splits[0], Integer.parseInt(splits[1]), Double.parseDouble(splits[2]));

                 if (student[i].cgpa > maxcg) {
                     maxcg = student[i].cgpa;
                     indexMax = i;
                 }
                 if (student[i].cgpa < mincg) {
                     mincg = student[i].cgpa;
                     indexMin = i;
                 }

                 writer.write(student[i].name + " ");
                 writer.write(student[i].id + " ");
                 writer.write(student[i].cgpa + " ");
                 writer.newLine();

                 i++;
             }
            System.out.println("new documentation write on 'newStudentData.txt'");

            wrcg.write("Highest CGPA holder:");
            wrcg.newLine();
            wrcg.write(student[indexMax].name + " ");
            wrcg.write(student[indexMax].id + " ");
            wrcg.write(student[indexMax].cgpa + " ");
            wrcg.newLine();
            wrcg.write("Lowest CGPA holder:");
            wrcg.newLine();
            wrcg.write(student[indexMin].name + " ");
            wrcg.write(student[indexMin].id + " ");
            wrcg.write(student[indexMin].cgpa + " ");
            wrcg.newLine();

            System.out.println("new documentation written on 'HighestLowest.txt'");


            writer.close();
            wrcg.close();
        }
        catch (Exception e){

        }
    }
}
