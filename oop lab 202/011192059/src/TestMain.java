/*
Complete the following code as per the given instructions in the comments so that your code does not have any error left. Look at the output at the end of this file. You have to generate the output after your code is complete. You cannot modify/remove/add any line in the main method.
*/

import c1.Food;
import c1.c2.Appetizer;
import c1.c3.Dessert;

//class TestMain in package c1 inside src folder
public class TestMain {


    public static void main(String[] args) {
        //class Food in package c1
        //class Food has two data members named name(String) and price(double)
        Food f1 = new Appetizer("Thai Soup");
        //class Appetizer inside package c2 in package c1
        Food f2 = new Dessert("CheeseCake");
        //class dessert inside package c3 in package c1
        Food f3= new Appetizer("Wontons", 6);
        Food f4 = new Dessert("Ice Cream", 150.0);
        f1.eat();
        f1.getPrice();
        f2.eat();
        f2.getPrice();
        f3.eat();
        f3.getPrice();
        f4.eat();
        f4.getPrice();
        Food f5= new Food();
        f5.eat();
        f5.getPrice();
        /*
        Class Appetizer has a method named void getQuantity() which prints the following for f3:
               We ordered 6 number of Wontons
        Here, 6 is the is the value of the instance variable named quantity(int) and Wontons is the name.
        Now, you have to print this by calling the method for f3. You can add a line here for this part.

         */
        f3.getQuantity(6);
        
    }
}


/*
Output:

We started our meal by eating Thai Soup
We ate CheeseCake at the end of our meal.
The CheeseCake cost 0.0 taka
We started our meal by eating Wontons
We ate Ice Cream at the end of our meal.
The Ice Cream cost 150.0 taka
 */

