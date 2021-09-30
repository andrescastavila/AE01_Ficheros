package es.florida.AE01_Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Date;


public class App {
	
	
	
	
	
	
	
	public static void main(String[] args) {
	

		
		
	}
	
	public void getInformacion() {
		File fichero = new File("Ejemplo_T0_File.txt");
		Fichero fichero1 = new Fichero();
		fichero1.setNombre(fichero.getName());
		fichero1.setTipo(fichero.isDirectory());
		fichero1.setUbi(fichero.getAbsolutePath());
		fichero1.setFecha(fichero.lastModified());
		fichero1.setOculto(fichero.isHidden());
		if(fichero1.getTipo()==false) {
			fichero1.setTamanyo(fichero.length());
			System.out.println(fichero1.getNombre());
			System.out.println("Es directorio");
			System.out.println(fichero1.getUbi());
			System.out.println(fichero1.getFecha());
			System.out.println(fichero1.getOculto());
			System.out.println(fichero1.getTamanyo());
		}else {
			String[] lista=fichero.list();
			for(String elemento : lista) {
				fichero1.setElementos(elemento);
			}
			fichero1.setEspacioLibre(fichero.getFreeSpace());
			fichero1.setEspacioDisponible(fichero.getUsableSpace());
			fichero1.setEspacioTotal(fichero.getTotalSpace());
			System.out.println(fichero1.getNombre());
			System.out.println("Es fitxer");
			System.out.println(fichero1.getUbi());
			System.out.println(fichero1.getFecha());
			System.out.println(fichero1.getOculto());
			System.out.println(fichero1.getElementos());
			System.out.println(fichero1.getEspacioLibre());
			System.out.println(fichero1.getEspacioDisponible());
			System.out.println(fichero1.getEspacioTotal());
		}
	}
	
	public void crearCarpeta() {
		File directorio = new File(".");
		if(!directorio.exists()) {
			if(directorio.mkdirs()) {
				System.out.println("Directorio creado. ");
			}else {
				System.out.println("Error al crear el directorio");
			}
		}
	}
	
	public void crearFichero() {
		File fichero = new File("C:\\Users\\andre\\eclipse-workspace\\AE01_Ficheros\\bin\\es\\florida\\AE01_Ficheros");
		try {
			if(fichero.createNewFile()) {
				System.out.println("Fichero creado correctamente. ");
			}else {
				System.out.println("Error al crear el fichero");
			}
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void elimina(File fichero) {
		if(!fichero.exists()) {
			System.out.println("El archivo no existe");
		}else {
			fichero.delete();
			System.out.println("El archivo fue eliminado");
		}
	}
	
	
}
