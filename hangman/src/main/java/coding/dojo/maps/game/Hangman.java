package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;

public class Hangman {

    private final PalavrasDatasource datasource;

    public Hangman(PalavrasDatasource datasource) {
        this.datasource = datasource;
    }

    public Character[] getWordTemplate() {
        return null;
    }
}
