public class FactoryChile extends DocumentoFactory {
    @Override
    public ProcesadorDocumento factoryMethod() {
        // La fábrica de Chile sabe que debe crear un procesador chileno
        return new ProcesadorChile();
    }
}