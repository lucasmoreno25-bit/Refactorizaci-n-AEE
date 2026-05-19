package facturacion;
public class FacturacionLegacy {

    public double calcularTotal(double monto, int tipoCliente, boolean descuentoVip) {
        
        // Validación inicial
        if (monto <= 0) {
            return 0;
        }

        // Procesamiento según el tipo de cliente
        if (tipoCliente == 1) {
            if (descuentoVip) {
                // Descuento VIP del 25%
                return monto - (monto * 0.25); 
            } else {
                // Descuento normal del 15%
                return monto - (monto * 0.15); 
            }
        } 
        
        if (tipoCliente == 2) {
            // Descuento del 5%
            return monto - (monto * 0.05); 
        }

        //Si no es tipo 1 ni 2
        return monto;
    }
}