import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Double> datos = new ArrayList<>();

        datos.add(5.0);
        datos.add(3.0);
        datos.add(7.0);

        GeneradorGrafico grafico;

        grafico = new GraficoBarras(datos);
        grafico.renderizarGrafico();

        System.out.println("----------------");

        grafico = new GraficoCircular(datos);
        grafico.renderizarGrafico();

        System.out.println("----------------");

        grafico = new GraficoLineal(datos);
        grafico.renderizarGrafico();
    }
}