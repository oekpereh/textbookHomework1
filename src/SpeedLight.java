/**
 * @Class: SpeedLight
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This program will calculate the distance to a lightning strike based on the time elapsed
 * between the flash and the sound of thunder
 * In this program, I will declare variables: speedOfSound, timeElapsed, distance
 */


public class SpeedLight {
    public static void main(String [] args) {
//class completed
        int SPEED_OF_SOUND = 340; //this value will never change
        int timeElapsed = 5;
        int distance = SPEED_OF_SOUND * timeElapsed;
        System.out.println("Speed of sound is: " + SPEED_OF_SOUND);
        System.out.println("Time Elapsed is: " + timeElapsed);
        System.out.println("The distance to a lightning strike is: " + distance);
    }
}
