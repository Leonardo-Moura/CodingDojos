package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class QuatroConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "quatro";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(4);
    }
}
