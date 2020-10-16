public class MyClass2 {
    public static void main(String[] args) {
        int [] arr = {2, 4, 7, 1, 4, 6, 3, 2};

        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}