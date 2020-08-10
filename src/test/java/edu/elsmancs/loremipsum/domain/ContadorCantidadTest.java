package edu.elsmancs.loremipsum.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorCantidadTest {

    @Test
    public void contarFrasesTest() {
        ContarCantidad frases = new ContarCantidad();

        assertEquals(49, frases.ContarFrases());
    }

    @Test
    public void contarPalabrasTest() {
        ContarCantidad palabras = new ContarCantidad();

        assertEquals(414, palabras.ContarPalabras());
    }

    @Test
    public void ContarParrafos() {
        ContarCantidad parrafo = new ContarCantidad();

        assertEquals(5, parrafo.ContarParrafos());
    }

    @Test
    public void ContarPalindromos() {
        ContarCantidad palindromo = new ContarCantidad();

        assertEquals(10, palindromo.contarPalindromos(palindromo.getLoremIpsum()));
    }
}
