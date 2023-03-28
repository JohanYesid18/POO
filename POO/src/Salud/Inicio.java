package Salud;

import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        //instanciamos la clase scanner para leer los datos que digite el usuario
        Scanner lectura=new Scanner(System.in);

        double peso,estatura,pesoActual;

        String tipoDoc;
        int documento;
        String nombre;
        String apellido;
        int edad;
        String sexo;

    
        //crear un objeto instancia de una clase
        Persona pers=new Persona();

        /*invocando metodos
        pers.pedirDatos();*/

         
        System.out.println("Ingrese el tipo de documento del empleado:");
        tipoDoc = lectura.nextLine();
        System.out.println("Ingrese el número de documento del empleado:");
        documento = lectura.nextInt();
        System.out.println("Ingrese los nombres del empleado:");
        nombre = lectura.nextLine();
        System.out.println("Ingrese los apellidos del empleado:");
        apellido = lectura.nextLine();
        System.out.println("Ingrese el cargo del empleado:");
        String cargo = lectura.nextLine();
        System.out.println("Ingrese el valor por hora del empleado:");
        double valorHora = lectura.nextDouble();
        System.out.println("Ingrese las horas trabajadas del empleado:");
        int horasTrabajadas = lectura.nextInt();
        lectura.nextLine(); // limpiar el buffer de entrada
        System.out.println("Ingrese el departamento del empleado:");
        String departamento = lectura.nextLine();
       


        //se imprime un mensaje para solicitar el peso
        System.out.println("Ingrese su peso ");
        peso=lectura.nextDouble();

        //se imprime un mensaje para solicitar la estatura
        System.out.println("Ingrese su estatura ");
        estatura=lectura.nextDouble();

         //invocando metodos
        //pers.mostrarPersona();


        //invoncando metodo con argumentos
        pesoActual=pers.calcularImc(peso, estatura);

        if (pesoActual<20) {
            System.out.println("PESOBAJO");

        }else if (pesoActual>=20 && pesoActual<=25){
            System.out.println("PESO IDEAL");
            
        }else if (pesoActual>26) {
            System.out.println("SOBREPESO");
        }

        System.out.println("Su peso es: " + pesoActual);

        Empleado emplea= new Empleado(tipoDoc, documento, nombre, apellido, cargo, valorHora, horasTrabajadas, departamento);
        
        /*emplea.pedirDatos();*/
        //emplea.mostrarPersona();
        emplea.imprimirDatos();
        
    }

    

}
