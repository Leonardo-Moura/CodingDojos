package coding.dojo.maps.atm.game;

import java.util.ArrayList;
import java.util.List;

public class Atm {
    public List<Nota> sacar(Integer valor) {

        int number50 = valor / 50;
        List<Nota> notas = new ArrayList<>();
        for (int i = 0; i < number50; i++) {
            notas.add(new Nota(50));
        }

        return notas;
    }
}
