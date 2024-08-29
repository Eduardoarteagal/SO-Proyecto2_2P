package proyectoso;
public class Resultado {
    private Pedido pedido;
    private int distanciaTotal;
    private int tiempoTotal;

    public Resultado(Pedido pedido, int distanciaTotal, int tiempoTotal) {
        this.pedido = pedido;
        this.distanciaTotal = distanciaTotal;
        this.tiempoTotal = tiempoTotal;
    }

    @Override
    public String toString() {
        return "Pedido: " + pedido.getItems().toString() + ", Distancia total: " + distanciaTotal + "m, Tiempo total: " + tiempoTotal + "s";
    }
}
