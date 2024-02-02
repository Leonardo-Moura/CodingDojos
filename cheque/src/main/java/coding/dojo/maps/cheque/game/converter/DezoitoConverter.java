package coding.dojo.maps.cheque.game.converter;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;

public class DezoitoConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "dezoito";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(18);
    }
}
