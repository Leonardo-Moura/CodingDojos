package coding.dojo.maps.cheque.game.converter;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class OnzeConverter implements NumeroConverter {
    @Override
    public String porExtenso() {
        return "onze";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(11);
    }
}
