package FigurasGeometricas;

import java.util.Scanner;

public class Circulo {
    float pi;
    float Radio;
    //metodo constructor

    public Circulo() {
        this.pi = pi;
        this.Radio = Radio;
    }
    //metodos accesores

    public float getpi() {
        return pi;
    }
    public float getRadio() {
        return Radio;
    }

    public void setDiametro(float pi) {
        this.pi = pi;  
    }
    public void setradio(float Radio) {
        this.Radio = Radio;  
        
    }

    
    //métodos propios

    //creamos el metodo pedir datos 
    public void pedirDatosCirculo(){
        
        Scanner contraer= new Scanner(System.in);

        System.out.println("Digite el valor de pi");
        pi=contraer.nextFloat();

        System.out.println("Digite el radio");
        Radio=contraer.nextFloat();

        contraer.close();
    }


    public void calcularAreaCirculo(){
    float areaCirculo;
    areaCirculo= (pi * Radio)*2;
    System.out.println("El area del circulo es "+areaCirculo+ "determinado por "+pi+ " y "+Radio);

    }

    
    
}

