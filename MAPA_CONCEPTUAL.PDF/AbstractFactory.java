// Interfaz para coches tipo SUV. Define un método para mostrar detalles del coche SUV.
public interface CocheSUV {
    void mostrarDetallesSUV(); // Método que las clases concretas deben implementar.
}
// Interfaz para coches tipo Sedán. Define un método para mostrar detalles del coche Sedán.
public interface CocheSedan {
    void mostrarDetallesSedan(); // Método que las clases concretas deben implementar.
}
// Clase concreta que implementa la interfaz CocheSUV para coches eléctricos.
public class CocheSUVElectrico implements CocheSUV {
    
    @Override
    public void mostrarDetallesSUV() {
        // Implementación del método para mostrar detalles del coche SUV eléctrico.
        System.out.println("SUV Eléctrico: Batería de larga duración.");
    }
}
// Clase concreta que implementa la interfaz CocheSedan para coches eléctricos.
public class CocheSedanElectrico implements CocheSedan {
    
    @Override
    public void mostrarDetallesSedan() {
        // Implementación del método para mostrar detalles del coche Sedán eléctrico.
        System.out.println("Sedán Eléctrico: Cero emisiones.");
    }
}
// Clase concreta que implementa la interfaz CocheSUV para coches a gasolina.
public class CocheSUVGasolina implements CocheSUV {
    
    @Override
    public void mostrarDetallesSUV() {
        // Implementación del método para mostrar detalles del coche SUV a gasolina.
        System.out.println("SUV de Gasolina: Motor V8.");
    }
}
// Clase concreta que implementa la interfaz CocheSedan para coches a gasolina.
public class CocheSedanGasolina implements CocheSedan {
    
    @Override
    public void mostrarDetallesSedan() {
        // Implementación del método para mostrar detalles del coche Sedán a gasolina.
        System.out.println("Sedán de Gasolina: Motor eficiente.");
    }
}
// Interfaz abstracta para la fábrica de coches.
// Define los métodos que las fábricas concretas (eléctricos y gasolina) deben implementar.
public interface FabricaCoches {
    
    // Método abstracto para crear un SUV
    CocheSUV crearCocheSUV();
    
    // Método abstracto para crear un Sedán
    CocheSedan crearCocheSedan();
}
// Fábrica concreta que crea coches eléctricos.
// Implementa la interfaz FabricaCoches.
public class FabricaCochesElectricos implements FabricaCoches {
    
    @Override
    public CocheSUV crearCocheSUV() {
        // Devuelve un objeto de tipo CocheSUVElectrico (SUV eléctrico).
        return new CocheSUVElectrico();
    }

    @Override
    public CocheSedan crearCocheSedan() {
        // Devuelve un objeto de tipo CocheSedanElectrico (Sedán eléctrico).
        return new CocheSedanElectrico();
    }
}
// Fábrica concreta que crea coches a gasolina.
// Implementa la interfaz FabricaCoches.
public class FabricaCochesGasolina implements FabricaCoches {
    
    @Override
    public CocheSUV crearCocheSUV() {
        // Devuelve un objeto de tipo CocheSUVGasolina (SUV a gasolina).
        return new CocheSUVGasolina();
    }

    @Override
    public CocheSedan crearCocheSedan() {
        // Devuelve un objeto de tipo CocheSedanGasolina (Sedán a gasolina).
        return new CocheSedanGasolina();
    }
}
// Clase principal para demostrar el uso del patrón Abstract Factory.
public class Main {
    public static void main(String[] args) {
        
        // Crear una fábrica de coches eléctricos.
        FabricaCoches fabricaElectricos = new FabricaCochesElectricos();
        
        // Crear un SUV eléctrico usando la fábrica de coches eléctricos.
        CocheSUV suvElectrico = fabricaElectricos.crearCocheSUV();
        
        // Crear un Sedán eléctrico usando la fábrica de coches eléctricos.
        CocheSedan sedanElectrico = fabricaElectricos.crearCocheSedan();
        
        // Mostrar los detalles del SUV eléctrico.
        suvElectrico.mostrarDetallesSUV(); // Salida: SUV Eléctrico: Batería de larga duración.
        
        // Mostrar los detalles del Sedán eléctrico.
        sedanElectrico.mostrarDetallesSedan(); // Salida: Sedán Eléctrico: Cero emisiones.

        // Crear una fábrica de coches a gasolina.
        FabricaCoches fabricaGasolina = new FabricaCochesGasolina();
        
        // Crear un SUV a gasolina usando la fábrica de coches a gasolina.
        CocheSUV suvGasolina = fabricaGasolina.crearCocheSUV();
        
        // Crear un Sedán a gasolina usando la fábrica de coches a gasolina.
        CocheSedan sedanGasolina = fabricaGasolina.crearCocheSedan();
        
        // Mostrar los detalles del SUV a gasolina.
        suvGasolina.mostrarDetallesSUV(); // Salida: SUV de Gasolina: Motor V8.
        
        // Mostrar los detalles del Sedán a gasolina.
        sedanGasolina.mostrarDetallesSedan(); // Salida: Sedán de Gasolina: Motor eficiente.
    }
}


