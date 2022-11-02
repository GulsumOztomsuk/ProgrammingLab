package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
        String[][] batch25Groups=new String[3][];
        batch25Groups [0]=batch25Group1;
         batch25Groups[1]=batch25Group2;
        batch25Groups[2]=batch25Group3;

        System.out.println(Arrays.deepToString(batch25Groups));

        System.out.println("--------------------------");


    }
}
 /*3. CydeoStudents Task:
         1. given the following arrays:
         String[] batch25Group1 = {"Jilil",
         "Aykhan", "Irene", "Yulia", "Muhtar"};
         String[] batch25Group2 = {"Riza",
         "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
         String[] batch25Group3 = {"Fady",
         "Break", "Clock", "Cihad", "Muhtar"};
         2. declare an array variable named batch25Groups with the
         length of three
         2.1 Assign batch25Group1,
         batch25Group2, batch25Group1=3 to each indexes of the variable
         batch25Groups

  */