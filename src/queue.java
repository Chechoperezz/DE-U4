import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        // Crear una cola para almacenar estudiantes
        Queue<Estudiantes> estudiantesQueue = new LinkedList<>();

        // Crear objetos Estudiantes
        Estudiantes estudiantes = new Estudiantes(10010,"Jose","Perez",
                18,Genero.Masculino,2
        );
        Estudiantes estudiantes1 = new Estudiantes(10011,"Carlos","Bustillo",
                19,Genero.Masculino,3);
        Estudiantes estudiantes2 = new Estudiantes(10012,"Maria","Avila",
                20,Genero.Femenino,5);
        Estudiantes estudiantes3 = new Estudiantes(10013,"Julia","Ruiz",
                17,Genero.Femenino,1);
        Estudiantes estudiantes4 = new Estudiantes(10014,"Nando","Castillo",
                22,Genero.Masculino,8);

        // Agregar estudiantes a la cola
        estudiantesQueue.add(estudiantes);
        estudiantesQueue.add(estudiantes1);
        estudiantesQueue.add(estudiantes2);
        estudiantesQueue.add(estudiantes3);
        estudiantesQueue.add(estudiantes4);

        // Imprimir la cola de estudiantes
        System.out.println("ESTUDIANTES QUEUE"+ estudiantesQueue);

        // Agregar un nuevo estudiante a la cola
        Estudiantes estudiantes5 = new Estudiantes(10015,"Marla","Jose",
                25,Genero.Femenino,10);
        estudiantesQueue.add(estudiantes5);

        // Imprimir la cola de estudiantes después de agregar uno nuevo
        System.out.println("ESTUDIANTES QUEUE"+ estudiantesQueue);

        // Verificar si un estudiante está presente en la cola
        System.out.println("EXISTE ESTUDIANTE? : " + estudiantesQueue.contains(estudiantes1));

        // Eliminar un estudiante de la cola
        estudiantesQueue.remove(estudiantes1);

        // Imprimir la cola de estudiantes después de eliminar uno
        System.out.println("ESTUDIANTES QUEUE"+ estudiantesQueue);
    }
}

