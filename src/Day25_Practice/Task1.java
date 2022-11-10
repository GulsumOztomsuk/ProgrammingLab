package Day25_Practice;

import java.util.Arrays;

public class Task1 {
   //1. create a method that can merge two integer arrays.
    public static void merge(int[] arr1, int[] arr2){
        arr1=new int[arr1.length];
        arr2=new int[arr2.length];
        int[] arrsum=new int[arr1.length+arr2.length];
        System.out.println(Arrays.toString(arrsum));
    }
    //2. create a method that can merge two double arrays.
    public static double[] merge(double[] arr1, double[] arr2) {
        arr1 = new double[arr1.length];
        arr2 = new double[arr2.length];
        double[] arrsum = new double[arr1.length + arr2.length];
        return arrsum;
    }
    //3. create a method that can merge two char arrays.
    public static char[] merge(char[] arr1, char[] arr2) {
        arr1 = new char[arr1.length];
        arr2 = new char[arr2.length];
        char[] arrsum = new char[arr1.length + arr2.length];
        return arrsum;
    }
    //4. create a method that can merge two String arrays.
    public static String[] merge(String[] arr1, String[] arr2) {
        arr1 = new String[arr1.length];
        arr2 = new String[arr2.length];
        String[] arrsum = new String[arr1.length + arr2.length];
        return arrsum;
    }
}
