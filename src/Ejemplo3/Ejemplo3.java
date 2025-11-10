package Ejemplo3;

// Clase abstracta manejador 
abstract class Manejador {
    protected Manejador siguiente; 

    // Establece el siguiente manejador en la cadena
    public void setSiguiente(Manejador siguiente) { 
        this.siguiente = siguiente;
    }

    // Maneja la solicitud
    public abstract void manejar(String solicitud); 

}


// Manejador Autenticación
class ManejadorAutenticacion extends Manejador {
    public void manejar(String solicitud) {
        if (solicitud.equals("usuario_valido")) {
            System.out.println("Usuario autenticado correctamente.");
            if (siguiente != null)
                siguiente.manejar(solicitud);
        } else {
            System.out.println("Error: usuario no autenticado.");
        }
    }
} 

// Manejador Validación de datos
class ManejadorValidacion extends Manejador {
    public void manejar(String solicitud) {
        System.out.println("Datos del usuario validados.");
        if (siguiente != null)
            siguiente.manejar(solicitud);
    }
}

// Manejador Pedido
class ManejadorPedido extends Manejador {
    public void manejar(String solicitud) {
        System.out.println("Pedido procesado correctamente.");
    }
}
