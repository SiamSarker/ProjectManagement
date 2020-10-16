public class Outer {
    int i;
    void n(){

    }

    class Inner{
        void m(){
            i = 4;
            n();
        }
    }

    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.i = 1;
        Outer.Inner a = obj.new Inner();
        a.m();
    }
}
