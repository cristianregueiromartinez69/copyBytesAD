package copiabytes;

import javax.swing.*;
import java.io.File;

/**
 * clase menu donde eligiremos lo que queramos
 * @author cristian
 * @version 1.0
 */
public class Menu {

	/**
	 * objetos que usamos mas adelante
	 */
    copyBytesMethods copy = new copyBytesMethods();
    File myFile;
    File myFile2;
    /**
     * metodo del menu
     */
    public void mainMenu() {

    	String pregunta = "si";
    	String afirmar = "si";
    	String negar = "no";

    	/**
    	 * mientras la respuesta sea sí, se mete en el codigo
    	 */
    	while(pregunta.equalsIgnoreCase(afirmar)) {
    		/**
    		 * preguntamos que opcion quiere
    		 */
    		int opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido a copyBytes, introduce una opcion: " +
                    "\nOpcion 1: Copiar fichero texto1.txt en texto2.txt" +
                    "\nOpcion 2: Añadir el texto1.txt en texto2.txt (sin remplazarlo, solo añadir)" +
                    "\nOpcion 3: Salir de la aplicacion"));
                
                while(opcion > 3 || opcion < 1){
                    /**
    		 * preguntamos que opcion quiere otra vez por si se equivoca
    		 */
    		 opcion = Integer.parseInt(JOptionPane.showInputDialog("Opcion incorrecta, por favor, introduce una opcion: " +
                    "\nOpcion 1: Copiar fichero texto1.txt en texto2.txt" +
                    "\nOpcion 2: Añadir el texto1.txt en texto2.txt (sin remplazarlo, solo añadir)" +
                    "\nOpcion 3: Salir de la aplicacion"));
                }
    		  switch (opcion) {
    		  /**
    		   * llamamos a los metodos
    		   */
              case 1:
                  copy.copyFile(myFile = new File("/home/dam/Desktop/ejerciciosEntregar/accesoADatos/copyBytesTexto/texto1.txt"),
                          myFile2 = new File("/home/dam/Desktop/ejerciciosEntregar/accesoADatos/copyBytesTexto/texto2.txt"));
                  break;
              case 2:
            	  copy.appendFile(myFile = new File("/home/dam/Desktop/ejerciciosEntregar/accesoADatos/copyBytesTexto/texto1.txt"),
                  myFile2 = new File("/home/dam/Desktop/ejerciciosEntregar/accesoADatos/copyBytesTexto/texto2.txt"));

                  break;
              case 3:
                  System.exit(0);
          }

                  
    		pregunta = JOptionPane.showInputDialog("Quieres volver a usar una opcion?" +
    		"\nresponde (si) si quieres, responde (no) si no quieres");
    	}




    }
}

