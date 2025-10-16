package thembelani.java.tutorials;

public class Point implements Mappable {

    private String name;
    private IconType type;
    private double latitude, longitude;


    public Point(String name, double latitude, double longitude) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    @Override
    public void render() {
        System.out.printf(name.toUpperCase() + " as " + type + " ([%f, %f])%n", this.latitude, this.longitude);
    }
}
