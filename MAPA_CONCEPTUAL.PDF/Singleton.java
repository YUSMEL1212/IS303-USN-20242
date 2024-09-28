public class Singleton {
    // Variable estática que contiene la única instancia del Singleton
    private static Singleton instanciaUnica;

    // Constructor privado para evitar que se pueda instanciar desde fuera
    private Singleton() {
        // Constructor vacío
    }

    // Método público y estático para obtener la única instancia
    public static Singleton obtenerInstancia() {
        if (instanciaUnica == null) {
            // Si la instancia aún no ha sido creada, se crea una nueva
            instanciaUnica = new Singleton();
        }
        // Devuelve la instancia única
        return instanciaUnica;
    }

    // Un método de ejemplo en la clase Singleton
    public void mostrarMensaje() {
        System.out.println("¡Este es el único objeto de la clase Singleton!");
    }
}
// En el programa principal.

public class Main {
    public static void main(String[] args) {
        // Obtener la única instancia de Singleton
        Singleton singleton = Singleton.obtenerInstancia();

        // Usar el método de la instancia
        singleton.mostrarMensaje();
    }
}

