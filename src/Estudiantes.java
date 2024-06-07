import java.util.Comparator;

public class Estudiantes implements Comparable<Estudiantes> {
    private int codigo;
    private String nombre;
    private String apellido;
    private int edad;
    private Genero Genero;
    private int semestre;

    public Estudiantes() {
    }

    public Estudiantes(int codigo, String nombre, String apellido, int edad, Genero genero, int semestre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        Genero = genero;
        this.semestre = semestre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Genero getGenero() {
        return Genero;
    }

    public void setGenero(Genero genero) {
        Genero = genero;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    @Override
    public String toString() {
        return "Estudiantes{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", Genero=" + Genero +
                ", semestre=" + semestre +
                '}';
    }

    @Override
    public int compareTo(Estudiantes o) {
        return this.nombre.compareTo(o.nombre);
    }
}
