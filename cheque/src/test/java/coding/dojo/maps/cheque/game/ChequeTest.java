package coding.dojo.maps.cheque.game;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class ChequeTest {

    @Test
    void retornaUmPara1() {
        ChequeMachine machine = new ChequeMachine();
        BigDecimal valorNumerico = BigDecimal.valueOf(1);

        String valorTexto = machine.convert(valorNumerico);

        assertEquals("um real", valorTexto);
    }

    void validaReaisPorExtenso() {

    }
}
