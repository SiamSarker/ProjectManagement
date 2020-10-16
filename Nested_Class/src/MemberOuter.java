public class MemberOuter {
    private int data = 40;
    void func(){
        MemberInner newObj = new MemberInner();
        System.out.println(newObj.x);
        newObj.msg();
    }

    class  MemberInner {

        int x = 50;

        void msg(){
            System.out.println("data is "+data);
        }
    }

}
