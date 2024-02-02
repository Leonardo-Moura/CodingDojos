package coding.dojo.maps.cheque.game.converter;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DezenoveConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dezenove";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(19);
    }
}
