import java.util.ArrayList;

public class Exemple1 {

    public static void main(String[] args) {
        ArrayList<String> nombresAlumnos = new ArrayList<>();

        nombresAlumnos.add("Andreu");
        nombresAlumnos.add("Maria");
        nombresAlumnos.add("Josep");

        nombresAlumnos.add(0, "Helena");

        nombresAlumnos.set(0, "Geni"); // Sobreescribe - Actualizacion

        nombresAlumnos.remove("Geni"); // Eliminar
        mostrarElementosArrayList(nombresAlumnos);
        System.out.println("----");

    }

    private static void mostrarElementosArrayList(ArrayList<String> nombresAlumnos) {
        // Iteración usando índices
        for (int i = 0; i < nombresAlumnos.size(); i++) {
            System.out.println(i + ": " + nombresAlumnos.get(i));
        }

        System.out.println("For-each:");

        // Iteracion usando un bucle for-each
        for (String nombre : nombresAlumnos) {
            System.out.println(nombre);
        }
    }
}
