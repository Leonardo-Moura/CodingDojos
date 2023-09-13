package coding.dojo.maps.cheque.game;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RequiredArgsConstructor
public class Cheque {

    private final BigDecimal valor;

    public String porExtenso() {
        String valorTexto = " real";
        if (BigDecimal.ONE.equals(valor)) {
            valorTexto = "um" + valorTexto;
        }

        return valorTexto;
    }
}
