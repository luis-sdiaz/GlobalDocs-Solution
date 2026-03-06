public class FactoryArgentina extends DocumentoFactory {
    @Override
    public ProcesadorDocumento factoryMethod() {
        // La fábrica de Argentina sabe que debe crear un procesador argentino
        return new ProcesadorArgentina();
    }
}
