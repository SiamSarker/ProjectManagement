/**
 * MyClass
 */
public class MyClass {

    public static void main(String[] args) {

        int[] arr1 = new int[1000];
        int l = 1;
        int sum1 = 0;
        for(int j = 0; j<1000; j++)
        {
            arr1[j] = l;
            sum1+= l;
            l += 2;
        }

        System.out.println("Sum1 is "+sum1);

    }
}