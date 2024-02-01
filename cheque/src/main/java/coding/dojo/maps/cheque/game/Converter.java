package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.CincoConverter;
import coding.dojo.maps.cheque.game.converter.DezConverter;
import coding.dojo.maps.cheque.game.converter.DoisConverter;
import coding.dojo.maps.cheque.game.converter.NoveConverter;
import coding.dojo.maps.cheque.game.converter.NumeroConverter;
import coding.dojo.maps.cheque.game.converter.OitoConverter;
import coding.dojo.maps.cheque.game.converter.QuatroConverter;
import coding.dojo.maps.cheque.game.converter.SeisConverter;
import coding.dojo.maps.cheque.game.converter.SeteConverter;
import coding.dojo.maps.cheque.game.converter.TresConverter;
import coding.dojo.maps.cheque.game.converter.UmConverter;
import coding.dojo.maps.cheque.game.converter.dez.CatorzeConverter;
import coding.dojo.maps.cheque.game.converter.dez.DezenoveConverter;
import coding.dojo.maps.cheque.game.converter.dez.DezeseisConverter;
import coding.dojo.maps.cheque.game.converter.dez.DezesseteConverter;
import coding.dojo.maps.cheque.game.converter.dez.DezoitoConverter;
import coding.dojo.maps.cheque.game.converter.dez.DozeConverter;
import coding.dojo.maps.cheque.game.converter.dez.OnzeConverter;
import coding.dojo.maps.cheque.game.converter.dez.QuinzeConverter;
import coding.dojo.maps.cheque.game.converter.dez.TrezeConverter;

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
                new NoveConverter(),
                new DezConverter(),
                new OnzeConverter(),
                new DozeConverter(),
                new TrezeConverter(),
                new CatorzeConverter(),
                new QuinzeConverter(),
                new DezeseisConverter(),
                new DezesseteConverter(),
                new DezoitoConverter(),
                new DezenoveConverter()
        );

        numeroConvertersIntermediario.forEach(numeroConverter -> numeroConverters.put(numeroConverter.valorAbsoluto(), numeroConverter));
    }

    public NumeroConverter getNumeroConverter(BigDecimal valor) {
        return numeroConverters.get(valor);
    }
}
