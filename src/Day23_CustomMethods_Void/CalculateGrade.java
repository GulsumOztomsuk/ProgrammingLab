package Day23_CustomMethods_Void;

public class CalculateGrade {
    public static void grade(int score){
        String grade="Invalid";
        if (score>=0 && score<=100){
            grade=(score>=90)?"A":"F";
        }
        System.out.println("grade = " + grade);
    }
}
/*
5. create a method that can calculate the grade of the student based on the score
 */