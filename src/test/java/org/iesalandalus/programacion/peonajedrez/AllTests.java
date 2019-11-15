package org.iesalandalus.programacion.peonajedrez;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ ColorTest.class, DireccionTest.class, PosicionTest.class, PeonTest.class })

public class AllTests {

}
en el set en posicion comprobar que no sea menor que 1 ni mayor que 8(illegarArgumentException)
set color comprobar que no sea null nullPointedException
si los pasos son menor que 0 o mayor que 2 illegalArgumentException
menu en bucle que tenga (mostrar peon,mostrarmenu,elejir opcion,ejecutar opcion)