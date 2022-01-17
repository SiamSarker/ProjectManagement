/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author mehra
 */
public class ArrayListLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        ArrayList<Integer> myArrList = new ArrayList<Integer>();
//        myArrList.add(10);
//        myArrList.add(7);
//        myArrList.add(2);
//        myArrList.add(16);
//        System.out.println(myArrList.size());
//        myArrList.get(0);
//
//        Collections.sort(myArrList);
//        Collections.reverse(myArrList);
//
//         for(int i = 0; i < myArrList.size(); i++){
//            System.out.println(myArrList.get(i));
//        }*/
        
//        ArrayList<String> myStrList = new ArrayList<String>();
//        myStrList.add("Hello");
//        myStrList.add("World");
//        myStrList.add("Java");
//
//        Collections.sort(myStrList);
//        Collections.reverse(myStrList);
//
//        myStrList.set(1, "Python");
//
//        myStrList.remove(1);
//
//        for(int i = 0; i < myStrList.size(); i++){
//            System.out.println(myStrList.get(i));
//        }
        
        ArrayList<Person> myList = new ArrayList<Person>();
        Person a = new Person("Zohn", 23);
        myList.add(a);
        myList.add(new Person("Jack", 34));
        myList.add(new Person("Mary", 24));
     
        
        Collections.sort(myList, new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                return (int) o1.name.compareTo(o2.name);
            }     
        }
        );
        
         for(int i = 0; i < myList.size(); i++){
            String nm = myList.get(i).name;
            double age = myList.get(i).age;
            System.out.println("Name: " + nm + ", " + "Age: " + age + ".");
        }
    }
    
}
