package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class TresConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "três";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(3);
    }
}
