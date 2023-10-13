public class EjemploAutos {
    public static void main(String[] args) {

        Autos chevrolet = new Autos();
        System.out.println(chevrolet.combustible(20,52,0));
        System.out.println(chevrolet.combustible(20.0f,52.3f,0.0f));
    }
}