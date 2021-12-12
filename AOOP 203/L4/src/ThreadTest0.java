import java.util.Random;

class Resource{

    synchronized public void fnc()
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

class Test extends Thread{
    Resource resource;

    public Test(Resource resource){
        this.resource = resource;
    }

    public void run()
    {
        resource.fnc();
    }
}


public class ThreadTest0 {
    public static void main(String[] args) {

        Resource resource = new Resource();
        Thread t1 = new Thread(new Test(resource),"Thread 1");
        Thread t2 = new Thread(new Test(resource),"Thread 2");
        Thread t3 = new Thread(new Test(resource),"Thread 3");

        t1.start();
        t2.start();
        t3.start();

        try {
            t1.join();
            t2.join();
            t3.join();
        }catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("Main thread ends.");
    }


}
