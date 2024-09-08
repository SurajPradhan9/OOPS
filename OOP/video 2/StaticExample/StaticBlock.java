package StaticExample;

// this is a demo to show initialisation of static variables
public class StaticBlock {
    static int a = 4;
    static int b;

    // will only run once, when the first object is created i.e when the class is
    // loaded for the first time
    static {
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);// 4 20 // why not obj.a and obj.b because they are
                                                                // static

        StaticBlock.b += 3;
        System.out.println(StaticBlock.a + " " + StaticBlock.b);// 4 23

        StaticBlock obj2 = new StaticBlock(); // it will not go to static block because static block runs exactly ones
        System.out.println(StaticBlock.a + " " + StaticBlock.b);// 4 23 //it should be 4 20 if the static block is again
                                                                // loaded (static bock is loaded only once when the
                                                                // first object is created so it is 4 23)
    }
}
