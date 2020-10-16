//name, id, print->name,id,printSalary()->BODY EMPTY
//salary,printSalary->override


class Parent{ //superclass
    private int privateVariable=3;
    protected int parentVariable=4;
    public void parentMethod(){
        System.out.println("Hello from parent Method"+privateVariable);
    }
}

//subclass
class Child extends Parent{ //class subclass extends superclass
    //parentVariable,parentMethod()
    /*
    public int parentVariable=4;
    public void parentMethod(){
        System.out.println("Hello from parent Method");
    }
     */
    public int childVariable=5;
    public void childMethod(){

        System.out.println("Hello from child Method");
    }
    //method overriding->overwrite (not mandatory, its a choice)
    //return type, name, parameter list unchanged
    //only method body can be changed
    public void parentMethod(){
        System.out.println("Hello from parent Method inside child class");
    }

}

class GrandChild extends Child{
    /*
    public int parentVariable=4;
    public void parentMethod(){
        System.out.println("Hello from parent Method");
    }

    public int childVariable=5;
    public void childMethod(){
        System.out.println("Hello from child Method");
    }
     */
    public int grandVar=6;
}

public class TestInheritance {
    public static void main(String[] args) {
        Parent A = new Parent();
        A.parentMethod();
        Child B=new Child();
        B.childMethod();
        A.parentVariable= A.parentVariable+B.childVariable;
        System.out.println(A.parentVariable); //9
        B.parentMethod();
        B.parentVariable=2;
        B.parentVariable++;
        System.out.println(B.parentVariable);  //
        GrandChild C=new GrandChild();
    }
}
