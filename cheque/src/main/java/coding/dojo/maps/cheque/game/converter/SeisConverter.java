package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class SeisConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "seis";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(6);
    }
}
