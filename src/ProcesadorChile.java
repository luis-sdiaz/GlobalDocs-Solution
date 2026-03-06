public class ProcesadorChile implements ProcesadorDocumento {
    @Override
    public void validarRegulaciones() {
        System.out.println("Validando RUT y cumplimiento tributario ante el SII (Chile)...");
    }

    @Override
    public void generarCertificado() {
        System.out.println("Certificado generado exitosamente según la normativa chilena.");
    }
}
