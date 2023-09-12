package coding.dojo.maps.cheque.game;

import java.math.BigDecimal;

public class ChequeMachine {

    public String convert(BigDecimal valorNumero) {
        String valorTexto = " real";
        if (BigDecimal.ONE.equals(valorNumero)) {
            valorTexto = "um" + valorTexto;
        }
        return valorTexto;
    }
}
