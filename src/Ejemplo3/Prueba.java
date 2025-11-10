package Ejemplo3;

public class Prueba {
    public static void main(String[] args) {
        Manejador a = new ManejadorAutenticacion();
        Manejador v = new ManejadorValidacion();
        Manejador p = new ManejadorPedido();

        // Formar la cadena
        a.setSiguiente(v);
        v.setSiguiente(p);

        // Probar la cadena
        System.out.println("---- Prueba 1 ----");
        a.manejar("usuario_valido");

        System.out.println("\n---- Prueba 2 ----");
        a.manejar("usuario_invalido");
    }
}
