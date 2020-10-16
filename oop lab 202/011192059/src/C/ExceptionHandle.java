package C;

public class ExceptionHandle {
    public static void f() throws ArithmeticException{
        throw new ArithmeticException("Unhandled exception");
    }

    public static void main(String[] args) {
        int[] arr = new int[10];
        try {
            f();
        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        try {
            //risky code
            arr[8] = 4;
            System.out.println("Inside try");
            try {
                int x = 5 / 0;
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Inside inner catch");
            }
        }catch(ArithmeticException e){
            System.out.println("Inside outer catch");
        }
        catch(ArrayIndexOutOfBoundsException e){
            //exception handling code
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("Inside catch 1");
        }finally {
            System.out.println("Inside Finally");
        }
        System.out.println("End");

        int temp =3;
        try{
            if(temp<5) throw new Exception("New exception thrown");
            System.out.println("New try");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }


    }
}
