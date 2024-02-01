package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class OitoConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "oito";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(8);
    }
}
