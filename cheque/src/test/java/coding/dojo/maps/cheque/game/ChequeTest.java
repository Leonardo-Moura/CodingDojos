package coding.dojo.maps.cheque.game;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


class ChequeTest {

    @Test
    void retornaUmPara1() {
        Cheque machine = new Cheque(BigDecimal.ONE);

        String valorTexto = machine.porExtenso();

        assertEquals("um real", valorTexto);
    }

    @Test
    void validaReaisPorExtensoUmANove() {
        Map<BigDecimal, String> valores = Map.of(
                new BigDecimal("1"), "um real",
                new BigDecimal("2"), "dois reais",
                new BigDecimal("3"), "três reais",
                new BigDecimal("4"), "quatro reais",
                new BigDecimal("5"), "cinco reais",
                new BigDecimal("6"), "seis reais",
                new BigDecimal("7"), "sete reais",
                new BigDecimal("8"), "oito reais",
                new BigDecimal("9"), "nove reais"
        );

        for (Map.Entry<BigDecimal, String> valor : valores.entrySet()) {
            Cheque cheque = new Cheque(valor.getKey());

            assertEquals(valor.getValue(), cheque.porExtenso());
        }
    }

    @Test
    void validaReaisPorExtensoDezADezenove() {
        Map<BigDecimal, String> valores = Map.of(
                new BigDecimal("10"), "dez reais",
                new BigDecimal("11"), "onze reais",
                new BigDecimal("12"), "doze reais",
                new BigDecimal("13"), "treze reais",
                new BigDecimal("14"), "catorze reais",
                new BigDecimal("15"), "quinze reais",
                new BigDecimal("16"), "dezesseis reais",
                new BigDecimal("17"), "dezessete reais",
                new BigDecimal("18"), "dezoito reais",
                new BigDecimal("19"), "dezenove reais"
        );

        for (Map.Entry<BigDecimal, String> valor : valores.entrySet()) {
            Cheque cheque = new Cheque(valor.getKey());

            assertEquals(valor.getValue(), cheque.porExtenso());
        }
    }

    @Test
    void validaReaisPorExtensoVinteAVinteNove() {

    }
}
