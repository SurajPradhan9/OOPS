package StaticExample;

public class Human {
    int age; 
    String name;
    int salary;
    boolean married;
    static long population;

    public static void message() {
        System.out.println("Hello World");
        // System.out.println(this.age); // can't use this over here i.e from static we
        // cannot use non-static stuff because this refers to an object
    }

    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;
    }
}
