package agendatelefonica;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//    Agenda miprimerAgenda=new Agenda();//tiene una capacidad de 10 contactos
//
//    Contacto contacto1= new Contacto("311567878","isabella");
//    Contacto contacto2=new Contacto("322874563","maria");
//    Contacto contacto3= new Contacto("2784902837","asdwe");
//    Contacto contacto4=new Contacto("38745378498","sdsd");
//    Contacto contacto5= new Contacto("3333333333","isabeasdalla");
//    Contacto contacto6=new Contacto("333333222","asd");
//    Contacto contacto7= new Contacto("66666666","asd");
//    Contacto contacto8=new Contacto("88888887","asd");
//    Contacto contacto9= new Contacto("444444446","asd");
//    Contacto contacto10=new Contacto("44444446","sadf");
//    Contacto contacto11= new Contacto("444445","xcvxczv");
//    Contacto contacto12=new Contacto("4444445","zvxcvewrew");
//
//    miprimerAgenda.añadirContacto(contacto1);
//    miprimerAgenda.añadirContacto(contacto2);
//    miprimerAgenda.añadirContacto(contacto3);
//    miprimerAgenda.añadirContacto(contacto4);
//    miprimerAgenda.añadirContacto(contacto5);
//    miprimerAgenda.añadirContacto(contacto6);
//    miprimerAgenda.añadirContacto(contacto7);
//    miprimerAgenda.añadirContacto(contacto8);
//    miprimerAgenda.añadirContacto(contacto9);
//    miprimerAgenda.añadirContacto(contacto10);
//    miprimerAgenda.añadirContacto(contacto11);// la agenda esta llena
//    miprimerAgenda.añadirContacto(contacto12);


//    System.out.println("listado de contactos: ");
//    miprimerAgenda.listarContactos();

//   miprimerAgenda.buscarContacto("maria");
//
//
//   miprimerAgenda.eliminarContacto(contacto1);
//
//   miprimerAgenda.espaciosLibres();
//
//   miprimerAgenda.listarContactos();

    Scanner sn = new Scanner(System.in);

    Agenda miprimerAgenda=new Agenda();
    String nombre;
    int telefono;
    Contacto c;

    System.out.println("Escribe un nombre");
    nombre = sn.next();

    System.out.println("Escribe un telefono");
    telefono = sn.nextInt();

    c = new Contacto(nombre, telefono);

    miprimerAgenda.addContacto(c);
  }
}
