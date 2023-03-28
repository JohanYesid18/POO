package Salud;

import java.util.Scanner;

public class Persona {

    //creamos los atributos privados y con tipo de variable
    private String tipoDoc;
    private int documento;
    private String nombre;
    private String apellido;
    private double peso;
    private double estatura;
    private int edad;
    private String sexo;
    private Double pesoActual;

//Metodos

//metodo contructor vacio
public Persona(){

}


//metodo constructor con parametros
public Persona(String tipoDoc2, int documento2, String nombre2, String apellido2, double peso2, double estatura2) {
}


 /* El método get siempre genera un valor de retorno del mismo tipo de
dato del atributo*/

/*El método set no retorna valores y requiere como parámetro el valor
del atributo*/



public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

public Double getPesoActual() {
    return pesoActual;
}

public void setPesoActual(Double pesoActual) {
    this.pesoActual = pesoActual;
}



//creando el motodo contructor de la clase persona con parametros con nombres diferentes a los atributos
/*public void Persona(String _tipoDoc,int _documento,String _nombre,String _apellido,double _peso,double _estatura,int _edad,String _sexo,
Double _pesoActual){

    tipoDoc=_tipoDoc;
    documento=_documento;
    nombre=_nombre;
    apellido=_apellido;
    peso=_peso;
    estatura=_estatura;
    edad=_edad;
    sexo=_sexo;
    pesoActual=_pesoActual;


}*/

//creando el motodo contructor de la clase persona con parametros con nombres iguales a los atributos
/*public void Persona(String tipoDoc,int documento,String nombre,String apellido,double peso,double estatura,int edad,String sexo,
Double pesoActual){

    this.tipoDoc=tipoDoc;
    this.documento=documento;
    this.nombre=nombre;
    this.apellido=apellido;
    this.peso=peso;
    this.estatura=estatura;
    this.edad=edad;
    this.sexo=sexo;
    this.pesoActual=pesoActual;


}*/
//creamos el metodo pedir datos con variable de retorno y identificador

    public void pedirDatos(){
        //intanciamos la clase scanner para leer lo que digite el usuario
        Scanner lectura=new Scanner(System.in);

        //imprimos mensajes para digitar los datos del usuario
        System.out.println("Ingrese su tipo de documento ");

        //llamamos variables y despues llamamos al metodo lectura de la clase Scanner
        tipoDoc=lectura.nextLine();
        System.out.println("Ingrese su documento ");
        documento=lectura.nextInt();
        System.out.println("Ingrese su nombre ");
        nombre=lectura.next();
        System.out.println("Ingrese su apellido ");
        apellido=lectura.next();
        System.out.println("Ingrese su peso ");
        peso=lectura.nextDouble();
        System.out.println("Ingrese su estatura ");
        estatura=lectura.nextDouble();
        System.out.println("Ingrese su edad ");
        edad=lectura.nextInt();
        System.out.println("Ingrese su sexo ");
        sexo=lectura.next();

    }


    //metodo sin parametros    
    /*public void mostrarPersona(){

        //imprimos mensajes para mostrar los datos al usuario
        System.out.println("Su tipo de documento es: " +tipoDoc);
        System.out.println("Su documento es: " +documento);
        System.out.println("Su nombre es: " +nombre);
        System.out.println("Su apellido es: " +apellido);
        System.out.println("Su peso es: " +peso);
        System.out.println("Su estatura es: " +estatura);
        System.out.println("Su edad es: " +edad);
        System.out.println("Su sexo es: " +sexo);
    
    }*/


    //metodo con parametros
    public void mostrarPersona(String tipoDoc,int documento,String nombre,String apellido,double peso,double estatura,int edad,String sexo,
Double pesoActual){

        //imprimos mensajes para mostrar los datos al usuario
        System.out.println("Su tipo de documento es: " +tipoDoc);
        System.out.println("Su documento es: " +documento);
        System.out.println("Su nombre es: " +nombre);
        System.out.println("Su apellido es: " +apellido);
        System.out.println("Su peso es: " +peso);
        System.out.println("Su estatura es: " +estatura);
        System.out.println("Su edad es: " +edad);
        System.out.println("Su sexo es: " +sexo);
    
    }
        
    /*public void calcularImc(){

        pesoActual=(peso)/(estatura)*2;


        if (pesoActual<20) {
            System.out.println("El peso esta por debajo de lo ideal");
            
        }else if (pesoActual<=25) {
            System.out.println("El peso es ideal");
            
        }else if (pesoActual>25) {
            System.out.println("Tiene Sobrepeso");
            
        }*/

        public Double calcularImc(Double peso, Double estatura){

            pesoActual=(peso)/(estatura)*2;

            return pesoActual;

        }

    public void mayorEdad(){

        if (edad>=18) {

            System.out.println("Es mayor de edad");
            
        } else if (edad<18) {
            System.out.println("Es menor de edad");
            
        }

    }
}



