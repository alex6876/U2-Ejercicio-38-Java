import java.util.ArrayList;

public class GraficoCircular extends GeneradorGrafico {

    public GraficoCircular(ArrayList<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        if (datos.isEmpty()) {
            System.out.println("No hay datos para mostrar.");
            return;
        }

        System.out.println("Grafico circular:");

        for (Double dato : datos) {
            System.out.println("Sector: " + dato);
        }
    }
}