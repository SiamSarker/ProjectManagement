public class Test3 {
    public static void main(String[] args) {
        myThread3 obj = new myThread3();

        Thread t3 = new Thread(obj, "My Thread 3");    //  t1 object runs in this thread, pass the name
        t3.start();   //  thread

        System.out.println(t3.getName());
        // Thread t3_1 = Thread.currentThread();   //  main thread
        System.out.println("Inside the main method: "+Thread.currentThread().getName());

    }
}


class myThread3 extends A3 implements Runnable{
    public void run() {
        System.out.println("Inside the myThread3 method: "+Thread.currentThread().getName());
        for (int i = 0; i < 10; i++){
            System.out.println(1);
            try {
                Thread.sleep(500);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

class A3{

}