package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class DezConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dez";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(10);
    }
}
