package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

public class Cheque {

    private final String sufixo;

    private final List<NumeroConverter> converters;

    private final Converter converter = new Converter();

    public Cheque(BigDecimal valor) {
        converters = List.of(converter.getNumeroConverter(valor));
        sufixo = valor.equals(BigDecimal.ONE) ? "real" : "reais";
    }


    public String porExtenso() {
        String extenso = String.join(" ", converters.stream().map(NumeroConverter::porExtenso).collect(Collectors.toList()));

        return String.format("%s %s", extenso, sufixo);
    }
}
