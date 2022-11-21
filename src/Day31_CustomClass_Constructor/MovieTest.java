package Day31_CustomClass_Constructor;

import java.util.Arrays;

public class MovieTest {
    public static void main(String[] args) {

        String[] casts = {"Ray", "Mimi", "Dark"};
         Movie movie1=new Movie("USA","The Guy","Comedy","2022");
         movie1.addCasts(casts);

        System.out.println(Arrays.toString(casts));


        System.out.println(movie1);

    }
}
