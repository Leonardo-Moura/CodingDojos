package coding.dojo.maps.exceptions;

public class FailureGameOverException extends RuntimeException {

    public String getMessage() {
        return "Tentativas esgotadas";
    }

}
