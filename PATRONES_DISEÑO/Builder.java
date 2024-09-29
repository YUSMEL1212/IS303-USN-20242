// Clase que representa un Coche con diferentes características.
public class Coche {
    private String motor;     // Tipo de motor
    private String carroceria; // Tipo de carrocería
    private int puertas;      // Número de puertas
    private boolean aireAcondicionado; // Si tiene o no aire acondicionado
    private boolean GPS;      // Si tiene o no sistema GPS

    // Constructor privado que solo puede ser llamado desde el Builder.
    private Coche(String motor, String carroceria, int puertas, boolean aireAcondicionado, boolean GPS) {
        this.motor = motor;
        this.carroceria = carroceria;
        this.puertas = puertas;
        this.aireAcondicionado = aireAcondicionado;
        this.GPS = GPS;
    }

    // Métodos para mostrar las características del coche
    public void mostrarDetalles() {
        System.out.println("Motor: " + motor);
        System.out.println("Carrocería: " + carroceria);
        System.out.println("Puertas: " + puertas);
        System.out.println("Aire Acondicionado: " + (aireAcondicionado ? "Sí" : "No"));
        System.out.println("GPS: " + (GPS ? "Sí" : "No"));
    }
}

// Builder que permite crear objetos Coche paso a paso.
public class CocheBuilder {
    private String motor;     // Tipo de motor
    private String carroceria; // Tipo de carrocería
    private int puertas;      // Número de puertas
    private boolean aireAcondicionado; // Si tiene o no aire acondicionado
    private boolean GPS;      // Si tiene o no sistema GPS

    // Métodos para configurar las características del coche. Todos devuelven el Builder actual para encadenamiento de llamadas.

    public CocheBuilder setMotor(String motor) {
        this.motor = motor;
        return this; // Devuelve el Builder actual
    }

    public CocheBuilder setCarroceria(String carroceria) {
        this.carroceria = carroceria;
        return this;
    }

    public CocheBuilder setPuertas(int puertas) {
        this.puertas = puertas;
        return this;
    }

    public CocheBuilder setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
        return this;
    }

    public CocheBuilder setGPS(boolean GPS) {
        this.GPS = GPS;
        return this;
    }

    // Método que construye y devuelve el objeto Coche.
    public Coche build() {
        // Llama al constructor privado de Coche con los valores configurados.
        return new Coche(motor, carroceria, puertas, aireAcondicionado, GPS);
    }
}
public class Main {
    public static void main(String[] args) {
        // Construir un coche deportivo con aire acondicionado y GPS.
        Coche cocheDeportivo = new CocheBuilder()
                .setMotor("V8")
                .setCarroceria("Deportiva")
                .setPuertas(2)
                .setAireAcondicionado(true)
                .setGPS(true)
                .build(); // Crear el coche

        // Mostrar los detalles del coche deportivo.
        cocheDeportivo.mostrarDetalles();
        System.out.println();

        // Construir un coche económico sin aire acondicionado ni GPS.
        Coche cocheEconomico = new CocheBuilder()
                .setMotor("1.0L")
                .setCarroceria("Hatchback")
                .setPuertas(4)
                .setAireAcondicionado(false)
                .setGPS(false)
                .build(); // Crear el coche

        // Mostrar los detalles del coche económico.
        cocheEconomico.mostrarDetalles();
    }
}

