package coding.dojo.maps.cheque.game.converter;

import java.math.BigDecimal;

public interface NumeroConverter {

    String porExtenso(BigDecimal valor);

    BigDecimal valorAbsoluto();

}
