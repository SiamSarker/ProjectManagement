public class Generics {
    public static void main(String[] args) {
        Double [] a1 = {1.5, 3.5};
        String[] a2 = {"20", "30"};
        Integer[] a3 = {100, 200};

        System.out.println(sum(a1));
        System.out.println(sum(a2));
        System.out.println(sum(a3));

    }

    public static <T> double sum(T[] arr){
        double sum = 0;
        for(T item: arr){
            sum += Double.parseDouble((String) item);
        }
        return sum;
    }
}

