package coding.dojo.maps;

import coding.dojo.maps.datasource.PalavrasDatasource;
import coding.dojo.maps.game.Hangman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameStartupTest {

    @Test
    void getWordTemplate() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource);

        var letras = h.getWordTemplate();

        assertArrayEquals(new char[]{'_', '_', '_', '_', '_', '_'}, letras);
    }

    @Test
    void 
}
