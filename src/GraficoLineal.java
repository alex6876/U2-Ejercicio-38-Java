import java.util.ArrayList;

public class GraficoLineal extends GeneradorGrafico {

    public GraficoLineal(ArrayList<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        if (datos.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
            return;
        }

        System.out.println("Grafico lineal:");

        for (Double dato : datos) {
            System.out.println("Punto: " + dato + " ->");
        }
    }
}