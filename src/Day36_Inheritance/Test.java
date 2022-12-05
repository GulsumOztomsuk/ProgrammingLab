package Day36_Inheritance;

public class Test {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();
        iphone.setInfo("iphone 12", "5.6 inches", 1000, "Black");

        Samsung samsung = new Samsung();
        samsung.setInfo("galaxy S19", "6 inches", 900, "White");

        Nokia nokia = new Nokia();
        nokia.setInfo("Brik", "4 inches", 60, "Pink");

        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);


    }
}
