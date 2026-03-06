public abstract class DocumentoFactory {
    public abstract ProcesadorDocumento factoryMethod();

    public void ejecutarProceso() {
        ProcesadorDocumento procesador = factoryMethod();
        procesador.validarRegulaciones();
        procesador.generarCertificado();
    }
}
