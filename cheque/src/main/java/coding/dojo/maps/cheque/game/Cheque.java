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
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cheque {

    private String sufixo;

    private Converter converter = new Converter();

    public Cheque(BigDecimal valor) {
        converter.converterValor(valor);

        sufixo = "reais";
        if (BigDecimal.ONE.equals(valor)) {
            numeroConverters.add(new UmConverter());
            sufixo = "real";
        }
        if (BigDecimal.valueOf(2).equals(valor)) {
            numeroConverters.add(new DoisConverter());
        }
        if (BigDecimal.valueOf(3).equals(valor)) {
            numeroConverters.add(new TresConverter());
        }
        if (BigDecimal.valueOf(4).equals(valor)) {
            numeroConverters.add(new QuatroConverter());
        }
        if (BigDecimal.valueOf(5).equals(valor)) {
            numeroConverters.add(new CincoConverter());
        }
        if (BigDecimal.valueOf(6).equals(valor)) {
            numeroConverters.add(new SeisConverter());
        }
        if (BigDecimal.valueOf(7).equals(valor)) {
            numeroConverters.add(new SeteConverter());
        }
        if (BigDecimal.valueOf(8).equals(valor)) {
            numeroConverters.add(new OitoConverter());
        }
        if (BigDecimal.valueOf(9).equals(valor)) {
            numeroConverters.add(new NoveConverter());
        }
    }


    public String porExtenso() {
        String extenso = String.join(" ", numeroConverters.stream().map(NumeroConverter::porExtenso).collect(Collectors.toList()));

        return String.format("%s %s", extenso, sufixo);
    }
}
