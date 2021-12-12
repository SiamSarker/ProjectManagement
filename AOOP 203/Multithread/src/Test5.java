public class Test5 {
    public static void main(String[] args) {

        System.out.println("Main Thread Started");
        A5 t1 = new A5();

        t1.setDaemon(true);

        t1.start();

         //

        System.out.println(t1.isAlive());

        try {
//            t1.join();        //    wating for t1 to finish
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(t1.x);

        System.out.println("Main Thread ended and x = "+t1.x);

    }
}


class A5 extends Thread {
    int x;

    public void run(){
        for( int i = 0; i < 100000000; i++){
            x++;
        }
        System.out.println("My Thread ended and x = "+x);
    }

}