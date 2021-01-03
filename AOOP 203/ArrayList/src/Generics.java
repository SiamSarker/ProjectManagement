public class Generics {
    public static void main(String[] args) {
        Double [] a1 = {5.5, 6.6, 7.7, 8.8, 9.9};
        Integer [] a2 = {1, 2, 3, 4};
        Long [] a3 = {1L, 5000L};

        Integer i1 = 5;
        Integer i2 = 10;

        double res1 = calculateAvg(a1);
        double res2 = calculateAvg(a2);
        double res3 = calculateAvg(a3);

        System.out.println(res1+" "+res2+" "+res3);

        System.out.println(i1.compareTo(i2));
        // if i1 < i2, compareTo returns negative
        // if i1 > i2, compareTo returns positive
        // if i1 equals i2, compareTo returns 0

    }

    public static <T> void printArray(T[] arr){
        for(T item: arr) System.out.print(item + " ");
        System.out.println();
    }

    public static <T extends Comparable<T>> T max(T[] arr){
        T max = arr[0];
        for(T item: arr){
            if(max.compareTo(item) < 0) max = item;    // if max is less then item it teturns -1
        }
        return max;
    }

    public static <T> double calculateAvg(T[] arr){
        double sum = 0;
        for(T item: arr){
            sum += Double.parseDouble(item.toString());
        }
        return sum / arr.length;
    }
}





class Student<T> {
    String name;
    T id;
    double cgpa;

    public Student(String name, T id, double cgpa) {
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public static void main(String[] args) {
        Student<Integer> st1 = new Student<>("Farhan", 500, 10);
        Student<String> st2 = new Student<>("Farhan", "500", 10);
    }
}