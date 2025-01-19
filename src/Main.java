public class Main {
    public static void main(String[] args) {
        Cd cd = new Cd(5, "Album de Música", 4, "Canciones");
        DiscoDuro discoDuro = new DiscoDuro(4, "HDD Externo", 1024, "Copia de seguridad");
        BlueRay blueRay = new BlueRay(7, "Película HD", 12, "Películas");
        Vinilo vinilo = new Vinilo(11, 1,"Disco Clásico", "Música Jazz");
        Frisbee frisbee = new Frisbee(6, "Rojo", "Plástico");
        Rueda rueda = new Rueda(17,  "Coche");

        cd.girarDisco();
        cd.leerDatos();
        cd.escribirDatos();
        cd.mostrarInformacion();
        System.out.println("-------------------------------------");

        discoDuro.girarDisco();
        discoDuro.leerDatos();
        discoDuro.escribirDatos();
        discoDuro.mostrarInformacion();
        System.out.println("-------------------------------------");


        blueRay.girarDisco();
        blueRay.leerDatos();
        blueRay.escribirDatos();
        blueRay.mostrarInformacion();
        System.out.println("-------------------------------------");

        vinilo.girarDisco();
        vinilo.leerDatos();
        vinilo.escribirDatos();
        vinilo.mostrarInformacion();
        System.out.println("-------------------------------------");

        frisbee.girarDisco();
        frisbee.mostrarInformacion();
        System.out.println("-------------------------------------");

        rueda.girarDisco();
        rueda.mostrarInformacion();

    }
}