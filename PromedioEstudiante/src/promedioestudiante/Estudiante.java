/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package promedioestudiante;

import java.util.Scanner;


/**
 *
 * @author drmen
 */
public class Estudiante {
    
    //Instancias
     int nota1 =0;
        int nota2 =0;
        int nota3= 0;
        double promedio =0;
        String nombre ="";
        
        public Estudiante(){
            
        }
        
        public  int IngresoNota(Scanner scan, String numNota){
    int NotaTemporal =0;
    
    System.out.printf("Ingresa la %s nota: ",numNota);
        NotaTemporal = scan.nextInt();
        
        NotaTemporal = ValidarNota(NotaTemporal, 0,100);
        
        return NotaTemporal;
    }
        
        public  int ValidarNota(int nota, int limINF, int limSUP){
        Scanner scan = new Scanner(System.in);
        do{
            if(nota<limINF || nota>limSUP){
                System.out.println("Nota Fuera de rango");
                System.out.printf("Limites  son %d - %d \n",limINF,limSUP);
                System.out.println("Ingrese nuevamente la nota");
                System.out.println("Nota:");
                nota=  scan.nextInt();
                
    
            }
         }while(nota<limINF || nota>limSUP);
        return nota;
    }
        
        public  double CalculoPromedio(int n1, int n2, int n3){
        double valorTemporal =0;
        
        valorTemporal = (n1+n2+n3)/3;
        return valorTemporal;
    }
}//Fin class estudiante 
