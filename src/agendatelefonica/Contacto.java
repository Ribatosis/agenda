package agendatelefonica;

public class Contacto {
    private String telefono;
    private String nombre;

    // Constructor por defecto
    public Contacto() {
    }

    // Constructor con parámetros
    public Contacto(String telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Sobrescribir equals para comparar contactos por nombre
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Contacto contacto = (Contacto) obj;
        return nombre.equalsIgnoreCase(contacto.nombre);
    }

    // Sobrescribir hashCode
    @Override
    public int hashCode() {
        return nombre.toLowerCase().hashCode();
    }
}
