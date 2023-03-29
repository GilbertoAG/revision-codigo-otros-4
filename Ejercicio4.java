// modificaciones 
// 1. Se importo la libreria java.util.Scanner para poder utilizar Scanner
// 2. Se agrego System.in como parametro en el objeto Scanner
// 3. Se modifico el texto que se imprime en la consola del Turno del jugador 1 a Turno del jugador 2
// 4. Se comento la linea 24 ya que el objeto Scanner s2 no es necesario.
// 5. Se modifico la linea 28 ya que al ser valores de tipo cadena (String) se debe utilizar .equals para realizar la comparacion en lugar de == que se utiliza para comparar si dos variables se refieren al mismo objeto, de igual forma se agrega un parentesis de inicio al segundo string
// 6. Se modifico la linea 35 ya que al ser valores de tipo cadena (String) se debe utilizar .equals para realizar la comparacion en lugar de == que se utiliza para comparar si dos variables se refieren al mismo objeto
// 7. Se modifico la linea 41 ya que al ser valores de tipo cadena (String) se debe utilizar .equals para realizar la comparacion en lugar de == que se utiliza para comparar si dos variables se refieren al mismo objeto
// 8. Se agrego la setencia break en los caso de piedra y papel en las lineas 39 y 45 respectivamente.
// 10. Se agrego una llave de cierre para evitar un error en la linea 43
// 11. Se cambio la cadena tijera ya que estaba escrita incorrectamente y debe ser tijeras.
package com.generation;

import java.util.Scanner;

public class Codigo4 {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);

    System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
    String j1 = s.nextLine();

    System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): "); 
    String j2 = s.nextLine();

    if (j1.equals(j2))
    {
      System.out.println("Empate");
    } else {
      int g = 2;
      switch (j1) {
        case "piedra":
          if (j2.equals("tijeras")) 
          {
            g = 1;
          }
          break;
        case "papel":
          if (j2.equals("piedra"))  
          {
            g = 1;
          } 
          break;
        case "tijeras": 
          if (j2.equals("papel")) {
            g = 1;
          }
          break;
          default:
      }
      System.out.println("Gana el jugador " + g);
    }

  }

}