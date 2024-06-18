package agendatelefonica;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contacto>contacto;
  private static final int numeroMaximo=10;

  public Agenda() {
    this.contacto = new ArrayList<>();
  }

  //metodos: añadirContacto(Contacto c), existeContacto(Conctacto c): ,listarContactos(): , buscaContacto(String nombre): ,eliminarContacto(Contacto c): ,agendaLlena():,espacioLibres ()

  public int getNumeroContactos() {
    return contacto.size();
  }

  public boolean agendaLlena(){
    return contacto.size()>=numeroMaximo; //numero maximo lo definiarriba como 10, esto devolvera un true o false acorde a la cantidad de elementos del arralist
  }

  public boolean existeContacto(Contacto c){
    return contacto.contains(c);//busco similiud en la lista contacto de tipo Contacto
  }

  public boolean añadirContacto(Contacto c){ //se le debe ingresar un contacto a este metodo para que funcione
    if(agendaLlena()){ //si esta llena tampoco se puede
      System.out.println("la agenda se encuentra llena ha superado los 10 contactos, no se pueden añadir mas contactos ");
      return false;
    }
    if (existeContacto(c)){//si existe tampoco se puede
      System.out.println("el contacto ya existe, no se puede añadir ");
      return false;
    }//si al pasar los dos if realmente no entra entonces que se agrege
    contacto.add(c);
    System.out.println("el contacto "+c.getNombre().toUpperCase() +" ha sido agregado correctamente ");
    return true;
  }

  public void listarContactos() {
    if (contacto.isEmpty()) {
      System.out.println("La agenda esta vacia");
    } else {
      for (Contacto c : contacto) {
        System.out.println("nombre de contacto: "+c.getNombre().toUpperCase()+" numero de contacto: "+c.getTelefono());
      }
    }
  }

  public Contacto buscarContacto(String nombre) {
    for (Contacto t : contacto) {
      if (t.getNombre().equalsIgnoreCase(nombre)) {
        return t;
      }
    }
    return null;
  }

  public boolean eliminarContacto(Contacto c){
    if(contacto.remove(c)){
      System.out.println("el contacto ha sido eliminado con exito.");
      return true;
    }else {
      System.out.println("el contacto no ha sido encontrado, verifique si existe");
      return false;
    }
  }
  public String espaciosLibres(){
    if(contacto.size()<numeroMaximo){
      return "el numero de espacios que quedan son: "+(numeroMaximo-contacto.size());
    }else {
      return "no hay espacios disponibles";
    }
  }

}
