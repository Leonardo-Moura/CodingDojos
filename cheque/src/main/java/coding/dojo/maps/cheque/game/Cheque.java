package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.NumeroConverter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cheque {

    private final String sufixo;

    private final List<NumeroConverter> converters = new ArrayList<>();

    private final Converter converter = new Converter();

    public Cheque(BigDecimal valor) {
        valor.toString().charAt()
        for (char s : valor.toString().toCharArray()) {
            converters.add(converter.getNumeroConverter(new BigDecimal(s)));
        }

        sufixo = valor.equals(BigDecimal.ONE) ? "real" : "reais";
    }


    public String porExtenso() {
        String extenso = String.join(" ", converters.stream().map(NumeroConverter::porExtenso).collect(Collectors.toList()));

        return String.format("%s %s", extenso, sufixo);
    }
}
