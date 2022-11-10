package Day25_Practice;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] num={1,2,3};
    num= reverse(num);
        System.out.println(Arrays.toString(num));
        System.out.println("-----------------------");

        String[] nm={"Ali","alice","can"};
       nm= reverse(nm);
        System.out.println(Arrays.toString(nm));
    }
    public static int[] reverse(int[] num){
   int[] result=new int[num.length];
   int j=0;
        for (int i = num.length-1 ; i>=0  ; i-- ) {
            result[j++]=num[i];
        }
     return result;
    }
    //2. Create a method that can reverse a double array
    public static double[] reverse(double[] num){
        double[] result=new double[num.length];
        int j=0;
        for (int i = num.length-1 ; i>=0  ; i-- ) {
            result[j++]=num[i];
        }
        return result;
    }
    //3. Create a method that can reverse a char array
    public static char[] reverse(char[] num) {
        char[] result = new char[num.length];
        int j = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            result[j++] = num[i];
        }
        return result;
    }
    //4. Create a method that can reverse a String array
    public static String[] reverse(String[] num) {
        String[] result = new String[num.length];
        int j = 0;
        for (int i = num.length - 1; i >= 0; i--) {
            result[j++] = num[i];
        }
        return result;
    }
}
