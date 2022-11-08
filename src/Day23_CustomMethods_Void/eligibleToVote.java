package Day23_CustomMethods_Void;

public class eligibleToVote {
    public static void eligibleToVote(int age,String citizien){
        if(age>=18 && citizien.equalsIgnoreCase("usa")){
            System.out.println("You are eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }
    }
}
/*4. create a method that can check if a person is eligible to vote
        Ex:
        eligibleToVote(19, "USA");
        output:
        You are not eligible to vote!

 */