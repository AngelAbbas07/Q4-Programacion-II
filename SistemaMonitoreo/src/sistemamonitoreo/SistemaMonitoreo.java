/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemamonitoreo;

import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author drmen
 */
public class SistemaMonitoreo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        SensorAmbiental prueba = new SensorAmbiental("AA: BB: CC: DD:", 100, 0, true);
        boolean cicloActivo = true;
        char seleccionMenu = 'a';
        
        while(cicloActivo){
            System.out.println("Menu de Control");
            System.out.println("1. Ingresar nueva Lectura Termica ");
            System.out.println("2. Actualizar lectura del higrometro");
            System.out.println("3. Solicitud de diagnostico Completo  ");
            System.out.println("4. Inicio de Secuencia de Apagado");
            System.out.println("Seleccion:  ");
            seleccionMenu = sc.next().charAt(0);
            
            switch (seleccionMenu){
                case '1':
                    System.out.println("Nueva lectura termica:");
                    double nuevaTemp= sc.nextDouble();
                    prueba.setTemperatura(nuevaTemp);
                    break;
                case '2':
                    int nuevaHR = sc.nextInt();
                    prueba.seHumedadRelativa(nuevaHR);
                    break;
                case '3':
                    prueba.reporteEstado();
                    break;
                case '4':
                    cicloActivo = false;
                    System.out.println("Cerrando cerrando");
                    System.out.println("Ya casi ");
                    System.out.println("Hasta luego");
                    break;
                default:
                    System.out.println("Eyyyy compaaaaa es del 1 al 4");
                    System.out.println("Esa opcion no existe");
                             
            }
                
        }//Fin del while 
        
    }//Fin del main 
    
}//Fin de codigo 
