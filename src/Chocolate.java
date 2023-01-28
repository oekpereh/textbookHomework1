/**
 * @Class: Chocolate
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 27, 2023
 *
 * This class is computing the number of chocolate bags
 */

public class Chocolate {
    public static void main(String[] args) {
        int bags = 9;
        int choco_2 = 2;
        int choco_3 = 3;
        int number_bags = bags * choco_2/choco_3;
        System.out.println("You need "+number_bags + " bags to add three chocolate bars to each bag.");
    }
}
