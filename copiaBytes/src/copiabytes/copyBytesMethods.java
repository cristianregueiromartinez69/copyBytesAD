
package copiabytes;

import javax.swing.*;
import java.io.*;

/**
 * clase con los metodos de copia y añadir texto a ficheros
 * @author cristian
 * @version 1.0
 */
public class copyBytesMethods {

	/**
	 * metodo que copia texto de uno a otro
	 * @param pathFileSource el archivo origen
	 * @param pathFileDest el archivo destino
	 */
	public void copyFile(File pathFileSource, File pathFileDest) {

		//definimos un array de bytes
		byte[] buffer = new byte[1024];
		int longitudLeida;

		//iniciamos el try-catch y metemos lo introducido por parametro
		try (FileInputStream fis = new FileInputStream(pathFileSource);
				FileOutputStream fos = new FileOutputStream(pathFileDest)) {

			//mientras la variable de longitud, la cual es igual a los bytes leidos sea diferente de -1, escribe los bytes en el nuevo fichero
			while ((longitudLeida = fis.read(buffer)) != -1) {

				/**
				 * aqui se definen 3 cosas
				 * 1. primer parametro: Los bytes a copias
				 * 2. el inicio de los bytes
				 * 3. los bytes leidos
				 */
				fos.write(buffer, 0, longitudLeida);
			}
                        fos.close();
                        
			System.out.println("Archivo copiado con éxito.");

		} catch (IOException e) {
			System.out.println("Ha ocurrido un error a la hora de escribir el fichero");
			e.printStackTrace();
		}

	}


	/**
	 * metodo que añade texto de uno a otro
	 * @param pathFileSource el archivo origen
	 * @param pathFileDest el archivo destino
	 */
	public void appendFile(File pathFileSource, File pathFileDest) {

		//definimos un array de bytes
		byte[] buffer = new byte[1024];
		int longitudLeida;

		//iniciamos el try-catch y metemos lo introducido por parametro
		try (FileInputStream fis = new FileInputStream(pathFileSource);
				FileOutputStream fos = new FileOutputStream(pathFileDest, true)) {
			fos.write(System.lineSeparator().getBytes());
			//mientras la variable de longitud, la cual es igual a los bytes leidos sea diferente de -1, escribe los bytes en el nuevo fichero
			while ((longitudLeida = fis.read(buffer)) != -1) {
				/**
				 * aqui se definen 3 cosas
				 * 1. primer parametro: Los bytes a copias
				 * 2. el inicio de los bytes
				 * 3. los bytes leidos
				 */
				fos.write(buffer, 0, longitudLeida);
			}
			fos.close();

			System.out.println("Archivo añadido con éxito.");

		} catch (IOException e) {
			System.out.println("Ha ocurrido un error a la hora de añadir texto a el fichero");
			e.printStackTrace();
		}

	}

}
