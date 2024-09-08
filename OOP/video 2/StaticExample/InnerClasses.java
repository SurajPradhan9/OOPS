package StaticExample;

public class InnerClasses {
    static class Test {
        String name;

        Test(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Test obj1 = new Test("Suraj");
        Test obj2 = new Test("Virat");

        System.out.println(obj1.name);
        System.out.println(obj2.name);

    }
}

// we cannot keep outer class has static
// static class A{
//
// }
