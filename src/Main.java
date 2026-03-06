import javax.swing.*;
import java.awt.*;

// 1. PRODUCT: Interfaz con métodos de procesamiento real
interface IProcesador {
    void procesarDocumento();
}

// 2. CONCRETE PRODUCTS: Implementaciones con detalles técnicos
class ProcCol implements IProcesador {
    public void ejecutarSimulacion() {
        System.out.println("Conectando con servidores DIAN de Colombia...");
    }
    public void procesarDocumento() {
        JOptionPane.showMessageDialog(null,
                "<html><body style='width: 250px;'>" +
                        "<h2 style='color: #2E7D32;'>✓ PROCESO EXITOSO</h2>" +
                        "<hr>" +
                        "<b>País:</b> Colombia<br>" +
                        "<b>Entidad:</b> DIAN (Dirección de Impuestos)<br>" +
                        "<b>Norma:</b> Decreto 2242 - Factura Electrónica<br>" +
                        "<b>ID Proceso:</b> COL-" + (int)(Math.random()*10000) + "<br>" +
                        "<p style='color: gray;'>Certificado digital aplicado correctamente.</p>" +
                        "</body></html>",
                "GlobalDocs - Detalle de Procesamiento", JOptionPane.INFORMATION_MESSAGE);
    }
}

class ProcMex implements IProcesador {
    public void procesarDocumento() {
        JOptionPane.showMessageDialog(null,
                "<html><body style='width: 250px;'>" +
                        "<h2 style='color: #1565C0;'>✓ PROCESO EXITOSO</h2>" +
                        "<hr>" +
                        "<b>País:</b> México<br>" +
                        "<b>Entidad:</b> SAT (Servicio de Administración Tributaria)<br>" +
                        "<b>Norma:</b> CFDI v4.0 - Timbrado Fiscal<br>" +
                        "<b>UUID:</b> " + java.util.UUID.randomUUID().toString().substring(0,8).toUpperCase() + "<br>" +
                        "<p style='color: gray;'>Sello digital de Hacienda validado.</p>" +
                        "</body></html>",
                "GlobalDocs - Detalle de Procesamiento", JOptionPane.INFORMATION_MESSAGE);
    }
}

class ProcArg implements IProcesador {
    public void procesarDocumento() {
        JOptionPane.showMessageDialog(null,
                "<html><body style='width: 250px;'>" +
                        "<h2 style='color: #0277BD;'>✓ PROCESO EXITOSO</h2>" +
                        "<hr>" +
                        "<b>País:</b> Argentina<br>" +
                        "<b>Entidad:</b> AFIP (Ingresos Públicos)<br>" +
                        "<b>Norma:</b> Facturación Electrónica RG 4291<br>" +
                        "<b>CAE:</b> " + (long)(Math.random()*9999999999L) + "<br>" +
                        "<p style='color: gray;'>Código de Autorización Electrónico generado.</p>" +
                        "</body></html>",
                "GlobalDocs - Detalle de Procesamiento", JOptionPane.INFORMATION_MESSAGE);
    }
}

class ProcChi implements IProcesador {
    public void procesarDocumento() {
        JOptionPane.showMessageDialog(null,
                "<html><body style='width: 250px;'>" +
                        "<h2 style='color: #C62828;'>✓ PROCESO EXITOSO</h2>" +
                        "<hr>" +
                        "<b>País:</b> Chile<br>" +
                        "<b>Entidad:</b> SII (Servicio de Impuestos Internos)<br>" +
                        "<b>Norma:</b> Ley 20.727 (DTE)<br>" +
                        "<b>Folio:</b> CH-" + (int)(Math.random()*5000) + "<br>" +
                        "<p style='color: gray;'>Documento Tributario Electrónico firmado.</p>" +
                        "</body></html>",
                "GlobalDocs - Detalle de Procesamiento", JOptionPane.INFORMATION_MESSAGE);
    }
}

// 3. CREATOR: Clase base con lógica de procesamiento interactivo
abstract class FabricaDocs {
    public abstract IProcesador crear();

    public void iniciarProcesamiento() {
        IProcesador p = crear();
        // Simulación de carga para que la interfaz sea interactiva
        JOptionPane.showMessageDialog(null, "Iniciando conexión con servidores internacionales...", "GlobalDocs Engine", JOptionPane.PLAIN_MESSAGE);
        p.procesarDocumento();
    }
}

// 4. CONCRETE CREATORS
class FabCol extends FabricaDocs { public IProcesador crear() { return new ProcCol(); } }
class FabMex extends FabricaDocs { public IProcesador crear() { return new ProcMex(); } }
class FabArg extends FabricaDocs { public IProcesador crear() { return new ProcArg(); } }
class FabChi extends FabricaDocs { public IProcesador crear() { return new ProcChi(); } }

// MAIN: INTERFAZ DE USUARIO PROFESIONAL
public class Main {
    public static void main(String[] args) {
        // Configuramos un look un poco más moderno
        try { UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); } catch (Exception e) {}

        String[] opciones = {"🇨🇴 Colombia", "🇲🇽 México", "🇦🇷 Argentina", "🇨🇱 Chile", "❌ Cerrar Sistema"};

        while (true) {
            // Panel de bienvenida interactivo
            int seleccion = JOptionPane.showOptionDialog(
                    null,
                    "<html><div style='text-align: center;'>" +
                            "<h1 style='color: #0D47A1;'>GLOBALDOCS SOLUTION</h1>" +
                            "<p>Sistema Centralizado de Procesamiento de Documentos</p>" +
                            "<p><i>Seleccione la regulación nacional a aplicar:</i></p></div></html>",
                    "Panel de Control - v1.0",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );

            FabricaDocs miFabrica = null;

            switch (seleccion) {
                case 0: miFabrica = new FabCol(); break;
                case 1: miFabrica = new FabMex(); break;
                case 2: miFabrica = new FabArg(); break;
                case 3: miFabrica = new FabChi(); break;
                default:
                    int confirm = JOptionPane.showConfirmDialog(null, "¿Desea cerrar la sesión de GlobalDocs?", "Cerrar", JOptionPane.YES_NO_OPTION);
                    if (confirm == JOptionPane.YES_OPTION) System.exit(0);
                    else continue;
            }

            if (miFabrica != null) {
                miFabrica.iniciarProcesamiento();
            }
        }
    }
}


