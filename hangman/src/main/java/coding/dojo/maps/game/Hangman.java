package coding.dojo.maps.game;

import coding.dojo.maps.datasource.PalavrasDatasource;
import org.apache.commons.lang3.StringUtils;

import java.util.Random;

public class Hangman {

    private final String palavra;

    private final char[] letrasCorretas;

    private Integer tentativasRestante;

    public Hangman(PalavrasDatasource datasource, int qtdTentativas) {
        this.palavra = selectWord(datasource.getPalavras());
        this.tentativasRestante = qtdTentativas;
        this.letrasCorretas = new char[palavra.length()];
    }

    private String selectWord(String[] palavras) {
        Random r = new Random();
        return palavras[r.nextInt(palavras.length)];
    }

    public char[] getWordTemplate() {
        return StringUtils.repeat("_", palavra.length()).toCharArray();
    }

    public char[] colocarLetra(String letra) {
        if (palavra.contains(letra)) {
            this.letrasCorretas[palavra.indexOf(letra)] = letra.charAt(palavra.indexOf(letra));
        } else {
            tentativasRestante--;
        }
        return  letrasCorretas;
    }

    public Integer getTentativasRestantes() {
        return tentativasRestante;
    }
}
