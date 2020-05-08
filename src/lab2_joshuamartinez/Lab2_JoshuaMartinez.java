/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_joshuamartinez;

import java.awt.Color;
import java.util.ArrayList;
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
                            System.out.println("Registro exitoso");
                            break;

                        case 2:
                            for (Object t : casas) {
                                if (t instanceof Registro_casas) {
                                    System.out.println(casas.indexOf(t) + ")  " + t);
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
                            System.out.println("Registro exitoso");
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
