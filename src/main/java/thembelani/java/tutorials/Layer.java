package thembelani.java.tutorials;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable> {

    private List<Mappable> items;

    public Layer(List<Mappable> items) {
        this.items = items;
    }

    public Layer() {
        this.items = new ArrayList<>();
    }

    public boolean addItem(Mappable item) {
        return items.add(item);
    }

    public void renderLayer() {
        for (Mappable item : items) {
            item.render();
        }
    }
}
