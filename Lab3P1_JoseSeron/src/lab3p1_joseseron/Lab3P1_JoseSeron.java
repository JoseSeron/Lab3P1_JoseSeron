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

                    System.out.print(numInicial + ",");
                    for (int i = numInicial + dif; cont < cant - 1; i = i + dif) {

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
                    System.out.println("-------POCKET MONSTERS-------");

                    double vidaSyl = 280;
                    double ataqueSyl = 80;
                    double defenSyl = 0.15;
                    double vidaGya = 300;
                    double ataqueGya = 50;
                    double defenGya = 0.10;
                    double vidaDra = 250;
                    double ataqueDra = 70;
                    double defenDra = 0.20;
                    double vidaGir = 300;
                    double ataqueGir = 70;
                    double defenGir = 0.25;

                    System.out.println("Ingrese que modo de pelea pokemon desea: ");
                    System.out.println("1--> Hasta la muerte");
                    System.out.println("2--> Por rondas");
                    int modoPelea = input.nextInt();

                    switch (modoPelea) {
                        case 1:
                            System.out.println("Estadisticas de los pokemones: ");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Dragonite Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Giratina Vida:250 Ataque:75 Defensa:20%");

                            System.out.println("Ingrese la pelea determinada:");
                            System.out.println("1--> Sylveon vrs Dragonite");
                            System.out.println("2--> Gyarados vrse Giratina");
                            System.out.println("3--> Dragonite vrs Giratina");
                            System.out.println("4--> Giratina vrs Sylveon");
                            int pelea = input.nextInt();

                            switch (pelea) {
                                case 1: // syl dra

                                    for (int i = 1; i < 999; i++) {
                                        while (vidaSyl > 0 && vidaDra > 0) {

                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaSyl);
                                            System.out.println("Vida de pokemon 2: " + vidaDra);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaSyl = (vidaSyl - (ataqueDra * (1 - defenSyl)));
                                            vidaDra = (vidaDra - (ataqueSyl * (1 - defenDra)));
                                            if (vidaSyl <= 0) {
                                                vidaSyl = 0;
                                            } else if (vidaDra <= 0) {
                                                vidaDra = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaSyl);
                                            System.out.println("Vida de Pokemon 2: " + vidaDra);
                                            System.out.println("");

                                            if (vidaSyl == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaDra == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;

                                    }
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                case 2: //gya gir

                                    for (int i = 1; i < 999; i++) {
                                        while (vidaGya > 0 && vidaGir > 0) {

                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaGya);
                                            System.out.println("Vida de pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaGya = (vidaGya - (ataqueGir * (1 - defenGya)));
                                            vidaGir = (vidaGir - (ataqueGya * (1 - defenGir)));
                                            if (vidaGya <= 0) {
                                                vidaGya = 0;
                                            } else if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaGya);
                                            System.out.println("Vida de Pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            if (vidaGya == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("");
                                    System.out.println("");
                                    break;
                                case 3: //dra gir

                                    for (int i = 1; i < 999; i++) {
                                        while (vidaDra > 0 && vidaGir > 0) {

                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaDra);
                                            System.out.println("Vida de pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaDra = (vidaDra - (ataqueGir * (1 - defenDra)));
                                            vidaGir = (vidaGir - (ataqueDra * (1 - defenGir)));
                                            if (vidaDra <= 0) {
                                                vidaDra = 0;
                                            } else if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaDra);
                                            System.out.println("Vida de Pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            if (vidaDra == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                case 4: //gir syl

                                    for (int i = 1; i < 999; i++) {
                                        while (vidaGir > 0 && vidaSyl > 0) {

                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaGir);
                                            System.out.println("Vida de pokemon 2: " + vidaSyl);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaGir = (vidaGir - (defenSyl * (1 - ataqueGir)));
                                            vidaSyl = (vidaSyl - (defenGir * (1 - ataqueSyl)));
                                            if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            } else if (vidaSyl <= 0) {
                                                vidaSyl = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaGir);
                                            System.out.println("Vida de Pokemon 2: " + vidaSyl);
                                            System.out.println("");

                                            if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaSyl == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                            break;
                        case 2: { //rondas

                            System.out.println("Estadisticas de los pokemones: ");
                            System.out.println("Sylveon Vida:280 Ataque:80 Defensa:15%");
                            System.out.println("Gyarados Vida:300 Ataque:50 Defensa:10%");
                            System.out.println("Dragonite Vida:300 Ataque:70 Defensa:25%");
                            System.out.println("Giratina Vida:250 Ataque:75 Defensa:20%");

                            System.out.println("Ingrese la pelea determinada:");
                            System.out.println("1--> Sylveon vrs Dragonite");
                            System.out.println("2--> Gyarados vrse Giratina");
                            System.out.println("3--> Dragonite vrs Giratina");
                            System.out.println("4--> Giratina vrs Sylveon");
                            int pelea1 = input.nextInt();

                            int cantRondas = 0;
                            do {
                                System.out.println("Ingrese la cantidad de rondas que deseas jugar(menor a 10): ");
                                cantRondas = input.nextInt();
                            } while (cantRondas >= 10 || cantRondas < 0);

                            switch (pelea1) {
                                case 1: // syl dra

                                    for (int i = 1; i <= cantRondas; i++) {
                                        while (vidaSyl > 0 && vidaDra > 0) {
                                            if (i == cantRondas + 1) {
                                                break;
                                            }
                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaSyl);
                                            System.out.println("Vida de pokemon 2: " + vidaDra);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaSyl = (vidaSyl - (ataqueDra * (1 - defenSyl)));
                                            vidaDra = (vidaDra - (ataqueSyl * (1 - defenDra)));
                                            if (vidaSyl <= 0) {
                                                vidaSyl = 0;
                                            } else if (vidaDra <= 0) {
                                                vidaDra = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaSyl);
                                            System.out.println("Vida de Pokemon 2: " + vidaDra);
                                            System.out.println("");

                                            if (vidaSyl == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaDra == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("Se llego al limite de rondas");
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                case 2: //gya gir

                                    for (int i = 1; i < cantRondas; i++) {
                                        while (vidaGya > 0 && vidaGir > 0) {
                                            if (i == cantRondas + 1) {
                                                break;
                                            }
                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaGya);
                                            System.out.println("Vida de pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaGya = (vidaGya - (ataqueGir * (1 - defenGya)));
                                            vidaGir = (vidaGir - (ataqueGya * (1 - defenGir)));
                                            if (vidaGya <= 0) {
                                                vidaGya = 0;
                                            } else if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaGya);
                                            System.out.println("Vida de Pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            if (vidaGya == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("Se llego al limite de rondas");
                                    System.out.println("");
                                    System.out.println("");
                                    break;
                                case 3: //dra gir

                                    for (int i = 1; i < cantRondas; i++) {
                                        while (vidaDra > 0 && vidaGir > 0) {
                                            if (i == cantRondas + 1) {

                                                break;
                                            }
                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaDra);
                                            System.out.println("Vida de pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaDra = (vidaDra - (ataqueGir * (1 - defenDra)));
                                            vidaGir = (vidaGir - (ataqueDra * (1 - defenGir)));
                                            if (vidaDra <= 0) {
                                                vidaDra = 0;
                                            } else if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaDra);
                                            System.out.println("Vida de Pokemon 2: " + vidaGir);
                                            System.out.println("");

                                            if (vidaDra == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("Se llego al limite de rondas");
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                case 4: //gir syl

                                    for (int i = 1; i < cantRondas; i++) {
                                        while (vidaGir > 0 && vidaSyl > 0) {
                                            if (i == cantRondas + 1) {
                                                break;
                                            }
                                            System.out.println("----------Ronda " + i + "----------");
                                            System.out.println("Vida de pokemon 1: " + vidaGir);
                                            System.out.println("Vida de pokemon 2: " + vidaSyl);
                                            System.out.println("");

                                            System.out.println("Pokemon 1 ha atacado!");
                                            System.out.println("Pokemon 2 ha atacado!");
                                            System.out.println("");
                                            vidaGir = (vidaGir - (defenSyl * (1 - ataqueGir)));
                                            vidaSyl = (vidaSyl - (defenGir * (1 - ataqueSyl)));
                                            if (vidaGir <= 0) {
                                                vidaGir = 0;
                                            } else if (vidaSyl <= 0) {
                                                vidaSyl = 0;
                                            }
                                            System.out.println("Vida de pokemon 1: " + vidaGir);
                                            System.out.println("Vida de Pokemon 2: " + vidaSyl);
                                            System.out.println("");

                                            if (vidaGir == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 2 es el Ganador!");

                                            } else if (vidaSyl == 0.0) {
                                                System.out.println("********Fin de la Batalla********");
                                                System.out.println("Pokemon 1 es el Ganador!");
                                            }
                                            i++;
                                        }
                                        break;
                                    }
                                    System.out.println("Se llego al limite de rondas");
                                    System.out.println("");
                                    System.out.println("");

                                    break;
                                default:
                                    System.out.println("Opcion no valida");
                            }
                        }
                            break;
                    
                        case 3:
                            System.out.println("Figura");
                            System.out.println("Ingresa un numero mayor a 6 e impar: ");
                            int tamano = input.nextInt();
                            if (tamano > 6 && tamano % 2 == 1) {
                                for (int i = 0; i < tamano; i++) {
                                    for (int j = 0; j < tamano; j++) {
                                        if (i == 0 || i == tamano - 1 || j == 0 || j == tamano - 1) {
                                            System.out.print("* ");
                                        } else if (j == tamano / 2) {
                                            System.out.print("| ");
                                        } else if (i == j || i == tamano - 1 - j) {
                                            System.out.print("> ");
                                        } else {
                                            System.out.print("  ");
                                        }
                                    }
                                    System.out.println();
                                }
                            } else {
                                System.out.println("El número debe ser mayor a 6 e impar.");
                            }
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
}
