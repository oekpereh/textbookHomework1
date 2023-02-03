/**
 * @Class: MaleStudent
 * @author: Olufunmilayo Ekpereh
 * version 1.0
 * Course: ITEC 2140 Spring 2023
 * Written: February 2, 2023
 *
 * This program will compute the number of male students in this middle school.
 * In this program, I will declare variables: total student, female student, male student
 */


public class MaleStudent {
    public static void main(String[] args) {
        int total_student = 389;
        int female_student = 175;
        int male_student = total_student - female_student;
        System.out.println(+male_student + " male students are in the middle school.");
    }
}
