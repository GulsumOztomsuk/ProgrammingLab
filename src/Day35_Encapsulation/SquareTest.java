package Day35_Encapsulation;

public class SquareTest {
    public static void main(String[] args) {
        Square square=new Square(5);

        System.out.println(square);

        square.setSide(2);
       // System.out.println(square.getSide());

        System.out.println(square);
    }
}
