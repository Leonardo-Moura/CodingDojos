package coding.dojo.maps.cheque.game.converter;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DezeseisConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dezesseis";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(16);
    }
}
