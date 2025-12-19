class Car {
    private String colour;
    private String name;
    private int mileage;

    public void setData(String x, String y, int z) {
        colour = x;
        name = y;
        mileage = z;
    }

    public String getColour() {
        return colour;
    }

    public String getName() {
        return name;
    }

    public int getMileage() {
        return mileage;
    }
}

public class ExampleForCar {
    public static void main(String[] args) {
        Car s = new Car();
        s.setData("Red", "Kia Carens", 20);

        System.out.println("The Car colour: " + s.getColour());
        System.out.println("The Car name: " + s.getName());
        System.out.println("The Car mileage: " + s.getMileage());
    }
}
