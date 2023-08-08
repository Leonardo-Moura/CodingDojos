package coding.dojo.maps.atm.game;

import java.util.List;

public class Atm {
    public List<Nota> sacar(Integer valor) {
        return List.of(new Nota(50));
    }
}
