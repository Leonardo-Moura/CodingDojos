package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;
import coding.dojo.maps.cheque.game.converter.UmConverter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cheque {

    private final List<NumeroConverter> numeroConverters = new ArrayList<>();

    public Cheque(BigDecimal valor) {
        if (BigDecimal.ONE.equals(valor)) {
            numeroConverters.add(new UmConverter());
        }
    }


    public String porExtenso() {
        String extenso = String.join(" ", numeroConverters.stream().map(NumeroConverter::porExtenso).collect(Collectors.toList()));

        return extenso + " real";
    }
}
