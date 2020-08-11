package edu.elsmancs.loremipsum;

import edu.elsmancs.loremipsum.domain.ContarCantidad;

public class Main {
    private static ContarCantidad contar;

    public static void main(String[] args) {
        System.out
                .println("###" + " Parrafos " + "###");
        System.out.println("Cantidad de parrafos: " + contar.contarParrafos() + "\n");

        System.out
                .println("###" + " Palindromos " + "###");
        System.out.println("Palabras palindromas: " + contar.contarPalindromos(contar.getLoremIpsum()));

        System.out.println("Cantidad: " + contar.contarPalindromos(contar.getLoremIpsum()).size() + "\n");

        System.out
                .println("###" + " Ordenar " + "###");
        System.out.println(contar.listarPalabrasRepetidas(contar.getLoremIpsum()) + "\n");

        System.out
                .println("###" + " Ordenar mas repetidas " + "###");
        System.out.println(contar.palabrasMasRepetidas(contar.listarPalabrasRepetidas(contar.getLoremIpsum())) + "\n");
    }
}
