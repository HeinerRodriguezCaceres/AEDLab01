package Ejercicios;

public class ContainerRect {
	private Rectangulo[] rectangulos;
    private double[] distancias;
    private double[] areas;
    private int n;
    private static int numRec = 0;

    public ContainerRect(int n) {
        this.n = n;
        this.rectangulos = new Rectangulo[n];
        this.distancias = new double[n];
        this.areas = new double[n];
    }

    public void addRectangulo(Rectangulo rect) {
        if (numRec < n) {
            rectangulos[numRec] = rect;
            distancias[numRec] = rect.calcularDistancia();
            areas[numRec] = rect.calcularArea();
            numRec++;
        } else {
            System.out.println("No se pueden agregar más rectángulos, límite alcanzado.");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Rectangulo Coordenadas Distancia Area\n");
        for (int i = 0; i < numRec; i++) {
            sb.append((i + 1) + " " + rectangulos[i] + " " 
                      + String.format("%.3f", distancias[i]) + " " 
                      + String.format("%.3f", areas[i]) + "\n");
        }
        return sb.toString();
    }
}
