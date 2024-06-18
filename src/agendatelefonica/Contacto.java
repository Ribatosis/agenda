package agendatelefonica;

public class Contacto {
    private String telefono;
    private String nombre;


    public boolean equals (Contacto c){
        if (this.nombre.equalsIgnoreCase(c.getNombre())){
            return true;
        }
        return false;
    }

    //constructor
    public Contacto(String nombre, int telefono){
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
