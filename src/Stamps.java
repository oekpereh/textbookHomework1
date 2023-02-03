/**
 * @Class: Stamps
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This program will compute the difference between Jean's and Susan's
 * collections of stamps.
 * In this program, I will declare variables: Susan, Jean, numb of stamps.
 */

public class Stamps {
    public static void main(String[] args) {
        int Susan = 8; //total number of Susan's stamps
        int Jean = 40; //total number of Jean's stamps
        int numb_of_stamps = Jean - Susan;
        System.out.println("Jean has "+numb_of_stamps + " more stamps than Susan.");
    }
}
