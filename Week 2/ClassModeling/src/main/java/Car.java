// Model a car as if the class were to be part of an inventory system for a car dealership
//public class Car {
//    private String model;
//    private int miles;
//    private float price;
//    private String color;
//    private String numberPlate;
//
//    public Car(String model, int miles, float price, String color, String numberPlate){
//        this.model = model;
//        this.miles = miles;
//        this.price = price;
//        this.color = color;
//        this.numberPlate = numberPlate;
//    }
//
//    public String getModel() {
//        return model;
//    }
//
//    public int getMiles() {
//        return miles;
//    }
//
//    public float getPrice() {
//        return price;
//    }
//
//    public String getColor() {
//        return color;
//    }
//
//    public String getNumberPlate() {
//        return numberPlate;
//    }
//
//    public void setModel(String model) {
//        this.model = model;
//    }
//
//    public void setMiles(int miles) {
//        this.miles = miles;
//    }
//
//    public void setPrice(float price) {
//        this.price = price;
//    }
//
//    public void setColor(String color) {
//        this.color = color;
//    }
//
//    public void setNumberPlate(String numberPlate) {
//        this.numberPlate = numberPlate;
//    }
//}

// Model a car as if it were to be part of a video game
public class Car {
    private int speed;
    private int acceleration;
    private String name;
    private String color;

    public Car(int speed, int acceleration, String name, String color){
        this.speed = speed;
        this.acceleration = acceleration;
        this.name = name;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAcceleration() {
        return acceleration;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setAcceleration(int acceleration) {
        this.acceleration = acceleration;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}