package coding.dojo.maps.cheque.game.converter.dez;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DozeConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "doze";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(12);
    }
}
