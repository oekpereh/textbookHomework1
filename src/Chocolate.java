/**
 * @Class: Chocolate
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This program will compute the number of chocolate bags needed to add
 * three chocolates instead of two chocolates
 * In this program, I will declare variables: total bags, each Choc bag,
 * size, number of bags
 */

public class Chocolate {
    public static void main(String[] args) {
        int total_bags = 9; //total bags
        int each_choc_bag = 2; //chocolate in each bag
        int size = 3; //size of bag
        int numberOfbags = total_bags * each_choc_bag/size;
        System.out.println("You need "+numberOfbags + " bags to add three chocolate bars to each bag.");
    }
}
