package com.company;

import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner=new Scanner(System.in);
        int sum=0;
        int count=0;
        int num;
        while(true){
            if(scanner.hasNextInt()){
                num=scanner.nextInt();
                sum+=num;
                count++;
            } else {
                System.out.printf("SUM = %d AVG = %d", sum, count > 0 ? Math.round((double) sum / count) : 0);
                return;
            }
        }
    }
}
