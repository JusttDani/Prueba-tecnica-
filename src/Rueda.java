public class Rueda extends ObjetoCircular {

    public Rueda(double radio, String tipo) {
        super(radio);
        setTipo(tipo);
    }

    @Override
    public void girarDisco() {
        System.out.println("Rueda girando sobre el suelo...");
    }
    @Override
    public void mostrarInformacion() {
        System.out.println("Es una rueda de: " + getTipo());
        System.out.println("Sus dimensiones son: " + getDimensiones() );
    }
}
