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
        this.letrasCorretas = getWordTemplate();
    }

    private String selectWord(String[] palavras) {
        Random r = new Random();
        return palavras[r.nextInt(palavras.length)];
    }

    public char[] getWordTemplate() {
        return StringUtils.repeat("_", palavra.length()).toCharArray();
    }

    public char[] colocarLetra(char letra) {
        if (palavra.contains(String.valueOf(letra))) {
            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == letra) {
                    letrasCorretas[i] = letra;
                }
            }
        } else {
            tentativasRestante--;
        }
        return letrasCorretas;
    }

    public Integer getTentativasRestantes() {
        return tentativasRestante;
    }
}
