package coding.dojo.maps.atm.game;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Atm {

    private final List<Integer> valoresPossiveis = List.of(100, 50, 20, 10);

    public List<Nota> sacar(Integer valor) {
        Integer valorRestante = valor;


        List<Nota> notas = new ArrayList<>();
        valoresPossiveis.forEach(valorCorrente -> {
            int numeroDeNotas = valorRestante / valorCorrente;
            for ()
        });


        int number50 = valor / 50;
        for (int i = 0; i < number50; i++) {
            notas.add(new Nota(50));
        }

        return notas;
    }
}
