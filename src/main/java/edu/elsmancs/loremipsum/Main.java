package edu.elsmancs.loremipsum;

import edu.elsmancs.loremipsum.repository.ContarCantidad;

public class Main {
    private static ContarCantidad contar;

    public static void main(String[] args) {
        System.out.println("###" + " Frases " + "###");
        System.out.println("Cantidad de parrafos: " + contar.contarFrases() + "\n");

        System.out.println("###" + " Palabras " + "###");
        System.out.println("Cantidad de parrafos: " + contar.contarPalabras() + "\n");

        System.out.println("###" + " Parrafos " + "###");
        System.out.println("Cantidad de parrafos: " + contar.contarParrafos() + "\n");

        System.out.println("###" + " Palindromos " + "###");
        System.out.println("Palabras palindromas: " + contar.contarPalindromos(contar.listarPalabras(contar.getLoremIpsum())));

        System.out.println("Cantidad: " + contar.contarPalindromos(contar.listarPalabras(contar.getLoremIpsum())).size() + "\n");

        System.out.println("###" + " Palabras mas repetidas " + "###");
        System.out.println(contar.palabrasMasRepetidas(contar.listarPalabras(contar.getLoremIpsum())) + "\n");

        System.out.println("###" + " Tuplas mas repetidas " + "###");
        System.out.println(contar.tuplasMasRepetidas(contar.listarPalabras(contar.getLoremIpsum())) + "\n");
    }
}
