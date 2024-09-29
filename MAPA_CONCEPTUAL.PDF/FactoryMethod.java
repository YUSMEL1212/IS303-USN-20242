// Interfaz que define los métodos comunes a los tipos de transporte
public interface Transporte {
    void conducir();
}
// Clase concreta que implementa el transporte "Coche"
public class Coche implements Transporte {
    @Override
    public void conducir() {
        System.out.println("Conduciendo un coche.");
    }
}
// Clase concreta que implementa el transporte "Bicicleta"
public class Bicicleta implements Transporte {
    @Override
    public void conducir() {
        System.out.println("Montando una bicicleta.");
    }
}
// Clase abstracta que define el método de fábrica
public abstract class TransporteFactory {
    public abstract Transporte crearTransporte();
}
// Fábrica concreta que crea un objeto Coche
public class CocheFactory extends TransporteFactory {
    @Override
    public Transporte crearTransporte() {
        return new Coche();
    }
}
// Fábrica concreta que crea un objeto Bicicleta
public class BicicletaFactory extends TransporteFactory {
    @Override
    public Transporte crearTransporte() {
        return new Bicicleta();
    }
}
public class Main {
    public static void main(String[] args) {
        // Crear una fábrica de coches
        TransporteFactory cocheFactory = new CocheFactory();
        Transporte coche = cocheFactory.crearTransporte();
        coche.conducir(); // Resultado: Conduciendo un coche.

        // Crear una fábrica de bicicletas
        TransporteFactory bicicletaFactory = new BicicletaFactory();
        Transporte bicicleta = bicicletaFactory.crearTransporte();
        bicicleta.conducir(); // Resultado: Montando una bicicleta.
    }
}
//https://chatgpt.com/g/g-1E7Z6Q2XF-gpt-chat-espanol/c/66f89677-1088-8000-b691-33c96e45827d
