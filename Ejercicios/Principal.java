package Ejercicios;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContainerRect contenedor = new ContainerRect(5); 

        for (int i = 0; i < 2; i++) { 
            System.out.println("Ingrese una esquina del rectángulo " + (i + 1) + " (x y):");
            double x1 = scanner.nextDouble();
            double y1 = scanner.nextDouble();

            System.out.println("Ingrese la esquina opuesta del rectángulo " + (i + 1) + " (x y):");
            double x2 = scanner.nextDouble();
            double y2 = scanner.nextDouble();

            Rectangulo rect = new Rectangulo(new Coordenada(x1, y1), new Coordenada(x2, y2));
            contenedor.addRectangulo(rect);
        }

        System.out.println(contenedor);

        scanner.close();
    }
}
