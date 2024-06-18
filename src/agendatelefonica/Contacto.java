package agendatelefonica;

public class Contacto {
    private String telefono;
    private String nombre;

    //constructor
    public Contacto(){
        //contructor de default
    }

    public Contacto(String telefono, String nombre) {
        this.telefono = telefono;
        this.nombre = nombre;
    }
    //getter y setter


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

}
