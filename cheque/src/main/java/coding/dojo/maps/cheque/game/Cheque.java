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
    }


    public String porExtenso() {
        String extenso = String.join(" ", numeroConverters.stream().map(NumeroConverter::porExtenso).collect(Collectors.toList()));

        return String.format("%s %s", extenso, sufixo);
    }
}
