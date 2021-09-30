package es.florida.AE01_Ficheros;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class App {
	
	
	
	
	
	
	
	public static void main(String[] args) {
	
		File directorio = new File(".");
		String respuesta;
		System.out.println("INFORMACION: ");
		getInformacion(directorio);
		gestioErrors(directorio);
		Scanner teclado = new Scanner(System.in);
		System.out.print("Deseas crear una carpeta o un fichero?: ");
		respuesta=teclado.next();
		if(respuesta=="Carpeta"||respuesta=="carpeta") {
			crearCarpeta(directorio);
			gestioErrors(directorio);
		}else if(respuesta=="Fichero"||respuesta=="fichero") {
			crearFichero(directorio);
		}else if(respuesta=="No"||respuesta=="no") {
			System.out.print("Deseas borrar el archivo?: ");
			respuesta=teclado.next();
			if(respuesta=="Si"||respuesta=="si") {
				elimina(directorio);
				gestioErrors(directorio);
			}else if(respuesta=="No"||respuesta=="no") {
				System.out.print("Deseas renombrar el archivo?: ");
				respuesta=teclado.next();
				if(respuesta=="Si"||respuesta=="si") {
					renombra(directorio);
					gestioErrors(directorio);
				}else if(respuesta=="No"||respuesta=="no") {
					System.out.println("No has realizado ningun cambio");
				}else {
					System.out.println("No he entendido la orden. ");
				}
			}else {
				System.out.println("No he entendido la orden. ");
			}
		}else {
			System.out.println("No he entendido la orden. ");
		}
		teclado.close();
	}
	
	public static void getInformacion(File fichero) {
		
		Fichero fichero1 = new Fichero();
		fichero1.setNombre(fichero.getName());
		fichero1.setTipo(fichero.isDirectory());
		fichero1.setUbi(fichero.getAbsolutePath());
		fichero1.setFecha(fichero.lastModified());
		fichero1.setOculto(fichero.isHidden());
		if(fichero1.getTipo()==false) {
			fichero1.setTamanyo(fichero.length());
			System.out.println("El nombre del fichero es: "+fichero1.getNombre());
			System.out.println("Es directorio");
			System.out.println("Su ubicacion es: "+fichero1.getUbi());
			System.out.println("La ultima modificacion fue: "+fichero1.getFecha());
			System.out.println("Es un archivo oculto?: "+fichero1.getOculto());
			System.out.println("Su tamaño es de "+fichero1.getTamanyo()+" bytes.");
		}else {
			String[] lista=fichero.list();
			for(String elemento : lista) {
				fichero1.setElementos(elemento);
			}
			fichero1.setEspacioLibre(fichero.getFreeSpace());
			fichero1.setEspacioDisponible(fichero.getUsableSpace());
			fichero1.setEspacioTotal(fichero.getTotalSpace());
			System.out.println("El nombre del fichero es: "+fichero1.getNombre());
			System.out.println("Es fitxer");
			System.out.println("Su ubicacion es: "+fichero1.getUbi());
			System.out.println("La ultima modificacion fue: "+fichero1.getFecha());
			System.out.println("Es un archivo oculto?: "+fichero1.getOculto());
			System.out.println("Estos son sus elementos: "+fichero1.getElementos());
			System.out.println("El espacio libre es de "+fichero1.getEspacioLibre()+" bytes");
			System.out.println("El espacio disponible es de: "+fichero1.getEspacioDisponible()+" bytes");
			System.out.println("El espacio total es de: "+fichero1.getEspacioTotal()+" bytes");
		}
	}
	
	public static void crearCarpeta(File directorio) {
	
		if(!directorio.exists()) {
			if(directorio.mkdirs()) {
				System.out.println("Directorio creado. ");
			}else {
				System.out.println("Error al crear el directorio");
			}
		}
	}
	
	public static void crearFichero(File fichero) {
		fichero = new File("C:\\Users\\andre\\eclipse-workspace\\AE01_Ficheros\\bin\\es\\florida\\AE01_Ficheros");
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
	
	public static void renombra(File f1) {
		 f1 = new File("fichero1.txt");
		File f2 = new File("fichero2.txt");
		if(f1.renameTo(f2)) {
			System.out.println("Archivo renombrado correctamente. ");
		}else {
			System.out.println("Error al renombrar el archivo");
		}
	}
	
	public static void gestioErrors(File fichero) {
		if(fichero.exists()) {
			if(fichero.canRead()) {
				System.out.println("Tienes permisos de lectura. ");
			}else {
				System.out.println("No tienes permisos de lectura. ");
			}
			
			
			if(fichero.canWrite()) {
				System.out.println("Tienes permisos de escritura");
			}else {
				System.out.println("No tienes permisos de escritura");
			}
			
		}else {
			System.out.println("El archivo no existe. ");
		}
	}
	
	
}
