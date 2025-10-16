package thembelani.java.tutorials;

public class Park extends Point {

    private String name;

    public Park(String name, double latitude, double longitude) {
        super(latitude, longitude);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.printf("%s as %s ([%f, %f])%n", name.toUpperCase(), getType(), getLatitude(), getLongitude());
    }
}
