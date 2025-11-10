package Ejemplo1;
// Sujeto
import java.util.ArrayList;
import java.util.List;

interface Observador {
    void actualizar(int nuevoValor);
}

class Sujeto {
    private List<Observador> observadores = new ArrayList<>();
    private int valor;

    public void agregarObservador(Observador o) {
        observadores.add(o);
    }

    public void setValor(int valor) {
        this.valor = valor;
        notificar();
    }

    private void notificar() {
        for (Observador o : observadores) {
            o.actualizar(valor);
        }
    }
}

// Observadores
class Pantalla implements Observador {
    public void actualizar(int nuevoValor) {
        System.out.println("Pantalla muestra valor: " + nuevoValor);
    }
}

class Registro implements Observador {
    public void actualizar(int nuevoValor) {
        System.out.println("Registro guarda valor: " + nuevoValor);
    }
}

