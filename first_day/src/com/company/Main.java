package com.company;

public class Main {

    public static void main(String[] args) {
        calcEquation(1, 3, 2);
    }
    //Find the real roots of quadratic equation of the form of ax^2 + bx + c = 0 (a != 0)
    public static void calcEquation (double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant >= 0) {
            System.out.println("x1 = " + (-b + Math.sqrt(discriminant)) / (2 * a));
            System.out.println("x2 = " + (-b - Math.sqrt(discriminant)) / (2 * a));
        }
        else {
            System.out.println("There are no real roots");
        }
    }
}
