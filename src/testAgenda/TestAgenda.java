package testAgenda;


import agendatelefonica.Agenda;
import agendatelefonica.Contacto;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAgenda {

  private Agenda agenda;

  @BeforeEach
  public void preparacion() {
    agenda = new Agenda();
  }

  @Test
  public void testAñadirContacto() {
    Contacto contacto1 = new Contacto(1234567654, "isabella");

    boolean añadido = agenda.añadirContacto(contacto1);

    assertTrue(añadido);
    assertEquals(1, agenda.getNumeroContactos());
  }

  @Test
  public  void testEliminarContacto(){
    Contacto contacto1 = new Contacto(1234567654, "isabella");

    boolean añadido = agenda.añadirContacto(contacto1);


  }
}
