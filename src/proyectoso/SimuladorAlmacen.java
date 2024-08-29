package proyectoso;
import java.util.ArrayList;
import java.util.List;

public class SimuladorAlmacen {
    private Almacen almacen;
    private List<Resultado> resultados;

    public SimuladorAlmacen() {
        this.almacen = new Almacen();
        this.resultados = new ArrayList<>();
    }

    public Resultado procesarPedido(Pedido pedido) {
        int distanciaTotal = 0;
        int tiempoTotal = 0;
        int ubicacionActual = 1;  // Comienza en la ubicación inicial

        for (int item : pedido.getItems()) {
            int ubicacionItem = almacen.getUbicaciones().get(item);
            distanciaTotal += almacen.calcularDistancia(ubicacionActual, ubicacionItem);
            ubicacionActual = ubicacionItem;
        }

        tiempoTotal = distanciaTotal;  // Si la velocidad es 1m/s

        Resultado resultado = new Resultado(pedido, distanciaTotal, tiempoTotal);
        resultados.add(resultado);
        return resultado;
    }

    public void guardarResultados(String archivoNombre) {
        // Código para guardar resultados en un archivo de texto.
    }

    public List<Resultado> getResultados() {
        return resultados;
    }
}
