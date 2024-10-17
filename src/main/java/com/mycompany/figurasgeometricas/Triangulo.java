
package com.mycompany.figurasgeometricas;


public class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;
    
    public Triangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.altura = altura;
        this.base = base;
    }
    
    public double getBase(){
        return base;
    }
    
    public void setBase(){
        this.base = base;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public void setAltura(){
        this.altura = altura;
    }
    
    public double obtenerArea() {
        return (base * altura) / 2;
    }

    public double obtenerPerimetro() {
        
        return 3 * base;
    }
}
