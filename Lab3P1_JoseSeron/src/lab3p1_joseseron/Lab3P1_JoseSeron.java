/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab3p1_joseseron;

import java.util.Scanner;

/**
 *
 * @author Jose Seron
 */
public class Lab3P1_JoseSeron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("LABORATORIO 3");

        Scanner input = new Scanner(System.in);
        int opcion = 0;
        boolean bandera = true;

        //ciclo repite MENU PRINCIPAL
        while (bandera) {
            System.out.println("Por favor ingrese la opcion que desesa ejecutar:");
            System.out.println("1--> Sucesionse y mas sucesiones!");
            System.out.println("2--> Pocket Monsters");
            System.out.println("3--> Asterisco en casa!");
            System.out.println("4--> Salir del programa :/");
            opcion = input.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("------------Sucesiones y mas Suceciones------------");

                    System.out.println("Ingrese un numero inicial: ");
                    int numInicial = input.nextInt();
                    System.out.println("Ingrese la diferencia: ");
                    int dif = input.nextInt();
                    System.out.println("Ingrese la cantidad: ");
                    int cant = input.nextInt();
                    int cont = 0;
                

                    System.out.print(numInicial+",");
                    for (int i = numInicial+dif; cont < cant-1; i = i + dif) {

                        if (cont + 2 == cant) {
                            System.out.println(i);
                            break;
                        }
                        System.out.print(i + ",");
                        dif++;
                        cont++;
                    }
                    System.out.println("");

//                    System.out.println("Que numero mas adelante en la sucesion desea ver?");
//                    int num = input.nextInt();
//                    cont = 0;
//
//                    for (int i = numInicial + dif; cont < num - 1; i = i + dif) {
//
//                        if (cont + 2 == num) {
//                            System.out.println(i);
//                            break;
//                        }
//                        System.out.print(i + ",");
//                        dif++;
//                        cont++;
//                    }

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("Saliendo.......");
                    bandera = false;
                    break;
                default:
                    System.out.println("Ingrese una opcion valida");
            }
            System.out.println("");
        } // FIN CICLO MENU PRINCIPAL

    }

}
