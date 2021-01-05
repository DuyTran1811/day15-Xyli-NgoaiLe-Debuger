package BT1;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap A");
        double a = input.nextDouble();
        System.out.println("Nhap B");
        double b = input.nextDouble();
        System.out.println("Nhap C");
        double c = input.nextDouble();
        try {
            Triangle a1 = new Triangle(a,b,c);
        } catch (IllegalTriangleException e) {
            System.out.println(e);
        }
    }
}
