public class Test6 {
    public static void main(String[] args) {

//        Runnable obj = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Siam");
//            }
//        };

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Siam");
            }
        });

        t.start();
        try {
            t.join();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
