package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class CincoConverter implements NumeroConverter {

    @Override
    public String porExtenso() {
        return "cinco";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(5);
    }
}
