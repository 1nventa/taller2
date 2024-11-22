package taller2.ejericico3;

public class Persona {
    private String nombre;

    public static void mostrarNombre() {
        // System.out.println(this.nombre); // Esto generará un error de compilación
    }

    public void setNombre(String nombre) {
        this.nombre = nombre; // Uso correcto de this
        mostrarNombre(); // Uso innecesario de this
    }

    public void mostrarNombre() {
        System.out.println("Nombre: " + nombre);
    }

    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
    }
}