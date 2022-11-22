package com.sofka;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int opcion;

        do {
            System.out.println("\nElija una opción:\n" +
                    "1 - Ingresar al parqueadero\n" +
                    "2 - Ver todos los Vehiculos\n" +
                    "3 - Buscar Vehiculo\n" +
                    "4 - Retirar Vehiculo\n" +
                    "5 - Salir\n");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    ingresar();
                    break;
                case 2:
                    vertodos();
                    break;
                case 3:
                    buscar();
                    break;
                case 4:
                    retirar();
                    break;
            }
        } while (opcion != 5);
    }

    static List<Vehiculo> parqueados = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);

    /*Utilizamos 2 scanner, uno para variables string y
    otro para varaibles int, esto por que al utilizar el
    mismo scaner para diferentes tipos de variable en la
    misma instancia genera que solo se reconozca 1 tipo de variable*/
    static Scanner entrada1 = new Scanner(System.in);


    static void ingresar() {

        if (parqueados.size() < 5) {

            System.out.println("Ingrese su nombre completo:");
            String nombre = entrada1.nextLine();
            System.out.println("Ingrese la marca del vehículo:");
            String marca = entrada1.nextLine();
            System.out.println("Ingrese su teléfono:");
            int telefono = entrada.nextInt();
            System.out.println("Ingrese la placa del vehículo:");
            int placa = entrada.nextInt();

            parqueados.add(new Vehiculo(nombre, marca, telefono, placa));

            System.out.println("\nSu vehículo ha sido ingresado al parqueadero.");
        } else {
            System.out.println("Maximo de vehiculos 5!");
        }
    }

    static void vertodos() {
        for (int n = 0; n < parqueados.size(); n++) {
            System.out.println("Vehiculo " + (n + 1) + " - " + parqueados.get(n));
        }
    }

    static void buscar() {
        boolean found = false;
        System.out.println("Cual es la placa del vehiculo?: ");
        int placa = entrada.nextInt();
        Iterator<Vehiculo> i = parqueados.iterator();
        while (i.hasNext()) {
            Vehiculo e = i.next();
            if (e.getPlaca() == placa) {
                System.out.println(e);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No encontrado");
        }
    }

    static void retirar() {
        boolean found = false;
        System.out.println("Cual es la placa del vehiculo a eliminar: ");
        int placa = entrada.nextInt();
        Iterator<Vehiculo> i = parqueados.iterator();
        while (i.hasNext()) {
            Vehiculo e = i.next();
            if (e.getPlaca() == placa) {
                i.remove();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No encontrado");
        } else {
            System.out.println("El vehiculo fue Retirado");
        }
    }
}