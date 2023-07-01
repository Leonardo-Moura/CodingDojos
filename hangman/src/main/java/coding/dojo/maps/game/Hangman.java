package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Hangman {

    private final String palavra;
    private final Integer tentativasRestante;

    public Hangman(PalavrasDatasource datasource, int qtdTentativas) {
        Random r = new Random();
        var palavras = datasource.getPalavras();
        this.palavra = palavras[r.nextInt(palavras.length)];
        this.tentativasRestante = qtdTentativas;
    }

    public char[] getWordTemplate() {
        return StringUtils.repeat("_", palavra.length()).toCharArray();
    }

    public char[] colocarLetra(String x) {
        return getWordTemplate();
    }

    public Integer getTentativasRestantes() {
        return tentativasRestante;
    }
}
