package coding.dojo.maps.cheque.game.converter.dez;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class CatorzeConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "catorze";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(14);
    }
}
