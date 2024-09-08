package Polymorphism;

public class Numbers {
    double sum(double a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Numbers obj1 = new Numbers();

        System.out.println(obj1.sum(2, 4)); // parameters are double ,but we are passing integers & it is not giving an
                                            // error because double is bigger than integer ,so we can pass. if the
                                            // parameters are integer and if we pass double it will show an error (in
                                            // this case we have to type cast it)

        obj1.sum(2, 34, 4);

        // obj1.sum(2,3,4,5); //it gives us error because we don't have a method that
        // contains 4 parameters it checks this at compile time only(actual memory
        // allocation is happened at run time but the checking(syntax checking) and
        // which method to actually run determination for that happens at compile time)
        // that's why it is known as compile time polymorphism

    }
}
