class C implements ABC{
    String s = "new";

    @Override
    public void method1(int a) {
        System.out.println(a);

    }

    public void greeter() {
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        ABC c;
        c = new C();
        System.out.println(c.s);
        c.greeter();
        c.method1(5);
    }
}