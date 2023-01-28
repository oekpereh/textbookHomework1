/**
 * @Class: Cycle
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 27, 2023
 *
 * This class is computing the total number of tricycle
 */

public class Cycle {
    public static void main(String[] args) {
        int bicycle = 10;
        int bicycle_wheels = 2;
        int tricycle_wheels = 3;
        int numb_wheels = 47;
        int tricycle =( numb_wheels - (bicycle_wheels * bicycle)) / tricycle_wheels;
        System.out.println("Total number of tricycles at the shop is "+tricycle);
    }
}

