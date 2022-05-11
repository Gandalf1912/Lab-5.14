package com.company;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        String w[] = new String[5];
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Введіть слово: ");
            w[i] = sc.nextLine();
        }
        System.out.println(w[0].concat(" " + w[1]).concat(" " + w[2]).concat(" " + w[3]).concat(" " + w[4]));
    }
}
