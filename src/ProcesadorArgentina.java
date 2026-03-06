public class ProcesadorArgentina implements ProcesadorDocumento {
    @Override
    public void validarRegulaciones() {
        System.out.println("Validando CUIT y normativas de facturación ante la AFIP (Argentina)...");
    }

    @Override
    public void generarCertificado() {
        System.out.println("Certificado generado exitosamente bajo leyes de la República Argentina.");
    }
}
