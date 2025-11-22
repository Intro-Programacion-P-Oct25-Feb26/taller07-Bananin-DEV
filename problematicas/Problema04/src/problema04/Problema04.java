/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;
import java.util.Scanner;
import java.util.Locale;

/**
 *
 * @author UTPL
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
         entrada.useLocale(Locale.US);
       int denominador = 1;
        int signo = 1;
        double incremento = 0;
        int limite = 15;
        String mensaje = "";

        while (denominador <= limite) {
            double termino = signo * (1.0 / denominador);
            incremento = incremento + termino;

            if (signo == 1 && denominador == 1) {
                mensaje = String.format("%s1", mensaje);
            } else if (signo == 1) {
                mensaje = String.format("%s + 1/%d", mensaje, denominador);
            } else {
                mensaje = String.format("%s - 1/%d", mensaje, denominador);
            }

            signo = signo * -1;
            denominador = denominador + 2;
        }

        System.out.printf("%s\n", mensaje);
        System.out.printf("Resultado = %.6f\n", incremento);
    }
}
