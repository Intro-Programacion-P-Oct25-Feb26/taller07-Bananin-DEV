/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema.pkg01;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author UTPL
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        String mensajeF = "";
        String nombre;
        int edad;
        String posicion;
        double estatura;
        int contador = 1;
        int edadT;
        int sumaE = 0;
        double estaturaT;
        double sumaES = 0;
        int limite = 5;

        while (contador <= limite) {

            System.out.println("Ingrese nombre del jugador");
            nombre = entrada.nextLine();

            System.out.println("Ingrese su posición");
            posicion = entrada.nextLine();

            System.out.println("Ingrese su edad");
            edad = entrada.nextInt();

            System.out.println("Ingrese su estatura");
            estatura = entrada.nextDouble();

            sumaE = sumaE + edad;
            sumaES = sumaES + estatura;

            mensajeF = String.format("%s %s - %s -, edad %d, estatura %.2f\n",
                     mensajeF, nombre, posicion, edad, estatura);

            entrada.nextLine();
            contador = contador + 1;

        }

        edadT = sumaE / 5;
        estaturaT = sumaES / 5;

        System.out.printf("Listado de jugadores:\n%s\n"
                + "Promedio total de edades: %d\n"
                + "Promedio total de estatura: %.2f", mensajeF, edadT, estaturaT);
    }
    
}
    
    

