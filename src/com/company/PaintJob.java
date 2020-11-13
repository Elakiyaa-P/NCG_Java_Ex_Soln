package com.company;

public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, double extraBuckets){
        if(width<1 || height<1 || areaPerBucket<1 || extraBuckets<0){
            return -1;
        }
        return (int)extraBuckets - (int) Math.ceil((width*height)/areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if(width<1 || height<1 || areaPerBucket<1){
            return -1;
        }
        return (int) Math.ceil((width*height)/areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if(area<1 || areaPerBucket<1){
            return -1;
        }
        return (int) Math.ceil((area)/areaPerBucket);
    }

    public static void main(String[] args) {

    }
}
