package thembelani.java.tutorials;

import java.util.Arrays;
import java.util.List;

public class River extends Line {

    private String name;

    public River(String name, List<double[]> location) {
        super(location);
        this.name = name;
    }

    @Override
    public void render() {
        System.out.print(name.toUpperCase() + " as " + getType() + " (");

        for (int i = 0; i < getLocation().size(); i++) {
            double[] point = getLocation().get(i);
            System.out.print(Arrays.toString(point));

            // Add comma between points, but not after the last one
            if (i < getLocation().size() - 1) {
                System.out.print(", ");
            }
        }

        System.out.println(")");
    }


}
