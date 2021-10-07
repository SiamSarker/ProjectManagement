import java.util.Random;

class Test1 implements Runnable {

    public void run()
    {
        for(int i = 0; i < 10; i++)
        {
            System.out.println(Thread.currentThread().getName()+" "+i);
            try {
                Thread.sleep(new Random().nextInt(1000));
            }
            catch (InterruptedException e)
            {
                e.printStackTrace();
            }
        }
    }
}


public class ThreadTest1 {
    public static void main(String[] args) {

        Thread t[] = new Thread[20];
        for (int i = 0; i <= 10; i++)
        {
            t[i] = new Thread(new Test1(), "Thread "+i);
        }

        for (int i = 0; i <= 10; i++)
            t[i].start();
//
//        Thread t1 = new Thread(new Test1(), "Thread 1");
//        Thread t2 = new Thread(new Test1(), "Thread 2");
//        Thread t3 = new Thread(new Test1(), "Thread 3");
//
//        t1.start();
//        t2.start();
//        t3.start();
    }


}
