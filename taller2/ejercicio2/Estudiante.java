package taller2.ejercicio2;
public class Estudiante {
    private String nombre;
    private int edad;

    public Estudiante() {
        this("Desconocido", 0);
    }

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre + ", Edad: " + edad);
    }

    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.mostrarDetalles();
    }
}
