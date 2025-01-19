public class Frisbee extends ObjetoCircular {
    private String color;
    private String material;

    public Frisbee(double radio, String color, String material) {
        super(5.7);
        this.color = color;
        this.material = material;
        setTipo("Frisbee");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public void girarDisco() {
        System.out.println("Frisbee girando en el aire...");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Es un: " + getTipo());
        System.out.println("De color: " + getColor());
        System.out.println("Hecho de: " + getMaterial());
        System.out.println("Sus dimensiones son: " + getDimensiones() );
    }

}