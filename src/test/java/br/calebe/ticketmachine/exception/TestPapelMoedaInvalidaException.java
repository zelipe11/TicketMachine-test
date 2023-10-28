package br.calebe.ticketmachine.exception;

import org.junit.Test;

public class TestPapelMoedaInvalidaException {

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testConstrutor() throws PapelMoedaInvalidaException {
        throw new PapelMoedaInvalidaException();
    }

    @Test(expected = PapelMoedaInvalidaException.class)
    public void testConstrutorException() throws PapelMoedaInvalidaException {
        throw new PapelMoedaInvalidaException();
    }
}
