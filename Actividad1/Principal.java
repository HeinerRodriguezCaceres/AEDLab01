package Actividad1;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese una esquina del 1er rectángulo: ");
        double ax1 = scanner.nextDouble();
        double ay1 = scanner.nextDouble();
        
        System.out.print("Ingrese la esquina opuesta del 1er rectángulo: ");
        double ax2 = scanner.nextDouble();
        double ay2 = scanner.nextDouble();

        System.out.print("Ingrese una esquina del 2do rectángulo: ");
        double bx1 = scanner.nextDouble();
        double by1 = scanner.nextDouble();

        System.out.print("Ingrese la esquina opuesta del 2do rectángulo: ");
        double bx2 = scanner.nextDouble();
        double by2 = scanner.nextDouble();

        Coordenada esquina1A = new Coordenada(ax1, ay1);
        Coordenada esquina2A = new Coordenada(ax2, ay2);
        Rectangulo rectanguloA = new Rectangulo(esquina1A, esquina2A);

        Coordenada esquina1B = new Coordenada(bx1, by1);
        Coordenada esquina2B = new Coordenada(bx2, by2);
        Rectangulo rectanguloB = new Rectangulo(esquina1B, esquina2B);

        System.out.println("\n\033[35mRectangulo A = (" + rectanguloA + ")\033[0m");
        System.out.println("\033[35mRectangulo B = (" + rectanguloB + ")\033[0m");

        if (Verificador.Sesobreponen(rectanguloA, rectanguloB)) {
            double area = Verificador.calcularAreaSuperposicion(rectanguloA, rectanguloB);
            System.out.println("\033[35mRectángulos A y B se sobreponen\033[0m");
            System.out.println("\033[35mÁrea de superposición: " + area + "\033[0m");
        } else if (Verificador.Estanjuntos(rectanguloA, rectanguloB)) {
            System.out.println("\033[35mRectángulos A y B se juntan\033[0m");
        } else {
            System.out.println("\033[35mRectángulos A y B son disjuntos\033[0m");
        }

        scanner.close();
    }
}
