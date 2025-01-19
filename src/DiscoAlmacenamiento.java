public abstract class DiscoAlmacenamiento extends ObjetoCircular implements Disco {
    protected String nombre;
    protected int capacidad; // en MB
    protected String contenido;

    public DiscoAlmacenamiento(double radio, String nombre, int capacidad, String contenido) {
        super(radio);
        this.nombre = nombre;
        this.capacidad = capacidad;
        this.contenido = contenido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Capacidad: " + capacidad + "GB");
        System.out.println("Contenido: " + contenido);
        System.out.println("Tipo: " + getTipo());
        System.out.println("Sus dimensiones son: " + getDimensiones() );
    }
}