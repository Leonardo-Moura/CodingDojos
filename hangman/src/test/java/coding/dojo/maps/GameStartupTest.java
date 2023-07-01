package coding.dojo.maps;

import coding.dojo.maps.datasource.MockPalavrasDatasource;
import coding.dojo.maps.datasource.PalavrasDatasource;
import coding.dojo.maps.game.Hangman;
import org.junit.jupiter.api.Test;

class GameStartupTest {

    private static final String[] PALAVRAS = new String[]{"Banana", "", "", ""};

    @Test
    void initGameTest() {
        Hangman h = new Hangman(new MockPalavrasDatasource());

        var letras = h.getWordTemplate();

        assertEquals();
    }
}
