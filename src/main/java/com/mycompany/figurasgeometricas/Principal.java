package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre de la figura");
        String nombre = lector.nextLine();

        System.out.println("Ingrese el color de la figura:");
        String color = lector.nextLine();
        
        System.out.println("Ingrese el tipo de figura");
        
        int tipo = lector.nextInt();
        
        FiguraGeometrica figura = null;
        
        switch(tipo){
             case 1:
                System.out.println("Ingrese el radio del círculo:");
                double radio = lector.nextDouble();
                figura = new Circulo(nombre, color, radio);
                break;
            case 2:
                System.out.println("Ingrese el valor del lado 1 del rectángulo:");
                double lado1 = lector.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo:");
                double lado2 = lector.nextDouble();
                figura = new Rectangulo(nombre, color, lado1, lado2);
                break;
            case 3:
                System.out.println("Ingrese el valor de la base del triángulo:");
                double base = lector.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo:");
                double altura = lector.nextDouble();
                figura = new Triangulo(nombre, color, base, altura);
                break;
            default:
                System.out.println("Tipo de figura no válido.");
                break;
        }

        if (figura != null) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.obtenerArea());
            System.out.println("Perímetro de " + figura.getNombre() + ": " + figura.obtenerPerimetro());
        }
        
        
        
    }
}
