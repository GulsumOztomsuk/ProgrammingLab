package Day35_Encapsulation;

public class CarpetTest {
    public static void main(String[] args) {
        Carpet capet=new Carpet(3,2,5,true);

        System.out.println(capet);

        capet.setLength(7);
        capet.setWidth(6);
        capet.setUnitPrice(5);

        System.out.println(capet.getLength());
        System.out.println(capet.getWidth());
        System.out.println(capet.getUnitPrice());

        System.out.println(capet);
    }
}
