package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    private final List<NumeroConverter> numeroConverters;

    public Converter() {
        numeroConverters = Arrays.asList(
                new UmConverter(),
                new DoisConverter(),
                new TresConverter(),
                new QuatroConverter(),
                new CincoConverter(),
                new SeisConverter(),
                new SeteConverter(),
                new OitoConverter(),
                new NoveConverter());
    }

    public void converterValor(BigDecimal valor) {
        for (int i = 0; i < numeroConverters.size(); i++) {
            numeroConverters.get(i).porExtenso(valor);
        }
    }
}
