package Ejercicios;

public class Coordenada {
	private double x;
	private double y;
	
	public Coordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public Coordenada(Coordenada c) {
		this.x = c.x;
		this.y = c.y;
	}
	void setX(double x) {
		
	}
	void setY(double y) {
		
	}
	double getX() {
		return x;
		
	}
	double getY() {
		return y;
		
	}
	@Override
	public String toString() {
		return "Coordenada [x=" + x + ", y="+ y +"]";
	}
}
