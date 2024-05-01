package com.seganut.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch {
    public static void main(String[] args) {
        int desireValue = 0;
        int [] arr = {1,2,16,4,18,6,7,8,10,9,11,12,13,14,15,13,17,5,19,20};
        List<Integer> data = Arrays
                .stream(arr)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

//        How much time it take to find the desire number
        Date startTime = new Date(System.currentTimeMillis());/*Start time*/
        System.out.println("\n"+(numSearch(data, desireValue)));/*Work*/
        Date endTime = new Date(System.currentTimeMillis());/*End time*/

        System.out.println("It took: "+(endTime.getTime() - startTime.getTime()));
    }

    private static String numSearch(List<Integer> data, Integer desireValue) {
        int start = 0;
        int end = data.size() -1  ;

        while (start <= end ){
            int halfPosition = (start + end)/2;
            int middleValue = data.get(halfPosition);

            if (middleValue == desireValue)
                return middleValue + " is found!";
            if (middleValue > desireValue)
               end = halfPosition -1;
            if (middleValue < desireValue)
               start = halfPosition +1 ;
        }
       return desireValue + " is not found! ";
    }
}
