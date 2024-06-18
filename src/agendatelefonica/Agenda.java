package agendatelefonica;

import java.util.ArrayList;

public class Agenda {

  private ArrayList<Contacto>contacto;
  private int numeroMaximo;

  public Agenda(int tamaño) {
    this.contacto = new ArrayList<>();
    this.numeroMaximo = tamaño;
  }
  public Agenda(){
    this(10);//le doy un valor maximo al arraylist
  }

  //metodos: añadirContacto(Contacto c), existeContacto(Conctacto c): ,listarContactos(): , buscaContacto(String nombre): ,eliminarContacto(Contacto c): ,agendaLlena():,espacioLibres ()

  public boolean agendaLlena(){
    return contacto.size()>=numeroMaximo; //numero maximo lo definiarriba como 10, esto devolvera un true o false acorde a la cantidad de elementos del arralist
  }

  public boolean existeContacto(Contacto c){
    return contacto.contains(c);//busco similiud en la lista contacto de tipo Contacto
  }

  public boolean añadirContacto(Contacto c){ //se le debe ingresar un contacto a este metodo para que funcione
    if(agendaLlena()){ //si esta llena tampoco se puede
      System.out.println("la agenda se encuentra llena, no se pueden añadir mas contactos ");
      return false;
    }
    if (existeContacto(c)){//si existe tampoco se puede
      System.out.println("el contacto ya existe, no se puede añadir ");
      return false;
    }//si al pasar los dos if realmente no entra entonces que se agrege
      contacto.add(c);
      System.out.println("el contacto ha sido agregado correctamente ");
    return true;
  }
  public void listarContactos(){
    if(contacto.isEmpty()){
      System.out.println("La agenda esta vacia");
    }else {
      for (Contacto c:contacto){
        System.out.println(c);
      }
    }
  }












}
