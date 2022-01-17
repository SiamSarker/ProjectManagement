/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mehra
 */
public class StringLecture {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String a = "  Helloll   ";
        String b = "hello";
        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.concat(b));
        char c;
        System.out.println("I won\'t do it");
        System.out.println("This class is so \"good\"!");
        c = a.charAt(4);
        
        System.out.println(a.endsWith("ll"));
        
        if(a.equalsIgnoreCase(b)){
            System.out.println("Equal");
        }
        else{
            System.out.println("Not equal!");
        }
        
        System.out.println(a.indexOf("ll"));
        
        String d = a.replace("ll", "mm");
        System.out.println(d);
        
        String e = a.trim();
        System.out.println(e);
        
        String f = "    ";
        System.out.println(f.trim().isEmpty());
        
        String g = "John, 3.67, 011234567";
        String[] arr = new String[3];
        arr = g.split(", ");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }  
    }  
}
