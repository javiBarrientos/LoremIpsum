package edu.elsmancs.loremipsum.domain;

import static org.junit.Assert.*;
import org.junit.Test;

public class ContadorCantidadTest {

    @Test
    public void contarFrasesTest() {
        ContarCantidad cantidad = new ContarCantidad();

        assertEquals(49, cantidad.ContarFrases());
    }
}
