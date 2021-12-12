public class Test4 {
    public static void main(String[] args) {
        A4 t1 = new A4();
        t1.start();

        try {
            t1.join();        //    wating for t1 to finish
        }catch (Exception e)
        {
            e.printStackTrace();
        }

        System.out.println(t1.x);
    }
}


class A4 extends Thread {
    int x;

    public void run(){
        for( int i = 0; i < 10000000; i++){
            x++;
        }
    }

}