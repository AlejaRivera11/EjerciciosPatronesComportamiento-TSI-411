package Ejemplo2;

public class Prueba {
   public static void main(String[] args) {
        Checkout cliente = new Checkout();
        cliente.setMetodoPago(new PagoTarjeta());
        cliente.pagar(50000);

        cliente.setMetodoPago(new PagoNequi());
        cliente.pagar(50000);
   } 
}
