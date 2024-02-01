package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.CincoConverter;
import coding.dojo.maps.cheque.game.converter.DoisConverter;
import coding.dojo.maps.cheque.game.converter.NoveConverter;
import coding.dojo.maps.cheque.game.converter.NumeroConverter;
import coding.dojo.maps.cheque.game.converter.OitoConverter;
import coding.dojo.maps.cheque.game.converter.QuatroConverter;
import coding.dojo.maps.cheque.game.converter.SeisConverter;
import coding.dojo.maps.cheque.game.converter.SeteConverter;
import coding.dojo.maps.cheque.game.converter.TresConverter;
import coding.dojo.maps.cheque.game.converter.UmConverter;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Converter {

    private final Map<BigDecimal, NumeroConverter> numeroConverters = new HashMap<>();

    public Converter() {
        List<NumeroConverter> numeroConvertersIntermediario = Arrays.asList(
                new UmConverter(),
                new DoisConverter(),
                new TresConverter(),
                new QuatroConverter(),
                new CincoConverter(),
                new SeisConverter(),
                new SeteConverter(),
                new OitoConverter(),
                new NoveConverter());

        numeroConvertersIntermediario.forEach(numeroConverter -> numeroConverters.put(numeroConverter.valorAbsoluto(), numeroConverter));
    }

    public NumeroConverter getNumeroConverter(BigDecimal valor) {
        return numeroConverters.get(valor);
    }
}
