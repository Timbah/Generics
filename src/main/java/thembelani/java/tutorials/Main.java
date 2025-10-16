package thembelani.java.tutorials;

import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        var nationalPark = new Park("National Park Of RSA",0,100);
        var zooPark = new Park("Random Zoo Park",12.12,-43.232);

        List<double[]> initialLocations = List.of(
                new double[] {1.0, 2.0},
                new double[] {3.0, 4.0}
        );

        var nationalRiver = new River("Nile River",initialLocations);

        initialLocations = List.of(
                new double[] {7.0, -4.0},
                new double[] {9.0, -12.0}
        );

        var river2 = new River("Umfula",initialLocations);

        Layer<Mappable> layer =  new Layer<>();

        layer.addItem(nationalRiver);
        layer.addItem(zooPark);
        layer.addItem(nationalRiver);
        layer.addItem(river2);
        layer.addItem(river2);

        layer.renderLayer();

    }
}