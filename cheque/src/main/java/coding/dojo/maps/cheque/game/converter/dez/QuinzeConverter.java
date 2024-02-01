package coding.dojo.maps.cheque.game.converter.dez;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class QuinzeConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "quinze";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(15);
    }
}
