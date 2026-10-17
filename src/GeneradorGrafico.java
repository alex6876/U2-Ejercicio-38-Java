import java.util.ArrayList;

public abstract class GeneradorGrafico {

    protected ArrayList<Double> datos;

    public GeneradorGrafico(ArrayList<Double> datos) {
        this.datos = datos;
    }

    public abstract void renderizarGrafico();
}