import java.util.Stack;

public class stack {

    public static void main(String[] args) {
        // Crear una pila para almacenar estudiantes
        Stack<Estudiantes> estudiantesStack = new Stack<>();

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

        // Agregar estudiantes a la pila
        estudiantesStack.push(estudiantes);
        estudiantesStack.push(estudiantes1);
        estudiantesStack.push(estudiantes2);
        estudiantesStack.push(estudiantes3);
        estudiantesStack.push(estudiantes4);

        // Imprimir la pila de estudiantes
        System.out.println(estudiantesStack);

        // Buscar un estudiante en la pila
        estudiantesStack.search(estudiantes3);

        // Agregar un nuevo estudiante a la pila
        Estudiantes estudiantes5 = new Estudiantes(10015,"Marla","Jose",
                25,Genero.Femenino,10);
        estudiantesStack.push(estudiantes5);

        // Imprimir la pila de estudiantes después de agregar uno nuevo
        System.out.println(estudiantesStack);

        // Eliminar un estudiante de la pila
        estudiantesStack.remove(estudiantes3);

        // Buscar nuevamente el estudiante eliminado en la pila
        estudiantesStack.search(estudiantes3);

        // Imprimir la pila de estudiantes después de eliminar uno
        System.out.println(estudiantesStack);
    }
}

