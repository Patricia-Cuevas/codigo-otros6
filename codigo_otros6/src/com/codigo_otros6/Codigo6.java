package com.codigo_otros6;

public class Codigo6 { // se pone la clase con mayuscula 
	public static void main(String[] args) { // se pone el main
 
	  
    int[] n = new int[20]; //se agrega new

    for (int i = 0; i < 20; i++) { //son dos ++ en vez de uno
      n[i] = (int)(Math.random() * 381) + 20;
      System.out.print(n[i] + " "); //agregar out en System
    }
    
    System.out.println("\n¿Qué números quiere resaltar? "); //falta n 
    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); //falta "ln"
    int opcion = Integer.parseInt(System.console().readLine()); //falta cerrar un parentesis

    int multiplo = (opcion == 1) ? 5 : 7; // se intercambian el ? y el :

    for (int e : n) { //es solo for y se cambia por "int"
      if (e % multiplo == 0) {
        System.out.print("[" + e + "] ");
      } else { //falta una llave
        System.out.print(e + " "); // se cambia por out
      }
    }
  }
}
