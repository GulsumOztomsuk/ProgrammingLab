package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[][] arr={{1,2,3}, {4,5,6}};

        for (int i = arr.length-1; i >=0; i--) {
            for (int j = arr[i].length - 1; j >= 0; j--) {
                System.out.print( arr[i][j]+" ");
            }
        }
        System.out.println();
    }
}
/*. Write a program that can reverse a two dimensional array (return new
        array)
        Ex:
        array = { {1,2,3}, {4,5,6}};
        output:
        reverse = { {6,5,4}, {3,2,1},};

 */