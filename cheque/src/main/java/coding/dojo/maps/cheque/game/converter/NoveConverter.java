package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public class NoveConverter implements NumeroConverter {

    @Override
    public String porExtenso(BigDecimal valor) {
        if(valor.equals(9)){
            return "nove";
        }
        return "";
    }

    @Override
    public BigDecimal valorAbsoluto() {
        return BigDecimal.valueOf(9);
    }
}
