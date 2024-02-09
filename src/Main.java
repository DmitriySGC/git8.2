package Lesson8;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку I like Java!!! ");
        String str = in.nextLine();
        int k = 0;
        System.out.println (str.contains("Java"));
        k++;
        System.out.println (str.startsWith("I like"));
        k++;
        System.out.println (str.endsWith("!!!"));
        k++;
        if (k==3){
            System.out.println (str.toUpperCase());
        }
        String str1 = str.replace("a","o");
        System.out.println (str1.substring(7,11));


    }
}