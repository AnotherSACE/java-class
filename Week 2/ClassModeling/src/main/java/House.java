// GPS
//public class House {
//    // Location info
//    private double longitude;
//    private double latitude;
//    private String address;
//
//    public House(String address, double longitude, double latitude){
//        this.address = address;
//        this.longitude = longitude;
//        this.latitude = latitude;
//    }
//
//    public String getAddress(){
//        return address;
//    }
//
//    public double getLongitude(){
//        return longitude;
//    }
//
//    public double getLatitude(){
//        return latitude;
//    }
//
//}

// 3D design System
public class House {
    // xyz coordinates
    private float[] coordinates = {0,0,0};

    // House dimensions
    private float[] dimensions = {0,0,0};

    // House attributes
    private String color;

    // There could be more attributes but to save on time I reserved only these

    // Setter to model 3D house
    public House(float[] coordinates, float[] dimensions, String color){

        this.coordinates = coordinates;
        this.dimensions = dimensions;
        this.color = color;
    }

    // Getters

    // Get coordinates
    public float getX(){
        return coordinates[0];
    }

    public float getY(){
        return coordinates[1];
    }

    public float getZ(){
        return coordinates[2];
    }

    // Get dimensions
    public float getLength(){
        return dimensions[0];
    }

    public float getWidth(){
        return dimensions[1];
    }

    public float getHeight(){
        return dimensions[2];
    }

    // Get color
    public String getColor(){
        return color;
    }


    // Setters

    // Set color
    public void setColor(String color){
        this.color = color;
    }

    // Set dimensions
    public void setDimensions(float[] dimensions){
        this.dimensions = dimensions;
    }

    public void setCoordinates(float[] coordinates){
        this.coordinates = coordinates;
    }

    // Methods

    public float volume(){
        return dimensions[0] * dimensions[1] * dimensions[2];
    }

}