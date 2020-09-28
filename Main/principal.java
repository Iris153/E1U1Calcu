package main;

import java.util.Scanner;
import main.Logica.Operaciones;

public class principal extends Operaciones {

    public static void main(String[] args) {
        int opc;
        int o;

        Scanner leer = new Scanner(System.in);

        do {
            System.out.println("");
            System.out.println("-- Calculadora --");
            System.out.println("");
            System.out.println("Elije una opcion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");

            opc = leer.nextInt();
            Operaciones objOperaciones = new Operaciones();

            switch (opc) {
                case 1:
                    System.out.println("Suma");
                    System.out.println("");
                    objOperaciones.Suma(opc);
                    System.out.println("Desea realizar otra cosa?");
                    System.out.println("1.- SI 2.-NO");
                    o = leer.nextInt();

                    break;
                case 2:
                    System.out.println("Resta");
                    System.out.println("");
                    objOperaciones.Resta(opc);
                    System.out.println("Desea realizar otra cosa?");
                    System.out.println("1.- SI 2.-NO");
                    o = leer.nextInt();
                    break;
                case 3:
                    System.out.println("Multiplicacion");
                    System.out.println("");
                    objOperaciones.Multiplicacion(opc);
                    System.out.println("Desea realizar otra cosa?");
                    System.out.println("1.- SI 2.-NO");
                    o = leer.nextInt();
                    break;
                case 4:
                    System.out.println("Division");
                    System.out.println("");
                    objOperaciones.Division(opc);
                    System.out.println("Desea realizar otra cosa?");
                    System.out.println("1.- SI 2.-NO");
                    o = leer.nextInt();
                    break;
                case 5:
            boolean salir = true;
                    System.out.println("Usted ha salido");
                    break;
                default:
                    System.out.println("Opciones no validas");
                    break;
                
            }

        } while (opc != 5);

    }

}
