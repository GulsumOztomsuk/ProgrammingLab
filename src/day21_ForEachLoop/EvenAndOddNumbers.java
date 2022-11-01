package day21_ForEachLoop;

import java.util.Arrays;

public class EvenAndOddNumbers {
    public static void main(String[] args) {
     int[] arr={1,2,3,4,5,6,7,8,9};
     int evenCount=0;
     int oddCount=0;
     for (int each: arr){
         if (each %2==0){
             evenCount++;
         }else {
            oddCount++;
         }
     }
        System.out.println(Arrays.toString(arr)+ " has "+evenCount+" even numbers and "+ oddCount+" odd numbers.");
    }
}
/*
2. Write a program that can count the even and odd number from an array of integers
			Note: MUST use for each loop
 */