package com.company;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        String arr[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ведіть ім'я: ");
            arr[i] = sc.nextLine();
        }
        if(arr[0].equalsIgnoreCase(arr[1])){
            System.out.println("Імена ідентичні");
        }else{
            System.out.println("Імена не ідентичні");
        }
    }
}
