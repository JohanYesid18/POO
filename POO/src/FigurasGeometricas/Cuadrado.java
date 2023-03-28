package FigurasGeometricas;
import java.util.Scanner;

public class Cuadrado extends Figura{
    public static void main(String[] args) {
        
    }
    //atributos
    float lado;
    //metodo constructor

    public Cuadrado(float lado) {
        this.lado = lado;
    }
    //metodos accesores

    public Cuadrado() {
	}

	public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }
    //métodos propios
    public void pedirDatosCuadrado(){
        
        Scanner contraer= new Scanner(System.in);

        System.out.println("Digite el valor del lado");
        lado=contraer.nextFloat();

    }

    public void calcularAreaCuadrado(){
    float area;
    area=lado*lado;
    System.out.println("El lado del cuadrado es: "+lado+" y su área es: "+area);
    
    }

    @Override
    public void calcularArea() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'calcularArea'");
    }

    
}
