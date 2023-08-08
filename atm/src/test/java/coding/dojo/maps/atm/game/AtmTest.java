package coding.dojo.maps.atm.game;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AtmTest {

    @Test
    void retornaUmaNotaDe50ParaUmPedidoDe50() {
        Atm atm = new Atm();

        List<Nota> notas = atm.sacar(50);

        assertEquals(1, notas.size());
        assertEquals(50, notas.get(0).getValor());
    }

    @Test
    void retornaDuasNotasDe50ParaUmPedididoDe100() {
        Atm atm = new Atm();

        List<Nota> notas = atm.sacar(100);

        assertEquals(2, notas.size());
        assertEquals(50, notas.get(0).getValor());
        assertEquals(50, notas.get(1).getValor());
    }

    @Test
    void retornaDuasNotasDe20ParaUmPedididoDe40() {
        Atm atm = new Atm();

        List<Nota> notas = atm.sacar(40);

        assertEquals(2, notas.size());
        assertEquals(20, notas.get(0).getValor());
        assertEquals(20, notas.get(1).getValor());
    }

}