public class Test1 {
    public static void main(String[] args) throws Exception {

        A obj = new A();
        obj.start();   //  t1

        for (int i = 0; i < 10; i++){
            System.out.println(2);
            Thread.sleep(500);
        }
    }
}

class A extends Thread{

    public void run(){
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
