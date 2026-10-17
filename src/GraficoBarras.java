import java.util.ArrayList;

public class GraficoBarras extends GeneradorGrafico {

    public GraficoBarras(ArrayList<Double> datos) {
        super(datos);
    }

    @Override
    public void renderizarGrafico() {
        if (datos.isEmpty()) {
            System.out.println("No hay datos.");
            return;
        }

        System.out.println("Grafico de barras");
    }
}