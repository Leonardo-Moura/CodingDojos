package coding.dojo.maps.cheque.game;

import coding.dojo.maps.cheque.game.converter.CincoConverter;
import coding.dojo.maps.cheque.game.converter.DoisConverter;
import coding.dojo.maps.cheque.game.converter.NumeroConverter;
import coding.dojo.maps.cheque.game.converter.QuatroConverter;
import coding.dojo.maps.cheque.game.converter.TresConverter;
import coding.dojo.maps.cheque.game.converter.UmConverter;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Converter {

    private final List<NumeroConverter> numeroConverters = new ArrayList<>();
    
    public Converter(){

    }

    public void converterValor(BigDecimal valor) {
        numeroConverters = Arrays.asList(new UmConverter(), new DoisConverter(), new TresConverter(), new QuatroConverter(), new CincoConverter())
    }
}
