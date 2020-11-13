package com.company;

public class LargestPrime {
    public static int getLargestPrime(int num){
        if(num<0){
            return -1;
        }
        int i=num;
        boolean flag;
        while(i>1){
            flag=false;
            if(num%i==0){
                for(int j=i/2;j>1;j--){
                    if(i%j==0){
                        flag=true;
                        break;
                    }
                }
                if(!flag){
                    return i;
                }
            }
            i--;
        }
        return -1;
    }
}
