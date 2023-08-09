package coding.dojo.maps.atm.game.exception;

public class NotaInexistenteException extends RuntimeException {

    public NotaInexistenteException(int valorRestante) {
        super("Notas indisponíveis para o valor restante: " + valorRestante);
    }


}
