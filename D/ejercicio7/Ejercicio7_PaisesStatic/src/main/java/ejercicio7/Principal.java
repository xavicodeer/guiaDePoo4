package ejercicio7;

/**
 *
 * @author xavicodeer
 */

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        Paises elSalvador = new Paises();
        Paises guatemala = new Paises();

        System.out.print("Digite el tipo de moneda: ");
        Paises.moneda = teclado.nextLine();

        System.out.println("En El Salvador " + elSalvador.mostrarMoneda() + ".");
        System.out.println("En Guatemala " + guatemala.mostrarMoneda() + ".");
    }
}