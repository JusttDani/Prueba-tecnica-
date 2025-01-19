public class DiscoDuro extends DiscoAlmacenamiento {

    public DiscoDuro(double radio, String nombre, int capacidad, String contenido) {
        super(radio, nombre, capacidad, contenido);
        setTipo("Disco duro");
    }

    @Override
    public void girarDisco() {
        System.out.println("Disco Duro girando a 7200 RPM...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del Disco Duro usando un cabezal magnético...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el Disco Duro usando un cabezal magnético...");
    }
}