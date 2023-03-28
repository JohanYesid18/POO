package POO;

import java.util.Scanner;

import FigurasGeometricas.Cuadrado;
import FigurasGeometricas.Rectangulo;

public class Principal {
    public static void main(String[] args) {
        float lado,base,altura;
        double rete=0.9;
        Scanner captura=new Scanner(System.in);
        System.out.println("Por favor digite el lado del cuadrado");
        lado=captura.nextFloat();
        System.out.println("Por favor digite la base del rectángulo");
        base=captura.nextFloat();
        System.out.println("Por favor digite la altura del rectángulo");
        altura=captura.nextFloat();

        Cuadrado cua=new Cuadrado(lado);
        Rectangulo rect=new Rectangulo(base, altura);
        cua.calcularArea();
        rect.calcularArea();
        captura.close();

    }
}
