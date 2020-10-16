public class MyClass3 {
    public static void main(String[] args) {
        int [] arr = new int[100];

        for(int i = 0, j = 1; i < arr.length; i++, j+=2) {
            arr[i] = j;
        }
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        int sum = 0;
        for(int i = 0; i < 3; i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }
}