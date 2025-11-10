package Ejemplo3;

public class Prueba {
    public static void main(String[] args) {
        // Crear los manejadores
        Manejador autenticador = new ManejadorAutenticacion();
        Manejador validador = new ManejadorValidacion();
        Manejador pedido = new ManejadorPedido();

        // Formamos la cadena
        autenticador.setSiguiente(validador);
        validador.setSiguiente(pedido);

        // Probamos la cadena
        //Para un caso de exito
        System.out.println("---- Prueba 1 ----");
        autenticador.manejar("usuario_valido");

        //Para un caso de fallo
        System.out.println("\n---- Prueba 2 ----");
        autenticador.manejar("usuario_invalido");
    }
}
