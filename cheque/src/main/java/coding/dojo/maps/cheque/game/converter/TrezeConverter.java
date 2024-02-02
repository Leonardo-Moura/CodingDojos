package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class TrezeConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "treze";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(13);
    }
}
