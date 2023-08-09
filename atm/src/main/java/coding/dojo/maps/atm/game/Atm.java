package coding.dojo.maps.atm.game;

import coding.dojo.maps.atm.game.exception.NotaInexistenteException;

import java.util.ArrayList;
import java.util.List;

public class Atm {

    private final List<Integer> valoresPossiveis = List.of(100, 50, 20, 10);

    public List<Nota> sacar(Integer valor) {
        Integer valorRestante = valor;

        List<Nota> notas = new ArrayList<>();

        for (Integer vp : valoresPossiveis) {
            int numeroDeNotas = valorRestante / vp;
            valorRestante = valorRestante - (vp * numeroDeNotas);
            for (int i = 0; i < numeroDeNotas; i++) {
                notas.add(new Nota(vp));
            }
        }

        if (valorRestante > 0) {
            throw new NotaInexistenteException(valorRestante);
        }

        return notas;
    }
}
