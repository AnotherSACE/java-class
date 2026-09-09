//public class Airplane {
//    // Model an airplane as if the class were to be part of an air traffic control system.
//    private String origin;
//    private String destination;
//    private String flightCode;
//    private String status;
//    private int departure;
//    private int arrival;
//
//    public Airplane(String origin, String destination, String flightCode,
//                    int departure, int arrival){
//        this.origin = origin;
//        this.destination = destination;
//        this.flightCode = flightCode;
//        this.departure = departure;
//        this.arrival = arrival;
//    }
//
//    // Getters & Setters
//
//    public String getOrigin() {
//        return origin;
//    }
//
//    public String getDestination() {
//        return destination;
//    }
//
//    public String getFlightCode() {
//        return flightCode;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public int getDeparture() {
//        return departure;
//    }
//
//    public int getArrival() {
//        return arrival;
//    }
//
//    public void setOrigin(String origin) {
//        this.origin = origin;
//    }
//
//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public void setFlightCode(String flightCode) {
//        this.flightCode = flightCode;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public void setDeparture(int departure) {
//        this.departure = departure;
//    }
//
//    public void setArrival(int arrival) {
//        this.arrival = arrival;
//    }
//
//    // Methods
//
//    // Find how long the flight is in minutes
//    public int timeRemaining(){
//        return arrival - departure;
//    }
//}

// Model an airplane as if the class were to be part of a flight simulator
public class Airplane{
    private int speed;
    private int longitude;
    private int latitude;
    private int altitude;
    private String model;

    public Airplane(int longitude, int latitude, int altitude, String model){
        this.longitude = longitude;
        this.latitude = latitude;
        this.altitude = altitude;
        this.model = model;
    }

    // Getters and setters
    public int getSpeed() {
        return speed;
    }

    public int getLongitude() {
        return longitude;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public String getModel() {
        return model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setLongitude(int longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(int latitude) {
        this.latitude = latitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
