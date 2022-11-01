package day21_ForEachLoop;

public class JavaAndPhyton {
    public static void main(String[] args) {
        String[] words = {"java", "java", "phyton", "phyton","phyton"};
        int countJava=0;
        int countPhyton=0;
        for (String each: words){
            if (each.equalsIgnoreCase("java")){
                countJava++;
            } else if (each.equalsIgnoreCase("phyton")) {
                countPhyton++;
            }
        }
        System.out.println(countJava + " Java "+ countPhyton+" Phyton");
    }
}
/*
6. Write a program that can return the number of appearances of “java” and “python” anywhere in the sentence.
				(similar to the task in repl.it, but this time you MUST use arrays and for each loop)
 */