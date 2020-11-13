package com.company;

public class DiagonalStar {
    public static void printSquareStar(int num){
        if(num<5){
            System.out.println("Invalid Value");
            return;
        }
        int left=2;
        int right=num-1;
        for(int i=1;i<=num;i++){
            if(i==1 || i==num){
                for(int k=0;k<num;k++){
                    System.out.print("*");
                }
                System.out.println();
                continue;
            }
            System.out.print("*");
            for(int j=2;j<num;j++){
                System.out.print(j==left || j==right ? "*" : " ");
            }
            System.out.print("*\n");
            left++;
            right--;
        }
    }
}
