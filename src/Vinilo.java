public class Vinilo extends DiscoAlmacenamiento {

    public Vinilo(double radio, int capacidad, String nombre,  String contenido) {
        super(radio, nombre, capacidad, contenido);
        setTipo("Vinilo");
    }


    @Override
    public void girarDisco() {
        System.out.println("Vinilo girando a 33 RPM...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del Vinilo usando una aguja...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("No se pueden escribir datos en un Vinilo.");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Contenido: " + contenido);
        System.out.println("Tipo: " + getTipo());
    }
}