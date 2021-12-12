import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ArrayTest {
    public static void main(String[] args) {

        ArrayList<University> universities = new ArrayList<>();
        try {
            Scanner sc = new Scanner(new File("Data/A.txt"));

            while (sc.hasNext()) {
                University university = new University(sc.next(), sc.nextInt(), sc.nextInt());
                universities.add(university);
            }

            universities.sort(new Comparator<University>() {
                @Override
                public int compare(University o1, University o2) {
                    if (o1.studentsCount < o2.studentsCount) return 1;
                    else if (o1.studentsCount > o2.studentsCount) return -1;
                    return 0;
                }
            });

            FileOutputStream f = new FileOutputStream("Data/B.txt");
            ObjectOutputStream ow = new ObjectOutputStream(f);

            for (University u: universities){
                ow.writeObject(u);
            }

            ow.close();
            sc.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

    class University implements Serializable{
        String name;
        int studentsCount;
        int facultyCount;

        public University(String name, int studentsCount, int facultyCount) {
            this.name = name;
            this.studentsCount = studentsCount;
            this.facultyCount = facultyCount;
        }
    }
