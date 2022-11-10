package Day25_Practice;

import java.util.Arrays;

public class Task2 {
    // 1. create a method that can return the max number from an integer array
    public static int max(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
   // 2. create a method that can return the max number from double array
    public static double max(double[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }
   //3. create a method that can return the max number from long array
   public static long max(long[] arr) {
       Arrays.sort(arr);
       return arr[arr.length - 1];
   }
   //4. create a method that can return the max number from short array
    public static short max(short[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    //5. create a method that can return the max number from float array
    public static float max(float[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
    //6. create a method that can return the max number from byte array
    public static byte max(byte[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1];
    }
}

