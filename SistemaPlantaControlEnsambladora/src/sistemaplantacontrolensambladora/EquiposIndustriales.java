/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemaplantacontrolensambladora;

/**
 *
 * @author drmen
 */
public abstract class EquiposIndustriales {
    //Atributos
    public String NumeroSerie;
    public  boolean estadoOperativo;
    protected int horasUso;
    protected double capacidadCarga;

    
    //Getters y setters
    public String getNumeroSerie() {
        return NumeroSerie;
    }

    public void setNumeroSerie(String NumeroSerie) {
        this.NumeroSerie = NumeroSerie;
    }

    public boolean isEstadoOperativo() {
        return estadoOperativo;
    }

    public void setEstadoOperativo(boolean estadoOperativo) {
        this.estadoOperativo = estadoOperativo;
    }

    public int getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(int horasUso) {
        this.horasUso = horasUso;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }
    
    
    
   //Constructor
    public EquiposIndustriales(String numSerie){
        this.NumeroSerie = numSerie;
    }
    
    public void encender(){
        
    }
    
    
    public void apagar(){
        
    }
    
    public abstract  void  procesaarMaterial();
}// fin clase abstract 
