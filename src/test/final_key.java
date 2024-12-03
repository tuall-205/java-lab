package test;

import java.awt.*;
import java.util.Scanner;

public class final_key {

    public static void main(String[] args) {
        final Point p = new Point();
        p.x = 10;
        System.out.println(p);
        System.out.println(Math.PI);
        String name1 = "Alex";
        String name2 = "Alex";
        String s3 = new String("hi");
        s3.intern();
        System.out.println(s3);
        Scanner sc = new Scanner(System.in);
        sc.hasNext();

    }
}
