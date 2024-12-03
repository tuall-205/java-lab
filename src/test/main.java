package test;

public class main extends Cat{

    public static void main(String[] args) {
        Cat cat = new Cat(30, "Roise");
        System.out.println(cat);
        Cat cat2 = new Cat(30, "Roise");

        System.out.println(cat == cat2);
        System.out.println(cat.equals(cat2));
    }
}
