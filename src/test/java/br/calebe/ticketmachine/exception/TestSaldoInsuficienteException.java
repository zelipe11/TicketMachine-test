package br.calebe.ticketmachine.exception;

import org.junit.Test;

public class TestSaldoInsuficienteException {

    @Test(expected = SaldoInsuficienteException.class)
    public void testConstrutor() throws SaldoInsuficienteException {
        throw new SaldoInsuficienteException();
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testConstrutorException() throws SaldoInsuficienteException {
        throw new SaldoInsuficienteException();
    }
}