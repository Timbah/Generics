package thembelani.java.tutorials;

public class Point implements Mappable {

    private IconType type;
    private double latitude, longitude;

    public Point(double latitude, double longitude) {

        this.latitude = latitude;
        this.longitude = longitude;
        this.type = IconType.POINT;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public IconType getType() {
        return this.type;
    }

    @Override
    public void render() {
        System.out.printf(this.type + " ([%f, %f])%n", this.latitude, this.longitude);
    }
}
