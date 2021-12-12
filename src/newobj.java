public class newobj {
    public static void main(String[] args) {
        int[][] arr = {{1,2},{3,4,5},{6,7,8,9},{10}};

        for(int[] row : arr)
        {
            for ( int n : row)
            {
                System.out.print(n+" ");
            }
            System.out.println();
        }

    }
}
