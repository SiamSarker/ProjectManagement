import java.io.*;
import java.util.ArrayList;
import java.util.Random;

class FileReadUsingThread implements Runnable{
    String filename;

    public FileReadUsingThread(String filename) {
        this.filename = filename;
    }

    public void run(){
        try {
            BufferedReader rd = new BufferedReader(new FileReader(filename));
            double sum = 0;
            for (int j = 0; j < 1000000; j++) {
                sum += Double.parseDouble(rd.readLine());
            }
            System.out.println(filename + " " + sum);
            rd.close();
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception{
        ArrayList<Thread> threads = new ArrayList<>();
        for(int i= 0; i < 10; i++){
            String filename = "Files/" + i + ".txt";
            Thread t = new Thread(new FileReadUsingThread(filename));
            threads.add(t);
        }
        long t1 = System.currentTimeMillis();
        for(Thread t: threads){
            t.start();
        }

        for(Thread t: threads){
            t.join();
        }

        long t2 = System.currentTimeMillis();
        long totalTime = t2 - t1;
        System.out.println("Total time: " + totalTime);
    }
}


//class SingleThreadSumCalc{
//    public static void main(String[] args) throws IOException {
//        long t1 = System.currentTimeMillis();
//        for(int i = 0; i < 10; i++) {
//            String filename = "Files/" + i + ".txt";
//            BufferedReader rd = new BufferedReader(new FileReader(filename));
//            double sum = 0;
//            for(int j = 0; j < 1000000; j++){
//                sum += Double.parseDouble(rd.readLine());
//            }
//            System.out.println(filename + " " + sum);
//            rd.close();
//        }
//        long t2 = System.currentTimeMillis();
//        long totalTime = t2 - t1;
//        System.out.println("Total time: " + totalTime);
//    }
//}

//class CreateFiles{
//    public static void main(String[] args) throws IOException {
//        for(int i = 0; i < 10; i++) {
//            String filename = "Files/" + i + ".txt";
//            BufferedWriter wr = new BufferedWriter(new FileWriter(filename));
//                for(int j = 0; j < 1000000; j++){
//                    wr.write(new Random().nextDouble() + "\n");
//                }
//            wr.close();
//        }
//    }
//}


//class Test implements Runnable{
//    public void run(){
//        for (int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }
//}
//
//public class ThreadTest {
//    public static void main(String[] args) {
//        Thread t1 = new Thread(new Test(), "Thread 1");
//        Thread t2 = new Thread(new Test(), "Thread 2");
//        Thread t3 = new Thread(new Test(), "Thread 3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//
//        // Create 10 thread objects using a loop and run them
//    }
//}

// class Test extends Thread{
//    Test(String name){
//        super(name);
//    }
//
//    public void run(){
//        for (int i = 0; i < 10; i++){
//            System.out.println(Thread.currentThread().getName() + " " + i);
//        }
//    }
//}
//
//public class ThreadTest {
//    public static void main(String[] args) {
//        Test t1 = new Test("Thread 1");
//        Test t2 = new Test("Thread 2");
//        Test t3 = new Test("Thread 3");
//
//        t1.start();
//        t2.start();
//        t3.start();
//    }
//}