package AccessModifier;

import AccessModifier.pkg.TestPkg;

public class Main {
    public static void main(String[] args) {
        Test testObj = new Test();
        TestPkg testPkgObj = new TestPkg();

        testObj.v1 = 20;
        testObj.v3 = 20;
        testObj.fnc1();    // Private, Can not access outside class

        testPkgObj.v2 = 30;
        testPkgObj.v4 = 30; // Default, Can not access outside package
        testPkgObj.fnc2();  // Private, Can not access outside class

    }
}
