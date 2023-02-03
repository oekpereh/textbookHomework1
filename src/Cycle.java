/**
 * @Class: Cycle
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This class is computing the total number of tricycles at the shop.
 * In this program, I will declare variables: number of wheels, total bicycle,
 * bicycle wheels, wheels bicycle, total tricycle
 */

import java.util.Scanner;
public class Cycle {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter total number of wheels: ");
        int numb_of_wheels = input.nextInt();
        int total_bicycle = 10; //total number of bicycles
        int bicycle_wheels = 2;
        int tricycle_wheels = 3;
        int tricycle =(numb_of_wheels - (bicycle_wheels * total_bicycle)) / tricycle_wheels;
        System.out.println("Total number of tricycles at the shop is "+tricycle);
    }
}

