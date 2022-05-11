package com.company;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        double max = 0;
        double arr[] = new double[3];
        for(int i = 0; i < 3; i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("Ведіть дробове число, наприклад: '11,2; 1,9; 5,2' : ");
            if(sc.hasNextDouble()){
                arr[i] = sc.nextDouble();
                if(arr[i] > max){
                    max = arr[i];
                }
            }else{
                System.out.println("Ви ввели не число");
            }
        }
        System.out.println("Найбільше введене число: " + max);

    }
}
