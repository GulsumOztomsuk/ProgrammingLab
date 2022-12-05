package Day36_Inheritance;

public class Phone {
    public String brand;
    public String model;
    public String size;
    public double price;
    public String color;

    public void setInfo(String brand, String model, double price, String color) {
        brand = getClass().getSimpleName(); // this gets the class name automatically
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }
    public void call(long phoneNumber){
        System.out.println(model+ " is calling "+ phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(model+" is texting to "+ phoneNumber);
    }

    public String toString() {
        return  getClass().getSimpleName()+"{" +// this gets the class name automatically
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*1. Phone Task:
        1.1 Create a class named Phone:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        toString()

        1.3 Create a sub class of Phone named Samsung:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        freeze()
        toString()
        1.4 Create a sub class of Phone named Nokia:
        Variables:
        brand, model, size, price,
        color
        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        selfDefense()
        toString()
        1.5 Create a class named Phone Objects and test of the
        sub class' objects

 */