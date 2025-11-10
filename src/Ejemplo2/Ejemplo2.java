package Ejemplo2;
// Estrategia
interface MetodoPago {
    void pagar(double monto);
}

// Estrategias concretas
class PagoTarjeta implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con Tarjeta");
    }
}

class PagoNequi implements MetodoPago {
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con Nequi");
    }
}

// Contexto
class Checkout {
    private MetodoPago metodo;

    public void setMetodoPago(MetodoPago metodo) {
        this.metodo = metodo;
    }

    public void pagar(double monto) {
        metodo.pagar(monto);
    }
}
