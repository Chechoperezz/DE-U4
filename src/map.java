import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class map {
    public static void main(String[] args) {
        // Crear un HashMap para almacenar estudiantes utilizando la cédula como clave
        Map<Integer,Estudiantes> estudiantesMap = new HashMap<>();

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

        // Agregar estudiantes al mapa utilizando la cédula como clave
        estudiantesMap.put(10301,estudiantes);
        estudiantesMap.put(10302,estudiantes1);
        estudiantesMap.put(10303,estudiantes2);
        estudiantesMap.put(10304,estudiantes3);
        estudiantesMap.put(10305,estudiantes4);

        // Buscar un estudiante por cédula
        System.out.println("BUSCAR ESTUDIANTE POR CEDULA: " + estudiantesMap.get(10303));

        // Insertar un estudiante con una nueva cédula
        Estudiantes estudiantes5 = new Estudiantes(10015,"Marla","Jose",
                25,Genero.Femenino,10);
        System.out.println("INSERTAR ESTUDIANTE:"+ estudiantesMap.put(10306,estudiantes5));

        // Imprimir el mapa de estudiantes
        System.out.println("MAP DE ESTUDIANTES: " + estudiantesMap);

        // Eliminar un estudiante del mapa por cédula
        estudiantesMap.remove(10303);

        // Verificar si un estudiante está presente en el mapa por su valor
        estudiantesMap.containsValue(estudiantes2);
        System.out.println(estudiantesMap);

        // Recorrer el mapa utilizando un ciclo for-each
        System.out.println("CICLO FOR EACH");
        for (Map.Entry<Integer,Estudiantes> entry : estudiantesMap.entrySet()) {
            System.out.println("CEDULA: " + entry.getKey()
                    + " ESTUDIANTE: " + entry.getValue());
        }

        // Recorrer el mapa utilizando un ciclo while y un iterador
        System.out.println("CICLO WHILE");
        Iterator<Map.Entry<Integer,Estudiantes>> iterator = estudiantesMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer,Estudiantes> entry = iterator.next();
            String key = entry.getKey().toString();
            Estudiantes value = entry.getValue();
            System.out.println("CEDULA: " + key + " ESTUDIANTE: " + value);
        }

        // Recorrer el mapa utilizando Stream
        System.out.println("STREAM");
        estudiantesMap.entrySet().stream()
                .forEach(entry -> System.out.println("CEDULA: " + entry.getKey()
                        + " ESTUDIANTE: " + entry.getValue()));
    }
}

