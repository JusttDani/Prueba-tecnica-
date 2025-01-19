public class Cd extends DiscoAlmacenamiento {

    public Cd(double radio, String nombre, int capacidad, String contenido) {
        super(radio, nombre, capacidad, contenido);
        setTipo("Cd");
    }

    @Override
    public void girarDisco() {
        System.out.println("CD girando a 500 RPM..."); // got you!
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del CD usando un láser...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el CD usando un láser...");
    }
}