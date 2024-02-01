package coding.dojo.maps.cheque.game.converter;

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
