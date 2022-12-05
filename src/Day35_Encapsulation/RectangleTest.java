package Day35_Encapsulation;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle renctangle=new Rectangle(5,3);
        System.out.println(renctangle);

        renctangle.setLength(4);
        renctangle.setWidth(8);

        System.out.println(renctangle.getLength());
        System.out.println(renctangle.getWidth());

        System.out.println(renctangle);

    }

}
