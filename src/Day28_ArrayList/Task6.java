package Day28_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.sort(list);
        System.out.println(list.get(0));

    }
}
/*6. Write a program that can find the minimum number from an ArrayList of
        integers
        Ex:
        list = [1,2,3,4,5];
        output:
        1

 */