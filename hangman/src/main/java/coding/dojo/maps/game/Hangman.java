package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;

import java.util.Random;

public class Hangman {

    private final String palavra;

    public Hangman(PalavrasDatasource datasource) {
        Random r = new Random();
        var palavras = datasource.getPalavras();
        this.palavra = palavras[r.nextInt()];
    }

    public Character[] getWordTemplate() {
        return StringUtils.repeat();
    }
}
