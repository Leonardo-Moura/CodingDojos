package coding.dojo.maps.cheque.game.converter.dez;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class UmConverter implements NumeroConverter {
    @Override
    public String porExtenso() {
        return "um";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.ONE;
    }
}
