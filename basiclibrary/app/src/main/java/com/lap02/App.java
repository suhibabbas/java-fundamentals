/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.lap02;

import org.checkerframework.checker.units.qual.min;

import javax.xml.crypto.Data;
import java.util.*;

public class App {

    public static void main(String[] args) {


//
        int[] arr = {2,4,6,3,0,3};
        int n = 5;

//        int[] x =  roll(0);
//        if(x.length == 0){
//            System.out.println("there are no rolls");
//        }else {
//            for (int vla:x ){
//                System.out.println(vla);
//            }
//        }
//        System.out.println(containsDuplicates(arr));
//        System.out.println(calculatingAverages(x));
//        int[][] arr = {
//                {66, 64, 58, 65, 71, 57, 60},
//                {57, 65, 65, 70, 72, 65, 51},
//                {55, 54, 60, 53, 59, 57, 61},
//                {65, 56, 55, 52, 55, 62, 57}
//        };
////
//        System.out.println(arraysAverages(arr));
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Hedge");

        Set<Integer> resutlt = analyzingWeatherData(weeklyMonthTemperatures);
        for (int val:resutlt
             ) {
            System.out.println("Never saw temperature: "+val);
        }

        System.out.println(tally(votes) + " received the most votes!");

    }



    public static int[]  roll(int n) {

        Random rn = new Random();
        int[] array = new int[n];

        for (int index = 0; index < n; index++) {
            int dice = rn.nextInt(6) + 1;
            array[index] = dice;

        }
        return array;
    }

    public static boolean containsDuplicates(int[] array){
        int count =0;
         Arrays.sort(array);

         for(int index = 1; index < array.length;index++){
             if(array[index - 1] == array[index]){
                 count++;
             }
         }
//

        return count > 0;
    }

    public static int calculatingAverages(int[] array){
        int average;
        int sum =0;
        for (int val:array
             ) {
            sum +=val;
        }
        average = sum/array.length;
        return average;
    }

    public static int[] arraysAverages(int[][] arrays){

        int[] averages = new int[arrays.length];
        int count = 0;
        int count2 =0;

        for (int[] arr :arrays
             ) {
            for (int val:arr
                 ) {
                count += val;
            }
            averages[count2] = count/arr.length;
            count2++;
            count =0;
        }

        int i = 0;

        for(int index = 1; index<averages.length;index++){
            if(averages[index - 1] < averages[index]){
                i = index - 1;
            }else {
                i = index;
            }
        }

        int[] result = arrays[i];

       return result;
    }

    public static Set<Integer> analyzingWeatherData(int[][] weeklyMonthTemperatures){

        int max = weeklyMonthTemperatures[0][0];
        int min = weeklyMonthTemperatures[0][0];

        for (int[] array:weeklyMonthTemperatures
        ) {
            for (int val:array
            ) {
                if(max <val){
                    max = val;
                }
                if(min > val){
                    min = val;
                }
            }
        }

        Set<Integer> notFound =new HashSet<>();
        int count =0;

        for(int i = min ; i <=max; i++){
            for (int[] array:weeklyMonthTemperatures
            ) {
                for (int val:array
                ) {
                    if(i == val){
                        count++;
                    }
                }
            }
            if(count == 0){
                notFound.add(i);
            }
            count= 0;
        }


        System.out.println("High:"+max );
        System.out.println("Low:"+ min );

//        for (int val:notFound
//             ) {
//            return  "Never saw temperature: "+val;
//        }


        return notFound;
    }

    public static String tally(List<String> votes){

        String winner ="" ;
        String check;
        int max = 0;
        int count =0;

        for (String vote:votes
             ) {
            check = vote;
            for (String val:votes
                 ) {
                if(check == val){
                    count++;
                }
            }
            if(max <count){
                max =count;
                winner =check;
            }
            count =0;
        }

        return winner;
    }
}
