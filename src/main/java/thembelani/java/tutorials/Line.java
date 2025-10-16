package thembelani.java.tutorials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Line implements Mappable {

    private IconType type;
    private List<double[]> location;

    public Line(List<double[]> location) {
        this.type = IconType.LINE;
        this.location = new ArrayList<>(location); // this is called defensive copy
    }

    public boolean addLocation(double[] newLocation) {

        if (newLocation == null || newLocation.length != 2) {
            return false;
        }
        location.add(newLocation);
        return true;
    }

    public IconType getType() {
        return type;
    }

    public List<double[]> getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.print(type + " (");

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
