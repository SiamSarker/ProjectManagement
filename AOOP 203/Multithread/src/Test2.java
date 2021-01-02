public class Test2 {
    public static void main(String[] args) {
        myThread t1 = new myThread();

        Thread t2 = new Thread(t1);    //  t1 object runs in this thread
        t2.start();   //  thread
    }
}


class myThread extends A2 implements Runnable{
    public void run() {
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

class A2{

}