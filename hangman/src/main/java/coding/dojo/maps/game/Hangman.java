package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Hangman {

    private final String palavra;

    private final char[] 

    private Integer tentativasRestante;

    public Hangman(PalavrasDatasource datasource, int qtdTentativas) {
        this.palavra = selectWord(datasource.getPalavras());
        this.tentativasRestante = qtdTentativas;
    }

    private String selectWord(String[] palavras) {
        Random r = new Random();
        return palavras[r.nextInt(palavras.length)];
    }

    public char[] getWordTemplate() {
        return StringUtils.repeat("_", palavra.length()).toCharArray();
    }

    public char[] colocarLetra(String x) {
        if (palavra.contains(x)) {

        } else {
            tentativasRestante--;
        }
        return getWordTemplate();
    }

    public Integer getTentativasRestantes() {
        return tentativasRestante;
    }
}
