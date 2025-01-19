public abstract class ObjetoCircular {
    private double radio;
    private String tipo;

    public ObjetoCircular(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract void girarDisco();

    public double getDiametro() {
        return radio * 2;
    }
    public double getPerimetro() {
        return radio * 2 * 3.14;
    }
    public abstract void mostrarInformacion();

    public String getDimensiones(){
        return "El radio es de " + radio + "cm, el diametro es de: " + getDiametro() + "cm y el perimetro es de " + getPerimetro() + "cm";
    }
}
