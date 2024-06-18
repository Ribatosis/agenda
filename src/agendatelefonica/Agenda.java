package agendatelefonica;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contacto>contacto;
  private static final int numeroMaximo=10;

  public Agenda() {
    this.contacto = new ArrayList<>();
  }

  //metodos: añadirContacto(Contacto c), existeContacto(Conctacto c): ,listarContactos(): , buscaContacto(String nombre): ,eliminarContacto(Contacto c): ,agendaLlena():,espacioLibres ()

  public boolean agendaLlena(){
    return contacto.size()>=numeroMaximo; //numero maximo lo definiarriba como 10, esto devolvera un true o false acorde a la cantidad de elementos del arralist
  }

  public boolean existeContacto(Contacto c){
    return contacto.contains(c);//busco similiud en la lista contacto de tipo Contacto
  }



  public void añadirContacto(Contacto c) {

    if (existeContacto(c)) { // Verificar si el contacto ya existe
      System.out.println("El contacto con ese nombre ya existe");
    } else if (agendaLlena()) { // Verificar si la agenda está llena
      System.out.println("La agenda está llena, no se pueden añadir más contactos");
    } else {
      boolean encontrado = false;
      for (int i = 0; i < contacto.size() && !encontrado; i++) {
        if (contacto == null) { // Encontrar el primer espacio nulo
          contacto.add(c); // Añadir el contacto
          encontrado = true;
        }
      }

      if (encontrado) {
        System.out.println("Se ha añadido el contacto: " + c.getNombre().toUpperCase());
      } else {
        System.out.println("No se ha podido añadir el contacto");
      }
    }
  }

//  public boolean añadirContacto(Contacto c){ //se le debe ingresar un contacto a este metodo para que funcione
//    if(agendaLlena()){ //si esta llena tampoco se puede
//      System.out.println("la agenda se encuentra llena ha superado los 10 contactos, no se pueden añadir mas contactos ");
//      return false;
//    }
//    if (existeContacto(c)){//si existe tampoco se puede
//      System.out.println("el contacto ya existe, no se puede añadir ");
//      return false;
//    }//si al pasar los dos if realmente no entra entonces que se agrege
//      contacto.add(c);
//      System.out.println("el contacto "+c.getNombre().toUpperCase() +" ha sido agregado correctamente ");
//    return true;
//  }


  public void listarContactos() {
    if (contacto.isEmpty()) {
      System.out.println("La agenda esta vacia");
    } else {
      for (Contacto c : contacto) {
        System.out.println("nombre de contacto: "+c.getNombre().toUpperCase()+" numero de contacto: "+c.getTelefono());
      }
    }
  }

  public void buscarContacto(String nombre) {
    for (Contacto t : contacto) {
      if (t.getNombre().equals(nombre)) {
        System.out.println("el telefono de "+nombre+" es: "+t.getTelefono());
      }
    }
    System.out.println( "no se encontro el contacto, verifica si existe");
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
  public void espaciosLibres(){
    if(contacto.size()<numeroMaximo){
      System.out.println("el numero de espcios que queda son: "+(numeroMaximo-contacto.size()));
    }else {
      System.out.println("no hay espacios disponibles");
    }
  }







  }















