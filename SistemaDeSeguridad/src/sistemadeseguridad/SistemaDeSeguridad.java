/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemadeseguridad;

import java.util.Scanner;

/**
 *
 * @author drmen
 */
public class SistemaDeSeguridad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        PuertaSeguridad AccesoDC = new PuertaSeguridad (2026);
        boolean panelEncendido = true;
        int OpcionSeleccion = 0;
        int valorBateria =0;
        
        System.out.println("Terminal de Puerta encendido");
        
        while(panelEncendido){
            System.out.println("Menu de opciones");
            System.out.println("1.Intentar abrir la puerta ");
            System.out.println("2. Cambian codigo pin");
            System.out.println("3. Alternar Estado Emergencia");
            System.out.println("4. Mantenimiento");
            System.out.println("Seleccion");
            OpcionSeleccion =sc.nextInt();
        }
        
        switch(OpcionSeleccion){
            case 1:
                System.out.println("Ingrese codigo");
                int intentoPin = sc.nextInt();
               boolean resultadoIntento = AccesoDC.validarPin(intentoPin);
                   
                    if(AccesoDC.getEstadoBateriaRespaldo() <5){
                        System.out.println("Error de Energia");
                    }
                    else if(AccesoDC.getModoLockDown()){
                        System.out.println("Modo Encierro Activo");
                    }
                    else if(!resultadoIntento){
                        System.out.println("Credencial No Valida");
                        valorBateria = AccesoDC.getEstadoBateriaRespaldo();
                        AccesoDC.setBateriaRespaldo(valorBateria-15);
                               
                    }
                    else {
                        System.out.println("Acceso Concedido!!");
                        valorBateria = AccesoDC.getEstadoBateriaRespaldo();
                        AccesoDC.setBateriaRespaldo(valorBateria-5);
                    }
                 
                    break;
                default:
                    throw new AssertionError();
                
        
    }
        
    }//fin del main
    
}//fin del codigo   
