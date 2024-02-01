package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class NoveConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "nove";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(9);
    }
}
