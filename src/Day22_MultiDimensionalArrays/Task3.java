package Day22_MultiDimensionalArrays;

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        String[] batch25Group1 = {"Jilil", "Aykhan", "Irene", "Yulia", "Muhtar"};
        String[] batch25Group2 = {"Riza", "Allison", "Fei zhou", "Ahmet", "Elena", "Mikael", "Muhtar"};
        String[] batch25Group3 = {"Fady", "Break", "Clock", "Cihad", "Muhtar"};
     /*  String[][] batch25Groups=new String[3][];
        batch25Groups [0]=batch25Group1;
         batch25Groups[1]=batch25Group2;
        batch25Groups[2]=batch25Group3;

        System.out.println(Arrays.deepToString(batch25Groups));

      */
        String[][] batch25Groups = {batch25Group1, batch25Group2, batch25Group3};

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] batch24Groups = {batch24Group1, batch24Group2, batch24Group3};

        String[][][] cydeoStudents = {batch24Groups, batch25Groups};

        for (String[][] eachBatch : cydeoStudents) {
            for (String[] eachGroup : eachBatch) {
         for (String eachStudent : eachGroup) {
            System.out.print(eachStudent+"\t");
        }
        System.out.println();
    }
}

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