package Day25_Practice;

import java.util.Arrays;

public class Task3 {
    //1.create a method that can return the min number from an integerarray
    public static int min(int[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }
    //2.create a method that can return the min number from a double array
    public static double min(double[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }
    //3.create a method that can return the min number from a long array
    public static long min(long[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }
    //4.create a method that can return the min number from a short array
    public static short min(short[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }
    //5.create a method that can return the min number from a float array
    public static float min(float[] num) {
        Arrays.sort(num);
        return num[num.length - 1];
    }
    //6.create a method that can return the min number from a byte array
    public static byte min(byte[] num){
        Arrays.sort(num);
        return num[num.length-1];
    }
}
