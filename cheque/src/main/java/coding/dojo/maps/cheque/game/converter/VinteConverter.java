package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class VinteConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "vinte";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(20);
    }
}
