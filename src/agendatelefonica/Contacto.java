package agendatelefonica;

public class Contacto {
    private int telefono;
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

    public Contacto(int telefono, String nombre) {
        this.nombre = nombre;
        if (String.valueOf(telefono).length() != 10){
            throw new IllegalArgumentException("El número de teléfono no puede ser mayor que 10");
        }else {
            this.telefono=telefono;
        }
    }
    //getter y setter


    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
