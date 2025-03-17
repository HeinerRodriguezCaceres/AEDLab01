package Actividad1;

public class Verificador {
	public static boolean Sesobreponen(Rectangulo rect1, Rectangulo rect2) {
        double izquierdaInterseccion = Math.max(rect1.getIzquierda(), rect2.getIzquierda());
        double derechaInterseccion = Math.min(rect1.getDerecha(), rect2.getDerecha());
        double inferiorInterseccion = Math.max(rect1.getInferior(), rect2.getInferior());
        double superiorInterseccion = Math.min(rect1.getSuperior(), rect2.getSuperior());

        return izquierdaInterseccion < derechaInterseccion && inferiorInterseccion < superiorInterseccion;
    }
    public static double calcularAreaSuperposicion(Rectangulo rect1, Rectangulo rect2) {
        double izquierdaInterseccion = Math.max(rect1.getIzquierda(), rect2.getIzquierda());
        double derechaInterseccion = Math.min(rect1.getDerecha(), rect2.getDerecha());
        double inferiorInterseccion = Math.max(rect1.getInferior(), rect2.getInferior());
        double superiorInterseccion = Math.min(rect1.getSuperior(), rect2.getSuperior());

        double ancho = Math.max(0, derechaInterseccion - izquierdaInterseccion);
        double alto = Math.max(0, superiorInterseccion - inferiorInterseccion);

        return ancho * alto;
    }
	public static boolean Estanjuntos(Rectangulo rectangulo1, Rectangulo rectangulo2) {
		return rectangulo1.getEsquina1().getX() == rectangulo2.getEsquina2().getX() || rectangulo1.getEsquina1().getY() == rectangulo2.getEsquina2().getY();
	}
	public static boolean EstanDisjuntos(Rectangulo rectangulo1, Rectangulo rectangulo2) {
		return !EstanDisjuntos(rectangulo1, rectangulo2);
	}
}
