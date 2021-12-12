public class ExceptionDemo {

    public static void main(String[] args) {

        try {
            int[] a = new int[4];
            a[4] = 10;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception : "+e);
        }
        catch (Exception e){
            System.out.println("Exception : "+e);
        }

        finally {
            System.out.println("Last line of the programme");
        }


    }
}
