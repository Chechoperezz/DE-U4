import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        // Crear un HashSet para almacenar estudiantes
        Set<Estudiantes> estudiantesSet = new HashSet<>();

        // Crear objetos Estudiantes
        Estudiantes estudiantes = new Estudiantes(10010,"Jose","Perez",
                18,Genero.Masculino,2);
        Estudiantes estudiantes1 = new Estudiantes(10011,"Carlos","Bustillo",
                19,Genero.Masculino,3);
        Estudiantes estudiantes2 = new Estudiantes(10012,"Maria","Avila",
                20,Genero.Femenino,5);
        Estudiantes estudiantes3 = new Estudiantes(10013,"Julia","Ruiz",
                17,Genero.Femenino,1);
        Estudiantes estudiantes4 = new Estudiantes(10014,"Nando","Castillo",
                22,Genero.Masculino,8);

        // Agregar estudiantes al conjunto
        estudiantesSet.add(estudiantes);
        estudiantesSet.add(estudiantes1);
        estudiantesSet.add(estudiantes2);
        estudiantesSet.add(estudiantes3);
        estudiantesSet.add(estudiantes4);

        // Verificar si un estudiante está presente en el conjunto
        estudiantesSet.contains(estudiantes2);
        System.out.println(estudiantesSet);

        // Agregar un nuevo estudiante al conjunto
        Estudiantes estudiantes5 = new Estudiantes(10015,"Marla","Jose",
                25,Genero.Femenino,10);
        estudiantesSet.add(estudiantes5);

        // Eliminar un estudiante del conjunto
        estudiantesSet.remove(estudiantes1);
        System.out.println(estudiantesSet);

        // Recorrer el conjunto usando un ciclo for tradicional
        System.out.println("Recorrer el Set usando for tradicional:");
        for (Estudiantes estudiante : estudiantesSet) {
            System.out.println(estudiante);
        }

        // Recorrer el conjunto usando forEach
        System.out.println("Recorrer el Set usando forEach:");
        estudiantesSet.forEach(estudiante -> System.out.println(estudiante));

        // Recorrer el conjunto usando un ciclo while
        System.out.println("Recorrer el Set usando while:");
        Set<Estudiantes> copiaSet1 = new HashSet<>(estudiantesSet);
        while (!copiaSet1.isEmpty()) {
            Estudiantes estudiante = copiaSet1.iterator().next();
            copiaSet1.remove(estudiante);
            System.out.println(estudiante);
        }

        // Recorrer el conjunto usando do/while
        System.out.println("Recorrer el Set usando do/while:");
        Set<Estudiantes> copiaSet2 = new HashSet<>(estudiantesSet);
        do {
            Estudiantes estudiante = copiaSet2.iterator().next();
            copiaSet2.remove(estudiante);
            System.out.println(estudiante);
        } while (!copiaSet2.isEmpty());

        // Recorrer el conjunto usando Stream
        System.out.println("Recorrer el Set usando stream:");
        estudiantesSet.stream().forEach(estudiante -> System.out.println(estudiante));

        // Recorrer el conjunto usando una expresión lambda
        System.out.println("Recorrer el Set usando lambda:");
        estudiantesSet.forEach(estudiante -> System.out.println(estudiante));
    }
}

