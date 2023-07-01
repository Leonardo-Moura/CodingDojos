package coding.dojo.maps.datasource;

public class MockPalavrasDatasource implements PalavrasDatasource {
    @Override
    public String[] getPalavras() {
        String[] palavras = new String[1];

        palavras[0] = "Banana";

        return palavras;
    }
}
