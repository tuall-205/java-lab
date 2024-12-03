package test;

public class Person {

    public static int count;

    static {
        System.out.println("Start: static initialization");
//        count++;
        System.out.println("End: static initialization");
    }

    private String firstName;
    private String lastName;
    private String gender;
    private Cat[] cat;

    {
        System.out.println("instance constructor");
        count++;
    }

    public Person () {
        System.out.println("default constructor");

    }

    public Person(String firstName, String lastName, String gender, Cat[] cat) {
        System.out.println("hello");
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cat = cat;
    }
}
