/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clubfutbol;

/**
 *
 * @author drmen
 */
public class miembroEquipo {
    
    //Atributos 
  protected String ligaOrigen;
  private int salarioMensual = 0;     

    
  private boolean altaMedica;
  private int minutosJugados;
  
  public miembroEquipo(String ligaOrigen){
      this.ligaOrigen = ligaOrigen;
      this.altaMedica = false;
      this.minutosJugados = 0;
              
      
      
  }//fin del constructor
  
  public void setSalarioMensual(int salarioMensual) {
        this.salarioMensual = salarioMensual;
        if(salarioMensual> 0){
            this.salarioMensual = salarioMensual;
    }else{
            System.out.println("ALERTAAAAA contraro invaliddo");
}

   
}// fin set salarioMEnsual
  
  public void iniciarPreTemporada(){
      System.out.println("Inicio la temporada");
      this.altaMedica =true;
      System.out.println("Se dio el alta Medica");
      realizarPruebasFisicas();
      
  }//fin del set iniciarpreTemporada
  
  private void realizarPruebasFisicas(){
      System.out.println("Realizando pruebas fisicas");
      String[] fases = new String[]
      {"resistencia Fisicas",
       "Fuerza",
       "Velocidad"
      };
              
      for (int i = 0; i < 3; i++) {
          System.out.printf("Aprobando Fase %d:   %s\n ",i+1, fases[i]);
          
      }//fin ciclo for 
  }// fin metodo realizar pruebas 
  
  public void setSumarMinutos( int cantidad){
      if(cantidad>0){
          System.out.println("Sumando minutos al jugador ");
          this.minutosJugados +=cantidad;
      }
  }
  
}