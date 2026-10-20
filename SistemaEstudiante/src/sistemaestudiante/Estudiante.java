/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaestudiante;

/**
 *
 * @author drmen
 */
public class Estudiante {
    
    /*
    Modificadores de Acceso
    1. public = Todos tienen acceso
    2. private = los que estan en la clase 
    3. protected = todos los que estan en la clase y los que la heredan 
    */
    
    
     //Atributos (variables0
    private int edad;
    private double estatura;
    String nombre;
    String apellido;
    char genero;
    private double descuento;
     
   
   
    
    //Constructor: le va a dar el valor cuando cree el objeto 
    public Estudiante(){
    this.edad=0;
    this.estatura=0;
    
    this.nombre="John doe";
    this.apellido="doe";
    
    }//Fin del constructor 
    
    //Metodo  acciones que va a tener el molde estudiante 
    public void MostrarDatos(){
        System.out.printf("Nombre: %s\n",this.nombre);
        System.out.printf("Apellido: %s\n",this.apellido);
        System.out.printf("Edad: %d\n",this.edad);
        System.out.printf("Estatura: %.2f\n",this.estatura);
        
    }//fin de metodo 
    
    
    
    //Getter  y Setter 
    //Modificar la edad 
    public void  SetEdad(int edad){
        this.edad = edad;
    }
    
    //Obtener la edad
    public int getEdad(){
        return this.edad;
    }
    
     public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        if(genero== 'm'|| genero== 'f'){
            this.genero = genero;
    }
        else{
            System.out.println("No es vlido otro tipo de dato F/M");
        }
        
    }
    
    
    
}//fin clase estudiante 
