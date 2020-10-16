public class NestedMain {
    public static void main(String[] args) {

        MemberOuter obj = new MemberOuter();
        MemberOuter.MemberInner in = obj.new MemberInner();
        in.msg();
        obj.func();
    }
}
