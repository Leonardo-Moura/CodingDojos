package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Hangman {

    private final String palavra;

    public Hangman(PalavrasDatasource datasource) {
        Random r = new Random();
        var palavras = datasource.getPalavras();
        this.palavra = palavras[r.nextInt(palavras.length)];
    }

    public char[] getWordTemplate() {
        return StringUtils.repeat("_", palavra.length()).toCharArray();
    }
}
