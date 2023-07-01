package coding.dojo.maps;

import coding.dojo.maps.datasource.PalavrasDatasource;
import coding.dojo.maps.game.Hangman;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameStartupTest {

    @Test
    void getWordTemplate() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);

        var letras = h.getWordTemplate();

        assertArrayEquals(new char[]{'_', '_', '_', '_', '_', '_'}, letras);
    }

    @Test
    void insertLetraErrada() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);
        char[] letras = h.colocarLetra('x');

        assertArrayEquals(new char[]{'_', '_', '_', '_', '_', '_'}, letras);
        assertEquals(4, h.getTentativasRestantes());
    }

    @Test
    void insertLetraCerta() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);
        char[] letras = h.colocarLetra('B');

        assertArrayEquals(new char[]{'B', '_', '_', '_', '_', '_'}, letras);
        assertEquals(5, h.getTentativasRestantes());
    }

    @Test
    void insertLetraCertaRecorrente() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);
        char[] letras = h.colocarLetra('a');

        assertArrayEquals(new char[]{'_', 'a', '_', 'a', '_', 'a'}, letras);
        assertEquals(5, h.getTentativasRestantes());
    }

    @Test
    void succesfulGameOver () {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);
        h.colocarLetra('B');
        h.colocarLetra('a');
        char[] letras = h.colocarLetra('n');

        assertArrayEquals(new char[]{'B', 'a', 'n', 'a', 'n', 'a'}, letras);
        assertEquals(5, h.getTentativasRestantes());
    }

    @Test
    void failureGameOver() {
        PalavrasDatasource datasource = mock(PalavrasDatasource.class);
        when(datasource.getPalavras()).thenReturn(new String[]{"Banana"});

        Hangman h = new Hangman(datasource, 5);

        h.colocarLetra('x');
        h.colocarLetra('x');
        h.colocarLetra('x');
        h.colocarLetra('x');
        h.colocarLetra('x');

        assertEquals(0, h.getTentativasRestantes());
    }
}
