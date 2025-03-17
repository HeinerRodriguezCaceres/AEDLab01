package Actividad1;

public class Rectangulo {
	private Coordenada esquina1;
	private Coordenada esquina2;
	
	public Rectangulo(Coordenada c1, Coordenada c2) {
		 double x1 = Math.min(c1.getX(), c2.getX());
		 double y1 = Math.min(c1.getY(), c2.getY());
		 double x2 = Math.max(c1.getX(), c2.getX());
		 double y2 = Math.max(c1.getY(), c2.getY());

		 this.esquina1 = new Coordenada(x1, y1);
		 this.esquina2 = new Coordenada(x2, y2);
	}
	public double getIzquierda() {
        return Math.min(esquina1.getX(), esquina2.getX());
    }

    public double getDerecha() {
        return Math.max(esquina1.getX(), esquina2.getX());
    }

    public double getInferior() {
        return Math.min(esquina1.getY(), esquina2.getY());
    }

    public double getSuperior() {
        return Math.max(esquina1.getY(), esquina2.getY());
    }
	@Override
	public String toString() {
		return "Rectangulo [esquina 1=" + esquina1.toString() + ", esquina2= " + esquina2.toString() + "]";
		
	}
	public Coordenada getEsquina1() {
		return esquina1;
	}
	public Coordenada getEsquina2() {
		return esquina2;
	}
}
