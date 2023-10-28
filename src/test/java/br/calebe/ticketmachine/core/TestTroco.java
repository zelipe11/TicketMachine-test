package br.calebe.ticketmachine.core;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

public class TestTroco {

    private Troco troco;

    @Before
    public void setUp() {
        troco = new Troco(187);
    }

    @Test
    public void testTrocoInitialization() {
        PapelMoeda[] papeis = troco.papeisMoeda;

        for (PapelMoeda papel : papeis) {
            assertEquals(1, papel.getQuantidade());
        }
    }

    @Test
    public void testTrocoIterator() {
        Iterator<PapelMoeda> iterator = troco.getIterator();

        assertPapelMoeda(iterator, 100);
        assertPapelMoeda(iterator, 50);
        assertPapelMoeda(iterator, 20);
        assertPapelMoeda(iterator, 10);
        assertPapelMoeda(iterator, 5);
        assertPapelMoeda(iterator, 2);

        assertFalse(iterator.hasNext());
    }

    private void assertPapelMoeda(Iterator<PapelMoeda> iterator, int expectedValue) {
        assertTrue(iterator.hasNext());
        assertEquals(expectedValue, iterator.next().getValor());
    }
}
