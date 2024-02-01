package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class SeteConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "sete";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(7);
    }
}
