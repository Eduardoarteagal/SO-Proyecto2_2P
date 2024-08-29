package proyectoso;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private List<Integer> items;

    public Pedido() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(int item) {
        items.add(item);
    }

    public List<Integer> getItems() {
        return items;
    }
}
