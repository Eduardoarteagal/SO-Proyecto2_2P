
package proyectoso;
import java.util.HashMap;
import java.util.Map;

public class Almacen {
    private final int pasillos = 5;
    private final int ubicacionesPorPasillo = 12;
    private Map<Integer, Integer> ubicaciones;

    public Almacen() {
        this.ubicaciones = new HashMap<>();
        inicializarUbicaciones();
    }

    private void inicializarUbicaciones() {
        for (int i = 1; i <= pasillos * ubicacionesPorPasillo; i++) {
            ubicaciones.put(i, i);  // ítem n en la ubicación n
        }
    }

    public int calcularDistancia(int ubicacionInicio, int ubicacionFin) {
        return Math.abs(ubicacionFin - ubicacionInicio);  // Ejemplo simple de cálculo de distancia
    }

    public Map<Integer, Integer> getUbicaciones() {
        return ubicaciones;
    }
}

