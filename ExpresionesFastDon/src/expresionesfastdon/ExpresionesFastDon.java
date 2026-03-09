/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package expresionesfastdon;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author br340
 */
public class ExpresionesFastDon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int opc = 0;
        boolean error = true;
        do {
            try{
            System.out.println("\t===||Prueba de expresiones de FastDon||===");
            System.out.println("Ingresa una expresion para verificar:");
            System.out.println("1. Declaracion de una variable entera (int).");
            System.out.println("2. Declaracion de una variable de cadena (String).");
            System.out.println("3. Declaracion de una variable doble (Double).");
            System.out.println("4. Declaracion de una variable flotante (float).");
            System.out.println("4. Declaracion de una variable flotante ().");
            System.out.println("Presiona 0 para salir del programa.");
            opc = sc.nextInt();
            }catch(InputMismatchException e){
                System.out.println("Error: Opcion no valida..");
            }
            sc.nextLine();
            switch (opc) {
                case 1:
                    System.out.println("Ingresa la declaracion de una variable entera: ");
                    String entera = sc.nextLine();
                    String varentera = "^int\\s+[a-zA-Z0-9_]*\\s*(=\\s*\\d+)?\\s*;$";
                    if (entera.matches(varentera)) {
                        System.out.println("Declaracion valida.");
                        error = false;
                    } else {
                        System.out.println("Declaracion invalida.");
                        error = true;
                    }
                    break;
                case 2:
                    System.out.println("Ingresa la declaracion de una variable de cadena: ");
                    String cadena = sc.nextLine();
                    String varcadena = "^\\s*String\\s+[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*\"[^\"]*\")?\\s*;\\s*$";
                    if (cadena.matches(varcadena)) {
                        System.out.println("Declaracion valida.");
                        error = false;
                    } else {
                        System.out.println("Declaracion invalida.");
                        error = false;
                    } 
                    break;
                case 3:
                    System.out.println("Ingresa la declaracion de una variable doble: ");
                    String doble = sc.nextLine();
                    error = false;
                    break;
                case 4:
                    System.out.println("Ingresa la declaracion de una variable flotante: ");
                    String flotante = sc.nextLine();
                    String varfloat = "^\\s*\\s+[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*\"*\")?\\s*;\\s*$";
                    if (flotante.matches(varfloat)) {
                        System.out.println("Declaracion valida.");
                        error = false;
                    } else {
                        System.out.println("Declaracion invalida.");
                        error = false;
                    }
                    error = false;
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    error = false;
                    break;
                default:
                    System.out.println("Opcion no contenida en el menu..");
                    error = true;
                    break;
            }
        } while (error != false);
    }

}
