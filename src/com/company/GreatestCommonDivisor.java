package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second){
        if(first<10 || second<10){
            return -1;
        }
        int i=first>second ? first/2 : second/2;
        while(i>1){
            if(first%i==0 && second%i==0){
                break;
            }
            i--;
        }
        return i;
    }}
