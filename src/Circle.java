/**
 * @Class: Circle
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This program will display the area and perimeter of a circle that has radius of 9.5.
 * In this program, I will declare variables: area, perimeter
 */

public class Circle {
    public static void main(String[] args) {
        double area = 9.5 * 9.5 * Math.PI;
        double perimeter = 2 * 9.5 * Math.PI;
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}
