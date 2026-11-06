/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cieloslimpios;

/**
 *
 * @author drmen
 */
public class DronCargaAmbiental extends Chasis{
    
    
     private double cargaMaxima;
    private double cargaActual;

    public DronCargaAmbiental(String codigo, int nivelEnergia, boolean estadoVinculacion, double cargaMaxima) {
        super(codigo, nivelEnergia, estadoVinculacion);
        this.cargaMaxima = cargaMaxima;
        this.cargaActual = 0;
    }//fin del constructor 

    
    //Getters y  Setters
    public double getCargaMaxima() {
     return cargaMaxima; 
    }
    
    public void setCargaMaxima(double cargaMaxima) {
    this.cargaMaxima = cargaMaxima; 
    
    }
    
    public double getCargaActual() {
     return cargaActual; 
    }
    public void setCargaActual(double cargaActual) { 
        this.cargaActual = cargaActual; 
    }

    //Metodos
    public boolean evaluarPesoObjeto(double pesoNuevo) {
        return cargaActual + pesoNuevo > cargaMaxima;
    }

    public void engancharDesecho(double pesoNuevo) {
        if (evaluarPesoObjeto(pesoNuevo)) {
            System.out.println("Maniobra abortada: el objeto de " + pesoNuevo + " kg es demasiado pesado");
        } else {
            cargaActual += pesoNuevo;
            System.out.println("Desecho de " + pesoNuevo + " kg enganchado Carga actual: " + cargaActual + " kg");
        }
    }

    public void descargarContenedorBase() {
        cargaActual = 0;
        System.out.println("Contenedor vaciado Carga actual: " + cargaActual + " kg");
    }
}//fin class DronAmbiental
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

