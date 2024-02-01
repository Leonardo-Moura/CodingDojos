package coding.dojo.maps.cheque.game.converter.dez;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DezenoveConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "sete";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(7);
    }
}
