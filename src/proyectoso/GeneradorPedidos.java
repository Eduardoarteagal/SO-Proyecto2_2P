package proyectoso;
import java.util.Random;

public class GeneradorPedidos {
    private Random random = new Random();

    public Pedido generarPedido() {
        Pedido pedido = new Pedido();
        int numeroItems = 5 + random.nextInt(6); // 5 a 10 ítems

        for (int i = 0; i < numeroItems; i++) {
            int item = 1 + random.nextInt(60); // Ítems entre 1 y 60
            pedido.agregarItem(item);
        }

        return pedido;
    }
}
