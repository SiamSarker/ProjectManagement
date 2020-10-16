package HashMap;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {

        HashSet <String> fruitsName = new HashSet<String>();

        fruitsName.add("Apple");
        fruitsName.add("Orange");
        fruitsName.add("Banana");
        fruitsName.add("Strwberry");


        System.out.println(fruitsName.size());

        fruitsName.remove("Apple");

        System.out.println(fruitsName);
        fruitsName.clear();

        boolean s = fruitsName.isEmpty();
        System.out.println(s);
    }
}
