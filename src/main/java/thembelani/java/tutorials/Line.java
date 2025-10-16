package thembelani.java.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line implements Mappable {

    private String name;
    private IconType type;
    private List<double[]> location;

    public Line(String name, IconType type, List<double[]> location) {
        this.name = name;
        this.type = type;
        this.location = new ArrayList<>(location); // this is called defensive copy
    }

    public boolean addLocation(double[] newLocation) {

        if (newLocation == null || newLocation.length != 2) {
            return false;
        }
        location.add(newLocation);
        return true;
    }

    @Override
    public void render() {
        System.out.print(name.toUpperCase() + " as " + type + " (");

        for (int i = 0; i < location.size(); i++) {
            double[] point = location.get(i);
            System.out.print(Arrays.toString(point));

            // Add comma between points, but not after the last one
            if (i < location.size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(")");
    }

}
