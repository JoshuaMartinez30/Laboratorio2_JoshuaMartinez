/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_joshuamartinez;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author joshua
 */
public class Lab2_JoshuaMartinez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        ArrayList casas = new ArrayList();
        int opcion = 0, contador = 0;
        char resp = 's';
        while (opcion != 4) {
            System.out.println("1. Registro de Casas");
            System.out.println("2. Manejo de Estado");
            System.out.println("3. Log in");
            System.out.println("4. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = input.nextInt();
            if (opcion == 1) {
                if (contador == 1) {
                    int opcion2;
                    System.out.println("1. Crear casa");
                    System.out.println("2. Listar casas");
                    System.out.println("3. Modificar");
                    System.out.println("4. Borrar");
                    System.out.print("Ingrese opcion: ");
                    opcion2 = input.nextInt();
                    switch (opcion2) {
                        case 1:
                            int Numero_casa,
                             Numero_bloque,
                             ancho,
                             largo,
                             numero_pisos,
                             numero_baños,
                             numero_cuartos;
                            String comprada,
                             nombre_dueño,
                             estado,
                             ingeniero,
                             color;
                            System.out.print("Ingrese numero de casa: ");
                            Numero_casa = input.nextInt();
                            System.out.print("Ingrese numero de bloque: ");
                            Numero_bloque = input.nextInt();
                            System.out.print("Ingrese el color: ");
                            color = input.next();
                            System.out.print("Ingrese ancho: ");
                            ancho = input.nextInt();
                            System.out.print("Ingrese Largo: ");
                            largo = input.nextInt();
                            System.out.print("Ingrese (si o no) fue comprada: ");
                            comprada = input.next();
                            System.out.print("Ingrese numero de pisos: ");
                            numero_pisos = input.nextInt();
                            System.out.print("Ingrese numero de baños: ");
                            numero_baños = input.nextInt();
                            System.out.print("Ingrese numero de cuartos: ");
                            numero_cuartos = input.nextInt();
                            if (comprada.equalsIgnoreCase("si")) {
                                System.out.print("Ingrese Nombre del dueño: ");
                                nombre_dueño = input.next();
                            } else {
                                nombre_dueño = null;
                            }
                            System.out.print("Ingrese el estado: ");
                            estado = input.next();
                            System.out.print("Ingrese Nombre del ingeniero a cargo: ");
                            ingeniero = input.next();
                            casas.add(new Registro_casas(Numero_casa, Numero_bloque, color, ancho, largo, comprada, numero_pisos, numero_baños, numero_cuartos, nombre_dueño, estado, ingeniero));
                            break;

                        case 2:
                            for (Object t : casas) {
                                if (t instanceof Registro_casas) {
                                    System.out.println(casas.indexOf(t) + ")  " + t);
                                }
                            }
                            break;

                        case 3:
                            for (Object t : casas) {
                                if (t instanceof Registro_casas) {
                                    System.out.println(casas.indexOf(t) + ")  " + t);
                                }
                            }
                            int pos2;
                            System.out.print("Ingrese la posicion de la casa que desee modificar: ");
                            pos2 = input.nextInt();
                            if (casas.get(pos2) instanceof Registro_casas) {
                                int modificar;
                                System.out.print("1. Modificar Numero de casa ");
                                System.out.print("2. Modificar Numero de bloque ");
                                System.out.print("3. Modificar color ");
                                System.out.print("4. Modificar Ancho ");
                                System.out.print("5. Modificar Largo ");
                                System.out.print("6. Modificar (Si o no) fue comprada ");
                                System.out.println("7. Modificar Numero de pisos ");
                                System.out.println("8. Modificar Numero de baños ");
                                System.out.println("9. Modificar Numero de cuartos ");
                                System.out.println("10. Modificar nombre del dueño ");
                                System.out.println("11. Modificar nombre del ingeniero ");
                                modificar = input.nextInt();
                                if (modificar == 1) {
                                    int nuevo_n;
                                    System.out.print("Ingrese nuevo numero de casa: ");
                                    nuevo_n=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setCasa(nuevo_n);
                                }
                                if (modificar == 2) {
                                    int nuevo_b;
                                    System.out.print("Ingrese nuevo numero de bloque: ");
                                    nuevo_b=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setBloque(nuevo_b);
                                }
                                if (modificar == 3) {
                                    String nuevo_c;
                                    System.out.print("Ingrese nuevo color: ");
                                    nuevo_c = input.next();
                                    ((Registro_casas) casas.get(pos2)).setColor(nuevo_c);
                                }
                                if (modificar == 4) {
                                    int nuevo_a;
                                    System.out.print("Ingrese nuevo ancho: ");
                                    nuevo_a=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setAncho(nuevo_a);
                                }
                                if (modificar == 5) {
                                    int nuevo_l;
                                    System.out.print("Ingrese nuevo largo: ");
                                    nuevo_l=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setLargo(nuevo_l);
                                }
                                if (modificar == 6) {
                                    String nuevo_comprada;
                                    System.out.print("Ingrese (si o no) fue comprada ");
                                    nuevo_comprada=input.next();
                                    ((Registro_casas) casas.get(pos2)).setComprada(nuevo_comprada);
                                }
                                if (modificar == 7) {
                                    int nuevo_p;
                                    System.out.print("Ingrese nuevo numero de pisos: ");
                                    nuevo_p=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setPisos(nuevo_p);
                                }
                                if (modificar == 8) {
                                    int nuevo_b;
                                    System.out.print("Ingrese nuevo numero de baños: ");
                                    nuevo_b=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setBaños(nuevo_b);
                                }
                                if (modificar == 9) {
                                    int nuevo_cuartos;
                                    System.out.print("Ingrese nuevo numero de cuartos: ");
                                    nuevo_cuartos=input.nextInt();
                                    ((Registro_casas) casas.get(pos2)).setCuartos(nuevo_cuartos);
                                }
                                if (modificar == 10) {
                                    String nuevo_d;
                                    System.out.print("Ingrese nuevo nombre del dueño: ");
                                    nuevo_d=input.next();
                                    ((Registro_casas) casas.get(pos2)).setNombre(nuevo_d);
                                }
                                if (modificar == 11) {
                                    String nuevo_i;
                                    System.out.print("Ingrese nuevo largo: ");
                                    nuevo_i=input.next();
                                    ((Registro_casas) casas.get(pos2)).setIngeniero(nuevo_i);
                                }
                                
                            }

                            break;

                        case 4:
                            for (Object t : casas) {
                                if (t instanceof Registro_casas) {
                                    System.out.println(casas.indexOf(t) + ")  " + t);
                                }
                            }
                            int pos;
                            System.out.print("Ingrese la posicion de la casa que desea Eliminar: ");
                            pos = input.nextInt();
                            casas.remove(pos);
                            break;
                    }

                } else {
                    System.out.println("Tiene que ingresar primero al log in");
                }
            }
            if (opcion == 2) {
                if (contador == 1) {

                } else {
                    System.out.println("Tiene que ingresar primero al log in");
                }
            }

            if (opcion == 3) {
                contador = 1;
                String Nombre, contraseña;
                System.out.print("Ingrese Nombre usuario: ");
                Nombre = input.next();

                System.out.print("Ingrese contraseña: ");
                contraseña = input.next();
            }
        }
    }

}
