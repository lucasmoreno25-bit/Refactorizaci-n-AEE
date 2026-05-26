package facturacion;

public class FacturacionLegacy {

    // 1. CONSTANTES EXTRAÍDAS (Evitamos los números mágicos)
    private static final double DESCUENTO_VIP = 0.25;
    private static final double DESCUENTO_ESTANDAR = 0.15;
    private static final double DESCUENTO_CLIENTE_2 = 0.05;

    // 2. MÉTODO TOTALMENTE REFACTORIZADO con nombres claros y código "plano"
    public double calcularTotal(double importeBase, int tipoCliente, boolean esSocioVip) {
        
        // Cláusula de guarda: Si el importe es 0 o negativo, salimos corriendo
        if (importeBase <= 0) {
            return 0;
        }

        // Caso para Tipo de Cliente 1 (con sub-condición VIP)
        if (tipoCliente == 1) {
            if (esSocioVip) {
                return importeBase - (importeBase * DESCUENTO_VIP);
            }
            return importeBase - (importeBase * DESCUENTO_ESTANDAR);
        }

        // Caso para Tipo de Cliente 2
        if (tipoCliente == 2) {
            return importeBase - (importeBase * DESCUENTO_CLIENTE_2);
        }

        // Si no se cumple nada de lo anterior, se devuelve el importe base directamente
        return importeBase;
    }

    double cT(double d, int i, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}