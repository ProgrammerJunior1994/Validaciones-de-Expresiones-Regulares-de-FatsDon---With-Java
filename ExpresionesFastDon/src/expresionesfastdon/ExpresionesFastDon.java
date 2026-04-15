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
        int opcExpre = 0;
        int opcDato = 0;
        int opcEC = 0;
        int opcER = 0;
        boolean error = true;
        do {
            try {
                System.out.println("Elige una expresion para validarla");
                System.out.println("1. Verificar la declaracion de Tipos de Datos.");
//                System.out.println("2. Verificar la delcaracion de los Tipos de Datos.");
                System.out.println("2. Verificar la declararion de las Estructuras Condicionales.");
                System.out.println("3. Verificar la delcaracion de las Estructuras de Repeticion.");
                System.out.println("Presiona 0 para salir del programa.");
                opcExpre = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Error: opcion no valida..");
            }
            sc.nextLine();
            switch (opcExpre) {
                // ===== Validacion de tipos de datos =====
                case 1:
                    try {
                        System.out.println("\t===||Prueba de expresiones de FastDon||===");
                        System.out.println("Ingresa una expresion para verificar:");
                        System.out.println("1. Declaracion de una variable Entera (int).");
                        System.out.println("2. Declaracion de una variable de Cadena (String).");
//                        System.out.println("3. Declaracion de una variable Doble (Double).");
//                        System.out.println("4. Declaracion de una variable Flotante (float).");
                        System.out.println("5. Declaracion de una variable Booleana ().");
                        System.out.println("Presiona 0 para salir del programa.");
                        opc = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Opcion no valida..");
                    }
                    sc.nextLine();
                    switch (opc) {
                        case 1:
                            System.out.println("Ingresa la declaracion de una variable entera: ");
                            String entera = sc.nextLine();
                            String varentera = "^\\s*int\\s+(?!(int|if|else|while|for)\\b)[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*-?\\d+)?\\s*;\\s*$";
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
                            String varcadena = "^\\s*String\\s+(?!(String|for|while|do|if|else)\\b)[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*\"[^\"]*\")?\\s*;\\s*$";
                            if (cadena.matches(varcadena)) {
                                System.out.println("Declaracion valida.");
                                error = false;
                            } else {
                                System.out.println("Declaracion invalida.");
                                error = true;
                            }
                            break;
                        case 3:
                            System.out.println("Ingresa la declaracion de una variable doble: ");
                            String doble = sc.nextLine();
                            String varDouble = "^\\s*double\\s+(?!(double|for|while|do|if|else)\\b)[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*-?\\d+(\\.\\d+)?)?\\s*;\\s*$";
                            if (doble.matches(varDouble)) {
                                System.out.println("Declaracion valida.");
                                error = false;
                            } else {
                                System.out.println("Declaracion invalida.");
                                error = true;
                            }
                            break;
                        case 4:
                            System.out.println("Ingresa la declaracion de una variable flotante: ");
                            String flotante = sc.nextLine();
                            String varfloat = "^\\s*float\\s+(?!(float|for|while|do|if|else)\\b)[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*-?\\d+(\\.\\d+)?)?\\s*;\\s*$";
                            if (flotante.matches(varfloat)) {
                                System.out.println("Declaracion valida.");
                                error = false;
                            } else {
                                System.out.println("Declaracion invalida.");
                                error = true;
                            }
                            break;
                        case 5:
                            System.out.println("Ingresa la declaracion de una variable booleana: ");
                            String booleano = sc.nextLine();
                            String varBoolean = "^\\s*boolean\\s+(?!(boolean|for|while|do|if|else)\\b)[a-zA-Z_][a-zA-Z0-9_]*(\\s*=\\s*(true|false))?\\s*;\\s*$";
                            if (booleano.matches(varBoolean)) {
                                System.out.println("Declaracion valida.");
                                error = false;
                            } else {
                                System.out.println("Declaracion invalida.");
                                error = true;
                            }
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
                    break;
                // =========== Verificar las estructuras condicionales ==========
                case 2:
                    try {
                        System.out.println("Ingresa la Estructura condicional a verificar.");
                        System.out.println("1. Estructura condicional if-else.");
                        System.out.println("2. Estructura condicional Switch.");
                        opcEC = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Errro: opcion no valida..");
                    }
                    sc.nextLine();
                    switch (opcEC   ) {
                        case 1:
                            System.out.println("Ingresa una estructura if-else:");
                            String ifElse = sc.nextLine();
                            String varIfElse = "^\\s*if\\s*\\([^)]*\\)\\s*\\{[^}]*\\}\\s*else\\s*\\{[^}]*\\}\\s*$";
                            if (ifElse.matches(varIfElse)){
                                System.out.println("Estructura if-else válida.");
                                error = false;
                            } else {
                                System.out.println("Estructura if-else inválida.");
                                error = true;
                            }
                            break;
                        case 2:
                            System.out.println("Ingresa una estructura switch:");
                            String estructuraSwitch = sc.nextLine();
                            String varSwitch = "^\\s*switch\\s*\\([^)]*\\)\\s*\\{\\s*(case\\s+[^:]+:\\s*[^;]*;\\s*break;\\s*)+\\s*(default:\\s*[^;]*;\\s*)?\\}\\s*$";
                            if (estructuraSwitch.matches(varSwitch)) {
                                System.out.println("Estructura switch válida.");
                                error = false;
                            } else {
                                System.out.println("Estructura switch inválida.");
                                error = true;
                            }
                            break;
                        default:
                            System.out.println("Error: Opcion no valida..");
                            error = true;
                            if(true){
                            
                            }
                            break;
                    }
                    break;
                    // ===== Validar Estructuras de Repeticion =====
                case 3:
                    try {
                        System.out.println("Ingresa al Estructura de Repeticion a verificar.");
                        System.out.println("1. Estructura de Repeticion For.");
                        System.out.println("2. Estructura de Repeticion While.");
                        System.out.println("3. Estructura de Repeticion Do-While.");
                        opcER = sc.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("Error: Opcion no valida..");
                    }
                    sc.nextLine();
                    switch (opcER) {
                        case 1:
                            System.out.println("Ingresa una estructura for:");
                            String forE = sc.nextLine();
                            String varFor = "^\\s*for\\s*\\(\\s*[^;]*;\\s*[^;]*;\\s*[^)]*\\)\\s*\\{[^}]*\\}\\s*$";
                            if (forE.matches(varFor)) {
                                System.out.println("Estructura for válida.");
                                error = false;
                            } else {
                                System.out.println("Estructura for inválida.");
                                error = true;
                            }
                            break;
                        case 2:
                            System.out.println("Ingresa una estructura while:");
                            String whilE = sc.nextLine();
                            String varWhile = "^\\s*while\\s*\\([^)]*\\)\\s*\\{[^}]*\\}\\s*$";
                            if (whilE.matches(varWhile)) {
                                System.out.println("Estructura while válida.");
                                error = false;
                            } else {
                                System.out.println("Estructura while inválida.");
                                error = true;
                            }
                            break;
                        case 3:
                            System.out.println("Ingresa una estructura do-while:");
                            String doWhile = sc.nextLine();
                            String varDoWhile = "^\\s*do\\s*\\{[^}]*\\}\\s*while\\s*\\([^)]*\\)\\s*;\\s*$";
                            if (doWhile.matches(varDoWhile)) {
                                System.out.println("Estructura do-while válida.");
                                error = false;
                            } else {
                                System.out.println("Estructura do-while inválida.");
                                error = true;
                            }
                            break;
                        default:
                            System.out.println("Error: Opcion no valida..");
                            error = true;
                            break;
                    }
                    break;
                default:
                    System.out.println("Error: Opcion no valida...");
                    error = true;
                    break;
            }
        } while (error != false);
    }

}