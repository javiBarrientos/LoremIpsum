package edu.elsmancs.loremipsum.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorCantidadTest {

    @Test
    public void contarFrasesTest() {
        ContarCantidad frases = new ContarCantidad();

        assertEquals(59, frases.contarFrases());
    }

    @Test
    public void contarPalabrasTest() {
        ContarCantidad palabras = new ContarCantidad();

        assertEquals(451, palabras.contarPalabras());
    }

    @Test
    public void contarParrafosTest() {
        ContarCantidad parrafo = new ContarCantidad();

        assertEquals(5, parrafo.contarParrafos());
    }

    @Test
    public void contarPalindromosTest() {
        ContarCantidad palindromo = new ContarCantidad();

        assertEquals(8, palindromo.contarPalindromos(palindromo.listarPalabras(palindromo.getLoremIpsum())).size());
    }
}
