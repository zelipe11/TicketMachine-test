package br.calebe.ticketmachine.core;

import org.junit.Before;
import org.junit.Test;

import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;

import static org.junit.Assert.*;

public class TestTicketMachine {

    private TicketMachine ticketMachine;

    @Before
    public void setUp() {
        ticketMachine = new TicketMachine(10);
    }

    @Test
    public void testSaldoCorretoAposInserirValor() {
        int valorInserido = 20;
        
        try {
			ticketMachine.inserir(valorInserido);
		} 
        catch (PapelMoedaInvalidaException e) {
			e.printStackTrace();
		}
        
        assertEquals(valorInserido, ticketMachine.getSaldo());
    }

    @Test
    public void testImprimirBilheteComSaldoSuficiente() throws SaldoInsuficienteException {
        int valorInserido = 20;
        try {
			ticketMachine.inserir(valorInserido);
		} 
        catch (PapelMoedaInvalidaException e) {
			e.printStackTrace();
		}
       
        String bilhete = ticketMachine.imprimir();
        assertTrue(bilhete.contains("R$ 20,00"));
    }

    @Test(expected = SaldoInsuficienteException.class)
    public void testNaoDeveImprimirBilheteComSaldoInsuficiente() throws SaldoInsuficienteException {
        int valorInserido = 5;
        try {
			ticketMachine.inserir(valorInserido);
		} 
        catch (PapelMoedaInvalidaException e) {
			e.printStackTrace();
		}
        
        ticketMachine.imprimir();
    }
}
