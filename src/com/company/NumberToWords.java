package com.company;

public class NumberToWords {
    public static int reverse(int number){
        int rev=0;
        int mod;
        boolean flag=false;
        if(number<0){
            flag=true;
            number*=-1;
        }
        int temp=number;
        while(number>0){
            mod=number%10;
            rev=rev*10+mod;
            number/=10;
        }
        if(flag){
            rev*=-1;
        }
        return rev;
    }
    public static int getDigitCount(int num){
        if(num<0){
            return -1;
        }
        if(num==0){
            return 1;
        }
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static void numberToWords(int num){
        if(num<0){
            System.out.println("Invalid Value");
            return;
        }
        int temp=reverse(num);
        for(int i=0;i<getDigitCount(num);i++){
            int mod=temp%10;
            temp/=10;
            switch(mod){
                case 0:
                    System.out.print("Zero ");
                    break;
                case 1:
                    System.out.print("One ");
                    break;
                case 2:
                    System.out.print("Two ");
                    break;
                case 3:
                    System.out.print("Three ");
                    break;
                case 4:
                    System.out.print("Four ");
                    break;
                case 5:
                    System.out.print("Five ");
                    break;
                case 6:
                    System.out.print("Six ");
                    break;
                case 7:
                    System.out.print("Seven ");
                    break;
                case 8:
                    System.out.print("Eight ");
                    break;
                case 9:
                    System.out.print("Nine ");
                    break;
            }
        }

    }
}
