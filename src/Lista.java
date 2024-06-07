import java.util.*;
import java.util.stream.Collectors;

public class Lista {
    public static void main(String[] args) {
        // Creación de objetos Estudiantes
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

        // Creación de una lista de estudiantes
        List<Estudiantes> estudiantesList = new ArrayList<>();
        estudiantesList.add(estudiantes);
        estudiantesList.add(estudiantes1);
        estudiantesList.add(estudiantes2);
        estudiantesList.add(estudiantes3);
        estudiantesList.add(estudiantes4);

        // Agregar un objeto en la posición 2 de la lista
        Estudiantes estudiantes5 = new Estudiantes(10015,"Marla","Jose",
                25,Genero.Femenino,10);
        estudiantesList.add(2,estudiantes5);

        // Eliminar un objeto de la lista
        estudiantesList.remove(estudiantes2);

        // Verificar si un objeto está en la lista
        estudiantesList.contains(estudiantes3);

        // Recorrer la lista usando un ciclo for tradicional
        System.out.println("CICLO FOR");
        for (int i = 0; i < estudiantesList.size(); i++) {
            System.out.println(estudiantesList.get(i));
        }

        // Recorrer la lista usando for-each
        System.out.println("CICLO FOR EACH");
        for (Estudiantes estudiante : estudiantesList) {
            System.out.println(estudiante);
        }

        // Recorrer la lista usando un ciclo while
        System.out.println("CICLO WHILE");
        int i =0;
        while (i < estudiantesList.size()) {
            System.out.println(estudiantesList.get(i));
            i++;
        }

        // Recorrer la lista usando un ciclo do-while
        System.out.println("CICLO DO WHILE");
        int index = 0;
        do {
            System.out.println(estudiantesList.get(index));
            index++;
        }while (estudiantesList.size()>index);

        // Ordenar la lista por nombres (implementando Comparable en la clase Estudiantes)
        System.out.println("ORDENAR LISTA DE ESTUDIANTES");
        Collections.sort(estudiantesList);
        for (Estudiantes estudiante : estudiantesList) {
            System.out.println(estudiante);
        }

        // Recorrer la lista usando Stream
        System.out.println("RECORRER LISTA CON STREAM");
        estudiantesList.stream().forEach(
                estudiante -> System.out.println(estudiante));

        // Recorrer la lista usando una expresión lambda
        System.out.println("RECORRER LISTA CON LAMBDA");
        estudiantesList.forEach(estudiante -> System.out.println(estudiante));

        // Convertir la lista en un array
        System.out.println("List To Array");
        Estudiantes[] estudiantesArray = estudiantesList.toArray(new Estudiantes[estudiantesList.size()]);
        System.out.println(Arrays.toString(estudiantesArray));

        // Combinar dos listas en una sola
        System.out.println("LISTAS COMBINADAS");
        List<Integer>list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        List<Integer> listCombinada = new ArrayList<>();
        listCombinada.addAll(list1);
        listCombinada.addAll(list);
        System.out.println(listCombinada);

        // Desordenar una lista
        Collections.shuffle(listCombinada);
        System.out.println("LISTA DE COMBINADAS SHUFFLE" + listCombinada);

        // Ordenar la lista de estudiantes por apellido usando Stream
        List<Estudiantes> estudiantesApellidos = estudiantesList.stream()
                .sorted(Comparator.comparing(Estudiantes::getApellido))
                .toList();

        // Obtener una sublista de estudiantes que están en III semestre usando Stream
        List<Estudiantes> sublista = estudiantesList.stream()
                .filter(Estudiantes -> Estudiantes.getSemestre()==3)
                .collect(Collectors.toList());

        // Obtener el primer alumno que está en III semestre usando Stream
        Optional<Estudiantes> primerAlumnoIII = estudiantesList.stream()
                .filter(estudiantes6 -> estudiantes6.getSemestre() == 3)
                .findFirst();

        // Obtener estudiantes cuyo nombre contiene "John" usando Stream
        List<Estudiantes> alumnosJohn = estudiantesList.stream()
                .filter(alumno -> alumno.getNombre().contains("John"))
                .toList();

        // Obtener estudiantes que están cursando de III a VI semestre usando Stream
        List<Estudiantes> alumnosSemestresIIIaVI = estudiantesList.stream()
                .filter(estudiantes6 -> estudiantes6.getSemestre() >= 3 && estudiantes6.getSemestre() <= 6)
                .collect(Collectors.toList());
    }
}

