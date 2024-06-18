package agendatelefonica;

import java.util.Scanner;

public class MenuInteractivo {
  Agenda miprimerAgenda=new Agenda();//tiene una capacidad de 10 contactos
public MenuInteractivo() {
  Contacto contacto1 = new Contacto(1234567654, "isabella");
  Contacto contacto2 = new Contacto(1234567890, "maria");
//  Contacto contacto3 = new Contacto("2784902837", "asdwe");
//  Contacto contacto4 = new Contacto("38745378498", "sdsd");
//  Contacto contacto5 = new Contacto("3333333333", "isabeasdalla");
//  Contacto contacto6 = new Contacto("333333222", "asd");
//  Contacto contacto7 = new Contacto("66666666", "asd");
//  Contacto contacto8 = new Contacto("88888887", "asd");
//  Contacto contacto9 = new Contacto("444444446", "asd");
//  Contacto contacto10 = new Contacto("44444446", "sadf");
//  Contacto contacto11 = new Contacto("444445", "xcvxczv");
//  Contacto contacto12 = new Contacto("4444445", "zvxcvewrew");

  miprimerAgenda.añadirContacto(contacto1);
  miprimerAgenda.añadirContacto(contacto2);
//  miprimerAgenda.añadirContacto(contacto3);
//  miprimerAgenda.añadirContacto(contacto4);
//  miprimerAgenda.añadirContacto(contacto5);
//  miprimerAgenda.añadirContacto(contacto6);
//  miprimerAgenda.añadirContacto(contacto7);
//  miprimerAgenda.añadirContacto(contacto8);
//  miprimerAgenda.añadirContacto(contacto9);
//  miprimerAgenda.añadirContacto(contacto10);
//  miprimerAgenda.añadirContacto(contacto11);// la agenda esta llena
//  miprimerAgenda.añadirContacto(contacto12);

//
//  System.out.println("listado de contactos: ");
//  miprimerAgenda.listarContactos();
//
//  miprimerAgenda.buscarContacto("maria");
//
//
//  miprimerAgenda.eliminarContacto(contacto1);
//
//  miprimerAgenda.espaciosLibres();
//
//  miprimerAgenda.listarContactos();

}
public void iniciarMenu() { //metodo
  Scanner teclado = new Scanner(System.in);
  while (true) {
    System.out.println("Bienvenido su agenda Telefonica");
    System.out.println("Menú:");
    System.out.println("1. Agregar un contacto");
    System.out.println("2. Buscar un contacto por su nombre");
    System.out.println("3. Mostrar la agenda completa");
    System.out.println("4. Verificar si existe un contacto");
    System.out.println("5. Eliminar un contacto");
    System.out.println("6. Verificar si la agenda esta llena");
    System.out.println("7. Espacios libres de la agenda");
    System.out.println("8. Sair de la libreria");
    int opcion = teclado.nextInt();
    switch (opcion) {
      case 1: //agregar un cotacto
        System.out.println("Ahora debes escribir los siguientes datos");
        System.out.println("Numero de telefono (debe tener minimo 10 digitos):");
        int numerotel = teclado.nextInt();
        teclado.nextLine();
        //validacion de numero celular
        while (String.valueOf(numerotel).length() < 10) {
          System.out.println("Número de teléfono inválido. Ingrese nuevamente:");
          numerotel = teclado.nextInt();
          teclado.nextLine();
        }

        System.out.println("Digite el nombre del contacto");
        String nombreContacto = teclado.nextLine();


        // validar si ya existe el contacto
        if (miprimerAgenda.buscarContacto(nombreContacto) != null) {
          System.out.println("El contacto ya existe en la agenda. No se puede añadir duplicado.");
        } else {
          // Crear el objeto Contacto y añadirlo a la agenda
          Contacto nuevoContacto = new Contacto(numerotel, nombreContacto);
          miprimerAgenda.añadirContacto(nuevoContacto);
//          System.out.println("Contacto " + nombreContacto.toUpperCase() + " ha sido añadido correctamente.");
        }
        break;

      case 2: //Buscar un contacto por su nombre
        System.out.println("Por favor ingresa el nombre del contacto que quieres buscar ");
        String nombreBus = teclado.nextLine();
        Contacto contactoBuscado = miprimerAgenda.buscarContacto(nombreBus);
          break;
      case 3://Mostrar la agenda completa
        System.out.println("Listado de contactos:");
      miprimerAgenda.listarContactos();
      break;

      case 4://Verificar si existe un contacto
        System.out.println("Ingrese el nombre del contacto a verificar:");
        nombreContacto = teclado.nextLine();
        Contacto contatobuscado = miprimerAgenda.buscarContacto(nombreContacto);
        break;
      case 5://  Eliminar un contacto
        System.out.println("Ingrese el nombre del contacto a eliminar:");
        nombreContacto = teclado.nextLine();
        Contacto borrarContacto = miprimerAgenda.buscarContacto(nombreContacto);//obtiene el contacto
        miprimerAgenda.eliminarContacto(borrarContacto); //borra el contacto
        break;
      case 6:  //Verificar si la agenda esta llena
        if(miprimerAgenda.agendaLlena()){
          System.out.println("la agenda esta llena");
        }else{
          System.out.println("la agenda no esta llena, puedes agregar mas contactos");
        }
        break;

      case 7: //  Espacios libres de la agenda
        String espacios=miprimerAgenda.espaciosLibres();
        break;
      case 8://salir
        System.out.println("estas saliendo del programa, gracias por utilizar la agenda del equipo 8 ");
        teclado.close();
        return;
      default:
        System.out.println("opcion invalida intente nuevamente");
        break;
    }
  }

}}
