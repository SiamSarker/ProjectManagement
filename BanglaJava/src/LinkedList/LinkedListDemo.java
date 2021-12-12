package LinkedList;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> countryNames = new LinkedList<String>();

        countryNames.add("Bangladesh");
        countryNames.add("India");
        countryNames.add("Pakistan");
        countryNames.add("Nepal");
        countryNames.add("Afganistan");
        countryNames.add(3,"Brazil");
        countryNames.addFirst("Australia");
        countryNames.addLast("Japan");
       // countryNames.remove("Japan");
//        countryNames.remove(7);
//          countryNames.removeFirst();
//          countryNames.removeLast();

        System.out.println("First element : "+countryNames.getFirst());
        System.out.println("Last element : "+countryNames.getLast());

//        countryNames.clear();
        for (String country : countryNames){
            System.out.println(country);
        }

        System.out.println(countryNames.size());

    }
}
