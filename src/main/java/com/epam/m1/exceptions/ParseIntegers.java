package com.epam.m1.exceptions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * Complete the code, parse integers, calculate the sum of numbers in the WORDS, join strings with
 * space delimiter
 */
public class ParseIntegers {

    static List<String> WORDS =

            Arrays.asList(
                    "JDK 17 has released on 14 September 2021 with 10 new features, 2 feature removals and 2 feature deprecations."
                            .split(" "));


    public static void main(String[] args) {

        Iterator<String> words = WORDS.iterator();

        int sum = 0;
        String justWords = " ";
        while (words.hasNext()) {
            String next = words.next();
            int number = Integer.parseInt(next);
            try {
                    justWords+=next;
            }catch (NumberFormatException e){
                sum+=number;

            }
            System.out.println(justWords);
            System.out.println(sum);


        }

        //System.out.println("Sum is " + sum);
        //System.out.println("Just words:" + justWords);
    }
}

