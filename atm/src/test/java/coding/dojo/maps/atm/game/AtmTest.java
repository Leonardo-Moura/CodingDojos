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

    }

}