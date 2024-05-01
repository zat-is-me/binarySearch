package com.seganut.streamapi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class BinarySearch {
    static volatile boolean found;

    public static void main(String[] args) {
        int num = 11;
        List<Integer> data = new ArrayList<>();
        data.add(1);
        data.add(2);
        data.add(3);
        data.add(4);
        data.add(5);
        data.add(7);
        data.add(9);
        data.add(10);
        data.add(8);
        data.add(6);
        List<Integer> sorted = data.stream().sorted().collect(Collectors.toList());

        System.out.println(numSearch(sorted, num));
    }

    private static String numSearch(List<Integer> data, Integer desireValue) {
        int start = 0;
        int end = data.size() -1  ;

        while (start <= end){
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
