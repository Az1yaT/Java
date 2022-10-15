package HomeWork_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);
        System.out.println("Введите число N:");
        int input = n.nextInt();
        int tn = (input*(input+1)/2);
        System.out.println(tn);
    }
}