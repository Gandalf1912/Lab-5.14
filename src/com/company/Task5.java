package com.company;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args){
        String arr[] = new String[2];
        for(int i = 0; i < 2; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ведіть рядок: ");
            arr[i] = sc.nextLine();
        }
        if(arr[0].length() > arr[1].length()){
            System.out.println("Перший рядок (" + arr[0] + ") - більший");
        }
        else if(arr[0].length() == arr[1].length()){
            System.out.println("Перший рядок (" + arr[0] + ") = Другому рядку (" + arr[1] + ") ");
        }
        else{
            System.out.println("Другий рядок (" + arr[1] + ") - більший");
        }
    }
}
