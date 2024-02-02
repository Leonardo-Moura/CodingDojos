package coding.dojo.maps.cheque.game.converter;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DezesseteConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dezessete";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(17);
    }
}
