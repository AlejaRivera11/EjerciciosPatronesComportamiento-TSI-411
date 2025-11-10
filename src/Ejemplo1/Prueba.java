package Ejemplo1;

public class Prueba {
    public static void main(String[] args) {
        Sujeto s = new Sujeto();
        s.agregarObservador(new Pantalla());
        s.agregarObservador(new Registro());
        s.setValor(10);
    }
    
}
