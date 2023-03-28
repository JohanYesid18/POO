package FigurasGeometricas;

import java.util.Scanner;

public class Ejecucion {
    
    public static void main(String[] args) {

    Scanner leer= new Scanner(System.in);
    Circulo circle= new Circulo();
    Cuadrado scuadre= new Cuadrado();
    Rectangulo rectangle= new Rectangulo();
    /*Triangulo triangle=new Triangulo();*/
    
    int   intentos;
    int   figura;

   

        System.out.println("Hola este es un programa para hallar el area de una figura geometrica");
        System.out.println("Por favor ingresa el número de intentos que vas a realizar");
        intentos=leer.nextInt();

        for(int i=1; i<intentos; i++){

        System.out.println("Por favor ingrese la figura a la que le quiere descubrir el area ");
        System.out.println("1.Circulo   2.Cuadrado   3.Rectangulo   4.Triangulo");
        figura=leer.nextInt();

        if(figura==1){
            
            circle.pedirDatosCirculo();
            circle.calcularAreaCirculo();

        }else if(figura==2){

            scuadre.pedirDatosCuadrado();
            scuadre.calcularAreaCuadrado();

        }else if(figura==3){

            rectangle.pedirDatosRectangulo();
            rectangle.calcularAreaRectangulo();


        } /*else if(figura==4){

            triangle.pedirDatosTriangulo();
            triangle.calcularAreaTriangulo();

        }*/
        }

    }
}
