package agendatelefonica;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Contacto> contactos;
    private static final int NUMERO_MAXIMO = 10; // Usualmente las constantes se escriben en mayúsculas

    public Agenda() {
        this.contactos = new ArrayList<>();
    }

    // Método para verificar si la agenda está llena
    public boolean agendaLlena() {
        return contactos.size() >= NUMERO_MAXIMO; // Devuelve true si la agenda está llena
    }

    // Método para verificar si un contacto existe
    public boolean existeContacto(Contacto c) {
        for (Contacto contactoActual : contactos) {
            if (contactoActual.equals(c)) {
                return true; // Contacto encontrado
            }
        }
        return false; // Contacto no encontrado
    }

    // Método para añadir un contacto
    public void addContacto(Contacto c) {
        if (existeContacto(c)) {
            System.out.println("El contacto con ese nombre ya existe");
        } else if (agendaLlena()) {
            System.out.println("La agenda está llena, no se pueden añadir más contactos");
        } else {
            contactos.add(c);
            System.out.println("Se ha añadido el contacto: " + c.getNombre().toUpperCase());
        }
    }

    // Método para eliminar un contacto
    public void eliminarContacto(Contacto c) {
        if (contactos.remove(c)) {
            System.out.println("El contacto ha sido eliminado con éxito.");
        } else {
            System.out.println("El contacto no ha sido encontrado, verifique si existe");
        }
    }

    // Método para listar los contactos
    public void listarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("La agenda está vacía");
        } else {
            for (Contacto c : contactos) {
                System.out.println("Nombre de contacto: " + c.getNombre().toUpperCase() + ", Número de contacto: " + c.getTelefono());
            }
        }
    }

    // Método para buscar un contacto por nombre
    public void buscarContacto(String nombre) {
        for (Contacto t : contactos) {
            if (t.getNombre().equalsIgnoreCase(nombre)) {
                System.out.println("El teléfono de " + nombre + " es: " + t.getTelefono());
                return; // Contacto encontrado, termina el método
            }
        }
        System.out.println("No se encontró el contacto, verifica si existe");
    }

    // Método para verificar espacios libres
    public void espaciosLibres() {
        int espaciosLibres = NUMERO_MAXIMO - contactos.size();
        if (espaciosLibres > 0) {
            System.out.println("El número de espacios que queda son: " + espaciosLibres);
        } else {
            System.out.println("No hay espacios disponibles");
        }
    }
}
