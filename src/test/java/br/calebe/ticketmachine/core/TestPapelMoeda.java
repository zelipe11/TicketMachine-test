package br.calebe.ticketmachine.core;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestPapelMoeda {

    @Test
    public void testQuantidadeNoConstrutor() {
        int quantidadeEsperada = 8;
        PapelMoeda papelMoeda = new PapelMoeda(5, quantidadeEsperada);
        assertEquals(quantidadeEsperada, papelMoeda.getQuantidade());
    }  
    
    @Test
    public void testValorNoConstrutor() {
        int valorEsperado = 20;
        PapelMoeda papelMoeda = new PapelMoeda(valorEsperado, 15);
        assertEquals(valorEsperado, papelMoeda.getValor());
    }
}
