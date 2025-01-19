public class BlueRay extends DiscoAlmacenamiento {

    public BlueRay(double radio, String nombre, int capacidad, String contenido) {
        super(radio,nombre, capacidad, contenido);
        setTipo("BlueRay");
    }

    @Override
    public void girarDisco() {
        System.out.println("BlueRay girando a 10000 RPM...");
    }

    @Override
    public void leerDatos() {
        System.out.println("Leyendo datos del BlueRay usando un láser de alta precisión...");
    }

    @Override
    public void escribirDatos() {
        System.out.println("Escribiendo datos en el BlueRay usando un láser de alta precisión...");
    }
}
