package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class DoisConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dois";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(2);
    }
}
